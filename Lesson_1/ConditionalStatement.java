public class ConditionalStatement {   
    public static void main(String[] args) {
        //Входные данные ----------------------------------------------
        byte age = 28 ; 
        char gender = 'F' ; 
        double height = 1.94 ; 
        String name = "Margo" ; 
        //Возраст ----------------------------------------------
        if (age > 20) {
            System.out.println("Возраст: старше 20 лет");
        }
        //Пол ----------------------------------------------
        if (gender == 'M') {
            System.out.println("Пол: Мужской");
        }
        if (gender != 'M') {
            System.out.println("Пол: Женский");
        }
        //Рост ----------------------------------------------
        if (height < 1.8) {
            System.out.println("Рост: Ниже 1.80");
        } else  System.out.println("Рост: Выше 1.80");
        //Первая буква имени--------------------------------------
        if ((name.substring(0,1)).equals("M")) {
            System.out.println("Начинается c \'M\'");
        } 
        else if ((name.substring(0,1)).equals("I")) {
            System.out.println("Начинается c \'I\'");
        } else {
            System.out.println("Начальная букава имени не определена");
        }
    }
}