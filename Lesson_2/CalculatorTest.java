import java.util.*;

public class CalculatorTest {   
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();

        Scanner readerOperation = new Scanner (System.in);
        Scanner readerNumberOne = new Scanner (System.in);
        Scanner readerNumberTwo = new Scanner (System.in);
        Scanner readerMyIteration = new Scanner (System.in);

        String myIteration;
        int numberOne;
        char operation;
        int numberTwo;

        do {
        System.out.print("Введите первое число: ");
        numberOne = readerNumberOne.nextInt();
        
        System.out.print("Введите знак математической операции: ");
        operation = readerOperation.next().charAt(0);
        
        System.out.print("Введите второе число: ");
        numberTwo = readerNumberTwo.nextInt();

        System.out.println("Результат: " + calculatorOne.operatorDefinition(numberOne, numberTwo, operation));

        System.out.print("Хотите продолжить вычисления? (yes/no): ");
        myIteration = readerMyIteration.nextLine();

         } while (myIteration.equals("yes"));
    }
}