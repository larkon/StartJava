import java.util.*;

public class CalculatorTest {   
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);

        String userResponse;
        int numberOne;
        char operation;
        int numberTwo;

        do {
           System.out.print("Введите первое число: ");
           numberOne = scanner.nextInt();
        
           System.out.print("Введите знак математической операции: ");
           operation = scanner.next().charAt(0);
        
           System.out.print("Введите второе число: ");
           numberTwo = scanner.nextInt();

           System.out.println("Результат: " + calc.operatorDefinition(numberOne, numberTwo, operation));

           userResponse = "";
              System.out.print("Хотите продолжить вычисления? (yes/no): ");

           do {
            userResponse = scanner.nextLine();
           } while (!userResponse.equals("yes") && !userResponse.equals("no"));



        } while (userResponse.equals("yes"));
    }
}