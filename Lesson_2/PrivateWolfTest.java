public class  PrivateWolfTest {
    public static void main(String[] args) {
        PrivateWolf wolfOne = new PrivateWolf();

        wolfOne.setName("Jango");
        System.out.println("Кличка волка: " + wolfOne.getName());

        wolfOne.setGender('K');
        System.out.println("Пол волка: " + wolfOne.getGender());

        wolfOne.setWeight(40.5f);
        System.out.println("Вес волка: " + wolfOne.getWeight());

        wolfOne.setColor("black");
        System.out.println("Цвет волка: " + wolfOne.getColor());

        wolfOne.setAge(14);

        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunt();
    }
}