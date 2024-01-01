import java.util.List;

public class Quiz {

    public List<Question> questions;


    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void displayQuiz() {
        System.out.println("Here is the full Quiz\n");
        for (Question qt : questions) {
            qt.displayQuestion();
        }
    }


    public int scoreQuiz(List<Integer> playerAnswers) {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).isCorrectAnswer(playerAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }


}
