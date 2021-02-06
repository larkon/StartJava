import java.util.*;
public class GuessNumberTest {
    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        String userResponse;// продолжить (yes/no)
        int min = 0; // random min
        int max = 100; // random max

        do {
            int pcNumber = randBetween(min, max);// загаданное число
            //System.out.println(pcNumber); // выводим загаданное число, для тестов

            System.out.print("Введите имя 1-го игрока: ");
            playerOne.name = scanner.nextLine();

            System.out.print("Введите имя 2-го игрока: ");
            playerTwo.name = scanner.nextLine();

            System.out.println("Нужно угадать число от " + min + " до " + max + ". ");

            do {
                System.out.print(playerOne.name + " введите число: ");
                playerOne.number = scanner.nextInt();

                System.out.print(playerTwo.name + " введите число: ");
                playerTwo.number = scanner.nextInt();
            
                guessNumber.myGame(pcNumber, playerOne.number, playerOne.name);
                guessNumber.myGame(pcNumber, playerTwo.number, playerTwo.name);

               } while ((pcNumber != playerOne.number) && (pcNumber != playerTwo.number));

               do {
                  System.out.print("Хотите продолжить игру? (yes/no): ");
                  userResponse = scanner.nextLine();
               } while (!userResponse.equals("yes") && !userResponse.equals("no"));

        } while (userResponse.equals("yes"));
    }

    // генератор случайных чисел
    public static int randBetween(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}