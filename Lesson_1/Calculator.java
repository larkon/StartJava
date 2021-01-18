public class Calculator {   
    public static void main(String[] args) {
        int numberOne = 3;
        int numberTow = 3;
        char operation = '^';
        //Калькулятор
        if (operation == ('+')) {
            System.out.println(numberOne + numberTow);
        } else if (operation == '-') {
            System.out.println(numberOne - numberTow);
        } else if (operation == '*') {
            System.out.println(numberOne * numberTow);
        } else if (operation == '/') {
            System.out.println(numberOne / numberTow);
        } else if (operation == '%') {
            System.out.println(numberOne % numberTow);
        } else if (operation == '^') {
            int result = 1;
            for (int i = 0; i < numberTow; i++) {
                result *= numberOne;
            }
            System.out.println(result);
        } else {
            System.out.println("операция не определена");
        }
    }
}