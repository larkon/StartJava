public class ConditionalStatement {   
    public static void main(String[] args) {
        //Возраст ----------------------------------------------
        byte age = 28 ; 
        if (age > 20) {
            System.out.println("Возраст: старше 20 лет");
        }

        //Пол ----------------------------------------------
        char gender = 'F' ; 
        if (gender == 'M') {
            System.out.println("Пол: Мужской");
        }
        if (gender != 'M') {
            System.out.println("Пол: Женский");
        }

        //Рост ----------------------------------------------
        double height = 1.94 ;
        if (height < 1.8) {
            System.out.println("Рост: Ниже 1.80");
        } else System.out.println("Рост: Выше 1.80");

        //Первая буква имени--------------------------------------
        String name = "Мargo" ; 
        if (name.charAt(0) == 'M') {
            System.out.println("Начинается c \'M\'");
        } 
        else if (name.charAt(0) == 'I') {
            System.out.println("Начинается c \'I\'");
        } else {
            System.out.println("Начальная букава имени не определена");
        }
    }
}