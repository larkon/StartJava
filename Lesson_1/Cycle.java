

public class Cycle {   
    public static void main(String[] args) {
        //Входные данные ----------------------------------------------
        byte age = 28 ; // возраст
        char gender = 'F' ; // пол
        double height = 1.94 ; // рост
        String name = "Margo" ; // имя

        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]:");
        for (int i = 0; i <= 20; i++ ) {
            System.out.println(i);
        };

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        System.out.println("Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2):");
        int x = 6;
        while (x >= -6) {
            System.out.println(x);
            x = x - 2;
        };

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        System.out.println("Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль:");
        int y = 10;
        int sum = 0;
        do {
            if ((y%2) != 0) {
                sum = sum + y;
                //System.out.println(y);
            };
            y++;
        } 
        while (y <= 20);
        System.out.println("Сумма нечетных чисел на интервале [10, 20]: " + sum);

    }
}