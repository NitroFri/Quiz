import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizSystem {
    public static List<Question> populateQuestions() {

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", List.of("Berlin", "Madrid", "Paris", "Rome"), 2));
        questions.add(new Question("In which year did the Titanic sink?", List.of("1905", "1912", "1920", "1931"), 1));
        questions.add(new Question("Who wrote the play 'Romeo and Juliet'?", List.of("Charles Dickens", "William Shakespeare", "Jane Austen", "Homer"), 1));
        questions.add(new Question("What is the largest mammal in the world?", List.of("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"), 1));
        questions.add(new Question("Which planet is known as the Red Planet?", List.of("Venus", "Mars", "Jupiter", "Saturn"), 1));
        questions.add(new Question("What is the chemical symbol for gold?", List.of("Au", "Ag", "Fe", "Cu"), 0));
        questions.add(new Question("In which year did the United States declare its independence?", List.of("1776", "1789", "1801", "1812"), 0));
        questions.add(new Question("Who painted the Mona Lisa?", List.of("Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet"), 1));
        questions.add(new Question("What is the main ingredient in guacamole?", List.of("Tomato", "Avocado", "Onion", "Cilantro"), 1));
        questions.add(new Question("Which element has the chemical symbol 'O'?", List.of("Osmium", "Oxygen", "Oganesson", "Olivine"), 1));
        return questions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz(populateQuestions());
        List<Integer> answer = new ArrayList<>();
        int playerAnswer = 0;
        String playerName = "";
        QuizTaker quizTaker = new QuizTaker(playerName);
        while (playerAnswer != 3) {

            //Display the menu
            System.out.printf("**** Quiz Menu ****%n" +
                    "1. Start Quiz%n" +
                    "2. Display Results%n" +
                    "3. Exit%n" +
                    "Enter your choice: ");


            //validation for correct input
            if (scanner.hasNextInt()) {
                playerAnswer = scanner.nextInt();


                //switch cases for navigation in the menu
                switch (playerAnswer) {
                    case 1 -> {
                        System.out.println("Okay lets begin the quiz");
                        quizTaker.takeQuiz(quiz);
                    }
                    case 2 -> {
                        System.out.printf("here is the scoreboard so far:%s %n ", quizTaker.getQuizScore());
                    }
                    case 3 -> System.out.println("Quiz finished goodbye");
                    default -> System.out.println("Invalid answer");
                }
            } else {
                System.out.println("invalid input");
                break;
            }


        }

    }
}