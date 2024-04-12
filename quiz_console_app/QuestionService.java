import java.util.Scanner;

public class QuestionService {

    Question questions[] = new Question[5];

    public QuestionService() {

        questions[0] = new Question(1, "what ?", "Java", "C++", "C#", "Js", "a");
        questions[1] = new Question(2, "what ?", "Java", "C++", "C#", "Js", "b");
        questions[2] = new Question(3, "what ?", "Java", "C++", "C#", "Js", "c");
        questions[3] = new Question(4, "what ?", "Java", "C++", "C#", "Js", "d");
        questions[4] = new Question(5, "what ?", "Java", "C++", "C#", "Js", "a");

    }

    String selected[] = new String[5];

    public void displayQuestion() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Q" + questions[i].getId() + ": " +
                    questions[i].getQuestion() + "\n  please correct answer the value from below option" + "\n a) "
                    + questions[i].getOpt1() + " b) "
                    + questions[i].getOpt2() + " c) " + questions[i].getOpt3() + " d) " + questions[i].getOpt4()
                    + "\n please correct answer the value from below option"

            );

            selected[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("your answer selected is given below \n");
        for (String value : selected) {
            System.out.println(value);
        }

    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            String actualAnswer = questions[i].getAnswer();
            String Answer = selected[i];

            if (actualAnswer.equals(Answer)) {
                score++;
            }

        }
        System.out.println("Total Score you got: " + score);

    }

}
