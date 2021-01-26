public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.name = "Jango 2";
        System.out.println("Кличка волка: " + wolfOne.name);

        System.out.println("Пол волка: " + wolfOne.gender);

        wolfOne.age = 1;
        System.out.println("Возраст волка: " + wolfOne.age);

        wolfOne.weight = 89.0f;
        System.out.println("Вес волка: " + wolfOne.weight);

        wolfOne.color = "pink";
        System.out.println("Цвет волка: " + wolfOne.color);
        
        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunt();
    }
}