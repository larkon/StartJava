import java.util.*;
public class GuessNumber {
    public static void game(int numberOfPlayers, int min, int max) {
        int pcNumber = randBetween(min, max);
        //System.out.println(pcNumber);// Згаданное число, для тестов
        aboutGame(numberOfPlayers, min, max);// Правила игры

        // Players name
        String players[] = new String[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++){
            players[i] = nameInput(i);
        }

        // Game
        int myNumber = min - 1;
        do {
            for(int i = 0; i < numberOfPlayers; i++){
                myNumber = numberInput(players[i]);
                myGameResult(pcNumber, myNumber, players[i]);
                if (myNumber == pcNumber) break;
            }
        } while (myNumber != pcNumber);
    }

    // Input name
    public static String nameInput(int playerNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя " + (playerNumber + 1) + "-го игрока: ");
        String name = scanner.nextLine();
        return name;
    }

    // Input number
    public static int numberInput(String playerName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(playerName + ", введите число: ");
        int number = scanner.nextInt();
        return number;
    }

    // About game
    public static void aboutGame(int numberOfPlayers, int min, int max) {
        System.out.println("В игре участвуют " + numberOfPlayers + " игрока. " + "Нужно угадать число от " + min + " до " + max + ". ");
    }

    // сравнение чисел
    public static void myGameResult(int pcNumber, int myNumber, String name) {
        if (pcNumber < myNumber) {
            System.out.println(name + ", загаданное число меньше");
        } else if (pcNumber > myNumber) {
            System.out.println(name + ", загаданное число больше");
        } else {
            System.out.println(name + ", угадал число!");
        }
    }

    // генератор случайных чисел
    public static int randBetween(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}