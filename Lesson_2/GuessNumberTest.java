import java.util.*;
public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);

        String userResponse;// продолжить (yes/no)
        int min = 0; // random min
        int max = 100; // random max
        int numberOfPlayers = 2; // Число игроков

        do {
            guessNumber.game(numberOfPlayers, min, max);
           do {
              System.out.print("Хотите продолжить игру? (yes/no): ");
              userResponse = scanner.nextLine();
           } while (!userResponse.equals("yes") && !userResponse.equals("no"));

        } while (userResponse.equals("yes"));
    }
}