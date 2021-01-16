import java.util.*;

public class Calculator {   
    public static void main(String[] args) {
        int nomberOne;
        int nomberTow;
        char operation;

        //Арифметическое выражение
        nomberOne = 170;
        nomberTow = 10;
        operation = '+';

        //Калькулятор
        if (operation == ('+')) {System.out.println(nomberOne + nomberTow);} else
        if (operation == ('-')) {System.out.println(nomberOne - nomberTow);} else
        if (operation == ('*')) {System.out.println(nomberOne * nomberTow);} else
        if (operation == ('/')) {System.out.println(nomberOne / nomberTow);} else
        if (operation == ('%')) {System.out.println(nomberOne % nomberTow);} else
        {System.out.println("операция не определена");}

    }
}