
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineQuizApplication {

    private ArrayList<Question> questions;
    private int score;

    public OnlineQuizApplication() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" -----------------------------------------------");
        System.out.println("|          ONLINE QUIZ APPLICATION              |");
        System.out.println(" -----------------------------------------------");

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(question.getQuestionText());

            String[] options = question.getOptions();

            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");

            char answer = Character.toUpperCase(
                    scanner.next().charAt(0)
            );

            if (answer == question.getCorrectAnswer()) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        displayResult();
    }

    public void displayResult() {
        System.out.println(" ----------------------------------------");
        System.out.println("|                QUIZ RESULT             |");
        System.out.println(" ----------------------------------------");

        System.out.println("\t\tTotal Questions: " + questions.size());
        System.out.println("\t\tCorrect Answers: " + score);
        System.out.println("\t\tWrong Answers: " + (questions.size() - score));

        double percentage =(score * 100.0) / questions.size();

        System.out.println("Your Score: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Excellent Performance!");
        } else if (percentage >= 50) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
    }
}
