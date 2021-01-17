
public class Calculator {   
    public static void main(String[] args) {
        int nomberOne;
        int nomberTow;
        char operation;

        //Арифметическое выражение
        nomberOne = 3;
        nomberTow = 3;
        operation = '^';

        //Калькулятор
        if (operation == ('+')) {System.out.println(nomberOne + nomberTow);} else
        if (operation == ('-')) {System.out.println(nomberOne - nomberTow);} else
        if (operation == ('*')) {System.out.println(nomberOne * nomberTow);} else
        if (operation == ('/')) {System.out.println(nomberOne / nomberTow);} else
        if (operation == ('%')) {System.out.println(nomberOne % nomberTow);} else
        if (operation == ('^')) {
            int result = 1;
            for (int i=0; i<nomberTow; i++) {
                result = result * nomberOne;
                //System.out.println(result);
            };
            System.out.println(result);
        } else
        {System.out.println("операция не определена");}

    }
}