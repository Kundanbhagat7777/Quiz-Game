import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        String[] questions = {
                "1. What is the capital of India?",
                "2. Which animal is the national animal of India?",
                "3. Who is known as the Father of the Nation in India?",
                "4. Which monument is considered one of the Seven Wonders of the World and is located in India?",
                "5. Which festival is known as the Festival of Lights in India?"
        };

        String[][] options = {
                {"A. New Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
                {"A. Tiger", "B. Lion", "C. Elephant", "D. Peacock"},
                {"A. Mahatma Gandhi", "B. Jawaharlal Nehru", "C. Subhash Chandra Bose", "D. Bhagat Singh"},
                {"A. Taj Mahal", "B. Great Wall of China", "C. Colosseum", "D. Petra"},
                {"A. Diwali", "B. Holi", "C. Navratri", "D. Eid"}
        };

        char[] answers = {'A', 'A', 'A', 'A', 'A'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer: ");
            char userAnswer = Character.toUpperCase(scanner.nextLine().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer: " + answers[i]);
            }

            System.out.println();
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
