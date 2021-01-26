public class Wolf {

    String name = "Jango";
    char gender = 'K';
    int age = 10;
    float weight = 89.0f;
    String color = "black";
    
    float runSpeed() {
        System.out.println("Средняя скорость бега 40.0 км./ч");
        return 40.0f;
    }

    float walkSpeed() {
        System.out.println("Средняя скорость ходьбы 6.0 км./ч");
        return 6.0f;
    }

    boolean sit() {
        return true;
    }

    boolean howl() {
        return false;
    }

    void hunt() {
        System.out.println("Волк на охоте.");
    }
}