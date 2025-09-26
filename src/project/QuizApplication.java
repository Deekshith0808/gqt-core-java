/**
 * @author sai deekshith
 * @Category
 * @discription
 */
package project;
import java.util.Scanner;


class quizGame {
    Scanner sc = new Scanner(System.in);

    String questions[];
    String options[][];
    char answers[];
    int prizes[];
    boolean audienceused = false;
    boolean fiftyused = false;
    int won = 0;

    // colors
    String reset = "\u001B[0m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";
    String blue = "\u001B[34m";
    String green = "\u001B[32m";
    String purple = "\u001B[35m";
    String red = "\u001B[31m";
    String lifelinecolor = "\u001B[94m";

    void createquestions() {
        questions = new String[10];
        questions[0] = "Which package is automatically imported in every Java program?";
        questions[1] = "Which keyword is used to inherit a class in Java?";
        questions[2] = "Which exception is thrown when a number is divided by zero?";
        questions[3] = "Which of the following is not a primitive data type in Java?";
        questions[4] = "How do you create a single-line comment in Java?";
        questions[5] = "Which keyword is used to prevent inheritance in Java?";
        questions[6] = "Which keyword is used to handle exceptions?";
        questions[7] = "Which of these is not a loop control statement in Java?";
        questions[8] = "Which class is the parent of all Java classes?";
        questions[9] = "What is the output type of System.out.println()?";

        options = new String[10][4];
        options[0][0] = "java.util";
        options[0][1] = "interface";
        options[0][2] = "java.lang";
        options[0][3] = "implement";

        options[1][0] = "super";
        options[1][1] = "inherites";
        options[1][2] = "32 bits";
        options[1][3] = "extends";

        options[2][0] = "ArithmeticException";
        options[2][1] = "Dexception";
        options[2][2] = "main()";
        options[2][3] = "init()";

        options[3][0] = "String";
        options[3][1] = "new";
        options[3][2] = "this";
        options[3][3] = "void";

        options[4][0] = "/*comment*/";
        options[4][1] = "//comment";
        options[4][2] = "value-2";
        options[4][3] = "--comment";

        options[5][0] = "abstract";
        options[5][1] = "final";
        options[5][2] = "super";
        options[5][3] = "null";

        options[6][0] = "try";
        options[6][1] = "throw";
        options[6][2] = "catch";
        options[6][3] = "All of the above";

        options[7][0] = "continue";
        options[7][1] = "break";
        options[7][2] = "exit";
        options[7][3] = "Java Verified Machine";

        options[8][0] = "Object";
        options[8][1] = "Class";
        options[8][2] = "system";
        options[8][3] = "Main";

        options[9][0] = "Input";
        options[9][1] = "Output";
        options[9][2] = "error";
        options[9][3] = "Stram";

        answers = new char[10];
        answers[0] = 'C';
        answers[1] = 'D';
        answers[2] = 'A';
        answers[3] = 'A';
        answers[4] = 'D';
        answers[5] = 'B';
        answers[6] = 'D';
        answers[7] = 'C';
        answers[8] = 'A';
        answers[9] = 'B';

        prizes = new int[10];
        prizes[0] = 1000;
        prizes[1] = 2000;
        prizes[2] = 5000;
        prizes[3] = 7000;
        prizes[4] = 9000;
        prizes[5] = 13000;
        prizes[6] = 17000;
        prizes[7] = 25000;
        prizes[8] = 35000;
        prizes[9] = 50000;
    }

    void collectname() {
        System.out.println(cyan + "--------------------------------------------");
        System.out.println(yellow + " WELCOME TO THE JAVA QUIZ CHALLENGE ");
        System.out.println(cyan + "--------------------------------------------");
        System.out.println(blue + " RULES:");
        System.out.println("1. You will be asked 10 questions.");
        System.out.println("2. Each correct answer earns you 10000 rupees.");
        System.out.println("3. If you answer incorrectly, the game ends.");
        System.out.println("4. If your answer is incorrect between Q1-Q5, you get nothing.");
        System.out.println("5. If your answer is incorrect between Q6-Q7, you get the amount till Q5.");
        System.out.println("6. If your answer is incorrect between Q8-Q10, you get the amount till Q7.");
        System.out.println("7. You have two lifelines: '50-50' and 'Audience poll'.");
        System.out.println("8. Each lifeline can be used only once.");
        System.out.println("9. If you quit, you take home the amount earned so far.");
        System.out.println("10. If you answer all questions correctly, you win the game.");
        System.out.println("--------------------------------------------"+reset);
        
    }

    void displayquestions() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--------------------------------------------");
            System.out.println(yellow+"Q" + (i + 1) + ": " + questions[i]+reset);
            for (int j = 0; j < 4; j++) {
                System.out.println(cyan+(char) ('A' + j) + ". " + options[i][j]+reset);
            }
            System.out.print(yellow + " Lifelines: ");
            System.out.print("[1] Audience poll" + (audienceused ? red + " (used)" : ""));
            System.out.print(yellow + " | [2] 50-50" + (fiftyused ? red + " (used)" : ""));
            System.out.println(yellow + " | [3] Quit");
            System.out.print(cyan + "Your choice (A/B/C/D or 1/2/3): ");
            String input = sc.next();

            if (input.equals("3")) {
                System.out.println(purple + " You quit with ₹" + won);
                break;
            }

            if (input.equals("1")) {
                if (audienceused) {
                    System.out.println(red + " Audience poll already used!");
                    i--;
                    continue;
                }
                audienceused = true;
                showaudiencepoll(i);
                i--;
                continue;
            }

            if (input.equals("2")) {
                if (fiftyused) {
                    System.out.println(red + " 50-50 already used!");
                    i--;
                    continue;
                }
                fiftyused = true;
                showfiftyfifty(i);
                i--;
                continue;
            }

            if (input.equalsIgnoreCase(String.valueOf(answers[i]))) {
                won = prizes[i];
                System.out.println(green + " Correct! You now have " + won);
            } else if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B") ||
                       input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D")) {
                System.out.println(red + " Wrong!");
                if (i < 5) won = 0;
                else if (i < 8) won = prizes[4];
                else won = prizes[6];
                System.out.println(red + " You take home " + won);
                break;
            } else {
                System.out.println(red + " Invalid input!");
                i--;
            }
        }
    }

    void showaudiencepoll(int qindex) {
        char correctans = answers[qindex];
        System.out.println(lifelinecolor + " Audience Poll Results:");
        for (int j = 0; j < 4; j++) {
            char opt = (char) ('A' + j);
            int percent = (opt == correctans) ? 80 : (j == 0 ? 10 : (j == 1 ? 5 : 5));
            System.out.println(opt + ": " + percent + "%");
        }
    }

    void showfiftyfifty(int qindex) {
        System.out.println(lifelinecolor + " 50-50 Lifeline:");
        char correctans = answers[qindex];
        System.out.println(correctans + ". " + options[qindex][correctans - 'A']);
        for (int j = 0; j < 4; j++) {
            char opt = (char) ('A' + j);
            if (opt != correctans) {
                System.out.println(opt + ". " + options[qindex][j]);
                break;
            }
        }
   }

    void displayfinalresult() {
        System.out.println(purple + " Game Over!  you won " + won);
    }
}

public class QuizApplication {
    public static void main(String[] args) {
        quizGame q = new quizGame();
        q.createquestions();
        q.collectname();
        q.displayquestions();
        q.displayfinalresult();
    }
}
