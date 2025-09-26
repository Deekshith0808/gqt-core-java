package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizWithSwings extends JFrame implements ActionListener {

    String[] questions;
    String[][] options;
    char[] answers;
    int[] prizes;

    int currentQuestion = 0;
    int score = 0;
    boolean lifeline50Used = false;
    boolean audiencePollUsed = false;

    JLabel questionLabel;
    JRadioButton[] optionButtons = new JRadioButton[4];
    ButtonGroup optionsGroup = new ButtonGroup();
    JButton submitButton, fiftyButton, pollButton, quitButton;

    public QuizWithSwings() {
        setTitle("Java Quiz Game");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeData();
        setupGUI();
        displayQuestion();

        setVisible(true);
    }

    void initializeData() {
        questions = new String[]{
            "Which package is automatically imported in every Java program?",
            "Which keyword is used to inherit a class in Java?",
            "Which exception is thrown when a number is divided by zero?",
            "Which of the following is not a primitive data type in Java?",
            "How do you create a single-line comment in Java?",
            "Which keyword is used to prevent inheritance in Java?",
            "Which keyword is used to handle exceptions?",
            "Which of these is not a loop control statement in Java?",
            "Which class is the parent of all Java classes?",
            "What is the output type of System.out.println()?"
        };

        options = new String[][]{
            {"java.util", "interface", "java.lang", "implement"},
            {"super", "inherites", "32 bits", "extends"},
            {"ArithmeticException", "Dexception", "main()", "init()"},
            {"String", "new", "this", "void"},
            {"/*comment*/", "//comment", "value-2", "--comment"},
            {"abstract", "final", "super", "null"},
            {"try", "throw", "catch", "All of the above"},
            {"continue", "break", "exit", "Java Verified Machine"},
            {"Object", "Class", "system", "Main"},
            {"Input", "Output", "error", "Stram"}
        };

        answers = new char[]{'C', 'D', 'A', 'A', 'B', 'B', 'D', 'C', 'A', 'B'};
        prizes = new int[]{1000, 2000, 5000, 7000, 9000, 13000, 17000, 25000, 35000, 50000};
    }

    void setupGUI() {
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        questionLabel = new JLabel("Question", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        topPanel.add(questionLabel);

        JPanel optionPanel = new JPanel(new GridLayout(4, 1));
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            optionsGroup.add(optionButtons[i]);
            optionPanel.add(optionButtons[i]);
        }

        JPanel bottomPanel = new JPanel();
        submitButton = new JButton("Submit");
        fiftyButton = new JButton("50-50");
        pollButton = new JButton("Audience Poll");
        quitButton = new JButton("Quit");

        submitButton.addActionListener(this);
        fiftyButton.addActionListener(this);
        pollButton.addActionListener(this);
        quitButton.addActionListener(this);

        bottomPanel.add(submitButton);
        bottomPanel.add(fiftyButton);
        bottomPanel.add(pollButton);
        bottomPanel.add(quitButton);

        add(topPanel, BorderLayout.NORTH);
        add(optionPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    void displayQuestion() {
        optionsGroup.clearSelection();
        if (currentQuestion < questions.length) {
            questionLabel.setText("Q" + (currentQuestion + 1) + ": " + questions[currentQuestion]);
            for (int i = 0; i < 4; i++) {
                optionButtons[i].setText((char) ('A' + i) + ". " + options[currentQuestion][i]);
                optionButtons[i].setVisible(true);
            }
        } else {
            showFinalScore();
        }
    }

    void useFiftyFifty() {
        if (lifeline50Used) {
            JOptionPane.showMessageDialog(this, "50-50 already used!");
            return;
        }

        lifeline50Used = true;
        char correct = answers[currentQuestion];
        int correctIndex = correct - 'A';
        int removed = 0;

        for (int i = 0; i < 4; i++) {
            if (i != correctIndex && removed < 2) {
                optionButtons[i].setVisible(false);
                removed++;
            }
        }
    }

    void useAudiencePoll() {
        if (audiencePollUsed) {
            JOptionPane.showMessageDialog(this, "Audience poll already used!");
            return;
        }

        audiencePollUsed = true;
        char correct = answers[currentQuestion];
        String message = "Audience Poll:\n";
        for (int i = 0; i < 4; i++) {
            char opt = (char) ('A' + i);
            int percent = (opt == correct) ? 80 : 5;
            message += opt + ": " + percent + "%\n";
        }

        JOptionPane.showMessageDialog(this, message);
    }

    void checkAnswer() {
        char selected = 0;
        for (int i = 0; i < 4; i++) {
            if (optionButtons[i].isSelected()) {
                selected = (char) ('A' + i);
                break;
            }
        }

        if (selected == 0) {
            JOptionPane.showMessageDialog(this, "Please select an option.");
            return;
        }

        if (selected == answers[currentQuestion]) {
            score = prizes[currentQuestion];
            JOptionPane.showMessageDialog(this, "Correct! You've won ₹" + score);
            currentQuestion++;
            displayQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Answer!\nYou take home ₹" + getFinalPrize());
            System.exit(0);
        }
    }

    int getFinalPrize() {
        if (currentQuestion < 5) return 0;
        else if (currentQuestion < 8) return prizes[4];
        else return prizes[6];
    }

    void showFinalScore() {
        JOptionPane.showMessageDialog(this, "Congratulations! You won ₹" + score);
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            checkAnswer();
        } else if (e.getSource() == fiftyButton) {
            useFiftyFifty();
        } else if (e.getSource() == pollButton) {
            useAudiencePoll();
        } else if (e.getSource() == quitButton) {
            JOptionPane.showMessageDialog(this, "You quit the game with ₹" + score);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizWithSwings();
    }
}
