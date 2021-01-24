public class  WolfTest {
    public static void main(String[] args) {

        Wolf wolfOne = new Wolf();

        System.out.println("Кличка волка: " + wolfOne.wolfName);
        System.out.println("Пол волка: " + wolfOne.wolfGender);
        System.out.println("Возраст волка: " + wolfOne.wolfAge);
        System.out.println("Вес волка: " + wolfOne.wolfWeight);
        System.out.println("Цвет волка: " + wolfOne.wolfColor);
        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunting();
    }
    

}