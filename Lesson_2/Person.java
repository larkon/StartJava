public class  Person {

    String personName = "Сергей";
    char personGender = 'M';
    int persomAge = 30;
    float personHeight = 1.8f;
    float personWeight = 89.0f;

    float sleep() {
        System.out.println("Сон 8 часов");
        return 8.0f;
    }

    float runSpeed() {
        System.out.println("Средняя скорость бега 17.8 км./ч");
        return 17.8f;

    }
    float walkSpeed() {
        System.out.println("Средняя скорость ходьбы 5.5 км./ч");
        return 5.5f;
    }

    String surname() {
        System.out.println("Фамилия: Петров");
        return "Петров";
    }

    boolean learnJava() {
        return true;
    }


}