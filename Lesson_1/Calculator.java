public class Calculator {   
    public static void main(String[] args) {
        int nomberOne = 3;
        int nomberTow = 3;
        char operation = '^';
        //Калькулятор
        if (operation == ('+')) {
            System.out.println(nomberOne + nomberTow);
        } else if (operation == ('-')) {
            System.out.println(nomberOne - nomberTow);
        } else if (operation == ('*')) {
            System.out.println(nomberOne * nomberTow);
        } else if (operation == ('/')) {
            System.out.println(nomberOne / nomberTow);
        } else if (operation == ('%')) {
            System.out.println(nomberOne % nomberTow);
        } else if (operation == ('^')) {
            int result = 1;
            for (int i = 0; i < nomberTow; i++) {
                result = result * nomberOne;
            }
            System.out.println(result);
        } else {
            System.out.println("операция не определена");
    }
    }
}