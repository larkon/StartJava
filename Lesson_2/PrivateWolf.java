public class PrivateWolf {
    private String name;
    private char gender;
    private int age;
    private float weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
        }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
            this.gender = gender;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Не корректный возраст");
        } else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
            this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
            this.color = color;
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

    public void hunt() {
        System.out.println("Волк на охоте.");
    }
 }