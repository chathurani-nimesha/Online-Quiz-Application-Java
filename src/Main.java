public class Main {
    public static void main(String[] args) {
        OnlineQuizApplication quiz = new OnlineQuizApplication();

        Question q1 = new Question(
                "What is Java?",
                new String[]{
                        "A. Programming Language",
                        "B. Operating System",
                        "C. Database",
                        "D. Web Browser"
                },
                'A'
        );

        Question q2 = new Question(
                "Which keyword is used to create an object?",
                new String[]{
                        "A. class",
                        "B. new",
                        "C. static",
                        "D. void"
                },
                'B'
        );

        Question q3 = new Question(
                "Which data type stores true or false?",
                new String[]{
                        "A. int",
                        "B. String",
                        "C. boolean",
                        "D. double"
                },
                'C'
        );

        Question q4 = new Question(
                "Which collection allows dynamic resizing?",
                new String[]{
                        "A. Array",
                        "B. ArrayList",
                        "C. String",
                        "D. int"
                },
                'B'
        );

        Question q5 = new Question(
                "Which method is the entry point of Java?",
                new String[]{
                        "A. start()",
                        "B. run()",
                        "C. main()",
                        "D. execute()"
                },
                'C'
        );

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);

        quiz.startQuiz();
    }
}
