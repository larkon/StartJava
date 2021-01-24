public class  PrivateWolfTest {
    public static void main(String[] args) {

        PrivateWolf wolfOne = new PrivateWolf();

        System.out.println("Кличка волка: " + wolfOne.getWolfName());
        System.out.println("Пол волка: " + wolfOne.getWolfGender());

        if (wolfOne.getWolfAge() > 8) {
            System.out.println("Не корректный возраст");
        } else System.out.println("Возраст волка: " + wolfOne.getWolfAge());

        System.out.println("Вес волка: " + wolfOne.getWolfWeight());
        System.out.println("Цвет волка: " + wolfOne.getWolfColor());
        System.out.println(wolfOne.runSpeed());
        System.out.println(wolfOne.walkSpeed());
        System.out.println("Волк сидит?: " + wolfOne.sit());
        System.out.println("Волк воет?: " + wolfOne.howl());
        wolfOne.hunting();
    }
    

}