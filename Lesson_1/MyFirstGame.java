public class MyFirstGame {   
    public static void main(String[] args) {
        int pcNumber = 130;
        int myNumber = 99;
        //Поиск числа
        System.out.println("Компьютер загадал число");
        System.out.println("Ваше число: " + myNumber);
        do {
            if (pcNumber < myNumber) {
                System.out.println("Загаданное число меньше");
                myNumber--;
            } else if (pcNumber > myNumber) {
                System.out.println("Загаданное число больше");
                myNumber++;
            }
        } while (pcNumber != myNumber);
        System.out.println("Число угадано: " + pcNumber);
    }
}