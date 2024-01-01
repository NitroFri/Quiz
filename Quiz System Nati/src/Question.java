import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    final int correctOptionsIndex;

    //displayQuestion
    public void displayQuestion() {
        System.out.println(questionText);
        int i = 1;
        for (String str : options) {
            System.out.printf("%s. %s\n", i, str);
            i++;
        }

    }

    //Checking if the answer is correct
    public boolean isCorrectAnswer(int answerIndex) {

        return answerIndex == correctOptionsIndex;
    }

    public Question(String questionText, List<String> options, int correctOptionsIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionsIndex = correctOptionsIndex;
    }
}
