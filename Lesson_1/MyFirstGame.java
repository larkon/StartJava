public class MyFirstGame {   
    public static void main(String[] args) {
        int pcNomber = 130;
        int myNomber = 99;
        //Поиск числа
        System.out.println("Компьютер загадал число");
        System.out.println("Ваше число: " + myNomber);
        do {
            if (pcNomber < myNomber) {
                System.out.println("Загаданное число меньше");
                myNomber--;
            };
            if (pcNomber > myNomber) {
                System.out.println("Загаданное число больше");
                myNomber++;
            };
        } while (pcNomber != myNomber);
        System.out.println("Число угадано: " + pcNomber);
    }
}