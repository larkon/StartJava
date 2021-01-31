public class Calculator {
    public static int operatorDefinition(int numberOne, int numberTwo, char operation) {
        int result = 0;
        switch (operation) {
                case '+':
                    result = numberOne + numberTwo;
                    break;
                case '-':
                    result = numberOne - numberTwo;
                    break;
                case '*':
                    result = numberOne * numberTwo;
                    break;
                case '/':
                    result = numberOne / numberTwo;
                    break;
                case '%':
                    result = numberOne % numberTwo;
                    break;
                case '^':
                    result = 1;
                    for (int i = 0; i < numberTwo; i++) {
                        result *= numberOne;
                    }
                    break; 
                default: 
                    System.out.println("операция не определена");
                    break;
        }
        return result;
     }
}