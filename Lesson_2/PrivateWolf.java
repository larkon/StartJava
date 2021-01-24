public class  PrivateWolf {

    private String wolfName = "Jango";
    private char wolfGender = 'K';
    private int wolfAge = 10;
    private float wolfWeight = 89.0f;
    private String wolfColor = "black";

    public String getWolfName() {
        return wolfName;
    }

    public char getWolfGender() {
        return wolfGender;
    }

    public int getWolfAge() {
        return wolfAge;
    }

    public float getWolfWeight() {
        return wolfWeight;
    }

    public String getWolfColor() {
        return wolfColor;
    }

    public float runSpeed() {
        System.out.println("Средняя скорость бега 40.0 км./ч");
        return 40.0f;
    }

    public float walkSpeed() {
        System.out.println("Средняя скорость ходьбы 6.0 км./ч");
        return 6.0f;
    }

    public boolean sit() {
        return true;
    }

    public boolean howl() {
        return false;
    }

    public void hunting() {
        System.out.println("Волк на охоте.");
    }


}