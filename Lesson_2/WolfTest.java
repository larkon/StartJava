public class  WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfName = "Jango 2";
        System.out.println("Кличка волка: " + wolfOne.wolfName);
        System.out.println("Пол волка: " + wolfOne.wolfGender);
        wolfAge = 1;
        System.out.println("Возраст волка: " + wolfOne.wolfAge);
        wolfWeight = 89.0f;
        System.out.println("Вес волка: " + wolfOne.wolfWeight);
        String wolfColor = "pink";
        System.out.println("Цвет волка: " + wolfOne.wolfColor);        
        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunt();
    }
    

}