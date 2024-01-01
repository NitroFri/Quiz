import java.util.*;

public class QuizTaker {
    private String name;

    private Map<String, Integer> quizScores;


    public QuizTaker(String name) {
        this.name = name;
        this.quizScores = new HashMap<>();
    }

    public void takeQuiz(Quiz quiz) {
        List<Integer> playerAnswers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ?");
        this.name = scanner.next();
        System.out.printf("Okay %S here is 10 Random Questions that you need you answer, good luck", name);
        for (Question qt : quiz.questions) {
            qt.displayQuestion();
            System.out.println("what is your answer ?");
            int answer = scanner.nextInt();
            playerAnswers.add(answer - 1);


        }

        quizScores.put(name, quiz.scoreQuiz(playerAnswers));
        System.out.println("Your score is:" + quiz.scoreQuiz(playerAnswers));
    }

    public Map<String, Integer> getQuizScore() {

        return quizScores;

    }
}
