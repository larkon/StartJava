public class  Wolf {

    String wolfName = "Jango";
    char wolfGender = 'K';
    int wolfAge = 10;
    float wolfWeight = 89.0f;
    String wolfColor = "black";
    
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

    void hunting() {
        System.out.println("Волк на охоте.");
    }


}