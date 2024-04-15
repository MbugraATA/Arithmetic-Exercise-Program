package calculationchallange;

import java.util.Scanner;

public class CalculationChallange {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        welcome();
        enterOrQuit();
        firstLevel();
        timeIsUp();
        System.out.println("Congratulations, You've earned the right to go to the next level");
        System.out.println("If you want to repeat first level you must enter 'r' or if you want to upgrade your level you must enter 'u'");
        String entery = scn.nextLine();
        if (entery.equalsIgnoreCase("r")) {
            firstLevel();
        } else if (entery.equalsIgnoreCase("u")) {
            secoondLevel();

        }

        timeIsUp();

    }

    public static void firstLevel() {
        Scanner scn = new Scanner(System.in);

        int correctAnswer = 0;
        int question = 1;
        int trueQuestion = 0;
        int trueQuestionRow = 0;
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 90000;

        int userAnswer = 0;

        while (System.currentTimeMillis() < endTime) {
            if (trueQuestionRow % 3 == 0) {
                MotivationMessage(trueQuestionRow);
            }
            System.out.print("Q" + question + " ");
            if (trueQuestionRow != 0 && trueQuestionRow % 5 == 0) {
                endTime = endTime + 5 * 1000;
                System.out.println("You won 5 secs");
            }

            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            int fourOperations = (int) (Math.random() * 4 + 1);
            switch (fourOperations) {
                case 1:
                    correctAnswer = number1 + number2;
                    System.out.print(number1 + " + " + number2 + " = ");
                    userAnswer = scn.nextInt();

                    break;
                case 2:
                    correctAnswer = number1 - number2;
                    System.out.print(number1 + " - " + number2 + " = ");
                    userAnswer = scn.nextInt();

                    break;
                case 3:
                    correctAnswer = number1 / number2;
                    System.out.print(number1 + " / " + number2 + " = ");
                    userAnswer = scn.nextInt();

                    break;
                case 4:
                    correctAnswer = number1 * number2;
                    System.out.print(number1 + " * " + number2 + " = ");
                    userAnswer = scn.nextInt();

            }
            if (userAnswer == correctAnswer) {
                trueQuestion++;
                trueQuestionRow++;
                System.out.println("CORRECT");

            } else {
                System.out.println("WRONG");
                trueQuestionRow = 0;
            }

            question++;

        }
        long remainingTime = (System.currentTimeMillis() - startTime);
        System.out.println("Correct Answers: " + trueQuestion);
        System.out.println("Total Question: " + (question - 1));
        System.out.println("total second " + (remainingTime / 1000) + " second");

        if (trueQuestion < 10) {
            System.out.println("You are as fast as a turtle!");
            System.out.println("Sorry!!! You cannot advance to the next level due to insufficient score!");
            System.out.println("Correct Answers: " + trueQuestion);
            System.out.println("Total Question: " + (question - 1));
            System.out.println("total second " + (remainingTime / 1000) + " second");
            System.exit(1);

        }

    }

    public static void secoondLevel() {
        Scanner scn = new Scanner(System.in);

        int userAnswer = 0;
        int correctAnswer = 0;
        int trueQuestion = 0;
        int trueQuestionRow = 0;
        int question = 1;
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 90000;
        if (trueQuestionRow != 0 && trueQuestionRow == 5) {
            endTime = endTime + 5 * 1000;
            System.out.println("You won 5 secs");
        }

        while (System.currentTimeMillis() < endTime) {
            if (trueQuestionRow % 3 == 0) {
                MotivationMessage(trueQuestionRow);
            }
            System.out.print("Q" + question + " ");
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            int number3 = (int) (Math.random() * 100);
            int fourOperations = (int) (Math.random() * 4 + 1);
            int fourOperations2 = (int) (Math.random() * 4 + 1);
            switch (fourOperations) {
                case 1:
                    switch (fourOperations2) {
                        case 1:
                            correctAnswer = number1 + number2 + number3;
                            System.out.print(number1 + " + " + number2 + " + " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;

                        case 2:
                            correctAnswer = number1 + number2 - number3;
                            System.out.print(number1 + " + " + number2 + " - " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 3:
                            correctAnswer = number1 + (number2 * number3);
                            System.out.print(number1 + " + " + number2 + " * " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 4:
                            correctAnswer = number1 + (number2 / number3);
                            System.out.print(number1 + " + " + number2 + " / " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        default:

                    }
                    break;
                case 2:
                    switch (fourOperations2) {
                        case 1:
                            correctAnswer = number1 - number2 + number3;
                            System.out.print(number1 + " - " + number2 + " + " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;

                        case 2:
                            correctAnswer = number1 - number2 - number3;
                            System.out.print(number1 + " - " + number2 + " - " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 3:
                            correctAnswer = number1 - (number2 * number3);
                            System.out.print(number1 + " - " + number2 + " * " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 4:
                            correctAnswer = number1 - (number2 / number3);
                            System.out.print(number1 + " - " + number2 + " / " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        default:
                    }
                    break;
                case 3:
                    switch (fourOperations2) {
                        case 1:
                            correctAnswer = (number1 * number2) + number3;
                            System.out.print(number1 + " * " + number2 + " + " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;

                        case 2:
                            correctAnswer = number1 * number2 - number3;
                            System.out.print(number1 + " * " + number2 + " - " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 3:
                            correctAnswer = number1 * number2 * number3;
                            System.out.print(number1 + " * " + number2 + " * " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 4:
                            correctAnswer = number1 * number2 / number3;
                            System.out.print(number1 + " * " + number2 + " / " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        default:
                    }
                    break;
                case 4:
                    switch (fourOperations2) {
                        case 1:
                            correctAnswer = (number1 / number2) + number3;
                            System.out.print(number1 + " / " + number2 + " + " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;

                        case 2:
                            correctAnswer = (number1 / number2) - number3;
                            System.out.print(number1 + " / " + number2 + " - " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 3:
                            correctAnswer = number1 / number2 * number3;
                            System.out.print(number1 + " / " + number2 + " * " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        case 4:
                            correctAnswer = number1 / number2 / number3;
                            System.out.print(number1 + " / " + number2 + " / " + number3 + " = ");
                            userAnswer = scn.nextInt();
                            break;
                        default:

                    }

            }
            if (userAnswer == correctAnswer) {
                System.out.println("Correct");
                trueQuestion++;
                trueQuestionRow++;
            } else {
                System.out.println("Wrong");
                trueQuestionRow = 0;
            }
            question++;
        }
        long remainingTime = (System.currentTimeMillis() - startTime);
        System.out.println("Correct Answers: " + trueQuestion);
        System.out.println("Total Question: " + (question - 1));
        System.out.println("total second " + (remainingTime / 1000) + " second");

    }

    public static void welcome() {
        System.out.println("Welcome to Arithmetic!s Exercise Program");
        System.out.println("------------------------------------------------");
        System.out.println("You have 90 seconds to answer as many questions as possible");
        System.out.println("Use java arithmetic precedence rules to find answers!");
        System.out.println("If you want to go to the next level you have to answer 10 questions correctly ");

    }

    public static void enterOrQuit() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Press'q'to quit or any key to start…");
        String entery = scn.nextLine();
        if (entery.equals("q")) {
            System.out.println("GAME OVER");
            System.exit(1);

        }

    }

    public static void timeIsUp() {
        System.out.println("TIME IS UP!");
    }

    public static void MotivationMessage(int trueQuestionRow) {
        if (trueQuestionRow / 3 == 1) {
            MotivationInside(trueQuestionRow);

        } else if (trueQuestionRow / 3 == 2) {

            MotivationInside(trueQuestionRow);

        } else if (trueQuestionRow / 3 == 3) {
            MotivationInside(trueQuestionRow);
        }
    }

    public static void MotivationInside(int trueQuestionRow) {
        for (int i = 0; i <= trueQuestionRow * 2; i++) {
            if (trueQuestionRow > 9 && trueQuestionRow % 3 == 0) {
                trueQuestionRow /= 4;
            }
            if (i == trueQuestionRow) {
                switch (trueQuestionRow / 3) {

                    case 1:
                        System.out.print("\tGood Job\t");
                        break;
                    case 2:
                        System.out.print("\tKeep it Up\t");
                        break;
                    case 3:
                        System.out.print("\tGreat Work\t");
                }
            } else if (i == trueQuestionRow * 2) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }

    }

}
