import java.util.Scanner;

public class Calculator implements CalculatorInterface{

    @Override
    public int add(String[] givenNumbers) {

        int result = 0;
        for(String number : givenNumbers) {
            result+=Integer.parseInt(number);
        }
        return result;
    }

    @Override
    public int subtract(String[] givenNumbers) {

        int result = 0;
        for(String number : givenNumbers) {
            result-=Integer.parseInt(number);
        }
        return result;
    }

    @Override
    public int multiply(String[] givenNumbers) {
        int result = 1;
        for(String number : givenNumbers) {
            result*=Integer.parseInt(number);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        String givenNumber;
        String requiredOperation;
        Calculator calculator = new Calculator();
        Scanner scanObject = new Scanner(System.in);
        System.out.println("please enter required numbers separated by space");
        givenNumber =scanObject.nextLine();
        String[] numbers = givenNumber.split("\\s");
        System.out.println("what is the required Operation");
        requiredOperation = scanObject.next();
        scanObject.close();
        switch (requiredOperation) {
            case "add" -> result = calculator.add(numbers);
            case "subtract" -> result = calculator.subtract(numbers);
            case "multiply" -> result = calculator.multiply(numbers);
        }
        System.out.println(result);
    }

}
