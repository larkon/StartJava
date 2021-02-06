public class GuessNumber {
    // сравнение
    public static void myGame(int pcNumber, int myNumber, String name) {
        if (pcNumber < myNumber) {
            System.out.println(name + " загаданное число меньше");
        } else if (pcNumber > myNumber) {
            System.out.println(name + " загаданное число больше");
        } else {
            System.out.println(name + " угадал число!");
        }
    }
}