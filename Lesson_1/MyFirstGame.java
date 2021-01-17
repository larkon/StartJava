public class MyFirstGame {   
    public static void main(String[] args) {
        //Числа дано
        int pcNomber = 130;
        int myNomber = 99;
        //Поиск числа
        System.out.println("Компьютер загадал число");
        System.out.println("Ваше число: " + myNomber);
        do {
            if (pcNomber < myNomber) {
                System.out.println("Загаданное число меньше");
                myNomber--;
                System.out.println("Вы назвали новое число: " + myNomber);
            };
            if (pcNomber > myNomber) {
                System.out.println("Загаданное число больше");
                myNomber++;
                System.out.println("Вы назвали новое число: " + myNomber);
            };
        } while (pcNomber != myNomber);
        System.out.println("Число угадано: " + pcNomber);
    }
}