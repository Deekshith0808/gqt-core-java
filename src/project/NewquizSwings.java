package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewquizSwings extends JFrame implements ActionListener {

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

    JPanel questionPanel, optionsPanel, lifelinePanel;

    public NewquizSwings() {
        setTitle("---------Java Quiz Game-----------");
        setSize(700, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

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
        // Question Panel
        questionPanel = new JPanel();
        questionPanel.setBackground(new Color(45, 52, 54));
        questionLabel = new JLabel("Question");
        questionLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        questionLabel.setForeground(Color.WHITE);
        questionPanel.add(questionLabel);
        add(questionPanel, BorderLayout.NORTH);

        // Options Panel
        optionsPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        optionsPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        optionsPanel.setBackground(new Color(223, 230, 233));
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            optionButtons[i].setBackground(new Color(223, 230, 233));
            optionButtons[i].setFont(new Font("SansSerif", Font.PLAIN, 16));
            optionsGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        // Lifeline Panel
        lifelinePanel = new JPanel();
        lifelinePanel.setBackground(new Color(45, 52, 54));
        lifelinePanel.setLayout(new FlowLayout());

        submitButton = createButton("Submit", new Color(46, 204, 113));
        fiftyButton = createButton("50-50", new Color(241, 196, 15));
        pollButton = createButton("Audience", new Color(52, 152, 219));
        quitButton = createButton("Quit", new Color(231, 76, 60));

        lifelinePanel.add(submitButton);
        lifelinePanel.add(fiftyButton);
        lifelinePanel.add(pollButton);
        lifelinePanel.add(quitButton);

        add(lifelinePanel, BorderLayout.SOUTH);
    }

    JButton createButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(130, 40));
        button.addActionListener(this);
        return button;
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
            JOptionPane.showMessageDialog(this, "50-50 lifeline already used!", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }

        lifeline50Used = true;
        fiftyButton.setEnabled(false);
        char correct = answers[currentQuestion];
        int correctIndex = correct - 'A';
        int hidden = 0;

        for (int i = 0; i < 4 && hidden < 2; i++) {
            if (i != correctIndex) {
                optionButtons[i].setVisible(false);
                hidden++;
            }
        }
    }

    void useAudiencePoll() {
        if (audiencePollUsed) {
            JOptionPane.showMessageDialog(this, "Audience Poll already used!", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }

        audiencePollUsed = true;
        pollButton.setEnabled(false);

        char correct = answers[currentQuestion];
        StringBuilder message = new StringBuilder("Audience Poll:\n\n");
        for (int i = 0; i < 4; i++) {
            char opt = (char) ('A' + i);
            int percent = (opt == correct) ? 80 : (int) (Math.random() * 10 + 5);
            message.append(opt).append(": ").append(percent).append("%\n");
        }

        JOptionPane.showMessageDialog(this, message.toString(), "Audience Poll", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "Please select an option!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selected == answers[currentQuestion]) {
            score = prizes[currentQuestion];
            JOptionPane.showMessageDialog(this, "Correct! You've won ₹" + score, "Correct", JOptionPane.INFORMATION_MESSAGE);
            currentQuestion++;
            displayQuestion();
        } else {
            JOptionPane.showMessageDialog(this, " Wrong Answer!\nYou take home ₹" + getFinalPrize(), "Wrong", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    int getFinalPrize() {
        if (currentQuestion < 5) return 0;
        else if (currentQuestion < 8) return prizes[4];
        else return prizes[6];
    }

    void showFinalScore() {
        JOptionPane.showMessageDialog(this, "Congratulations!\nYou won ₹" + score, "Game Over", JOptionPane.PLAIN_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "You quit the game with ₹" + score, "Quit", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NewquizSwings());
    }
}


