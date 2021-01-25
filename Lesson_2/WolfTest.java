public class  WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        String name = "Jango 2";
        System.out.println("Кличка волка: " + wolfOne.name);
        System.out.println("Пол волка: " + wolfOne.gender);
        float age = 1;
        System.out.println("Возраст волка: " + wolfOne.age);
        float weight = 89.0f;
        System.out.println("Вес волка: " + wolfOne.weight);
        String color = "pink";
        System.out.println("Цвет волка: " + wolfOne.color);
        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunt();
    }
}