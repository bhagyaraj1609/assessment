import java.util.Scanner;

public class Calculator implements CalculatorInterface{

    @Override
    public double add(String[] givenNumbers) {

        double result = 0;
        for(String number : givenNumbers) {

            result+=Double.parseDouble(number);
        }
        return result;
    }

    @Override
    public double subtract(String[] givenNumbers) {

        double result = 0;
        for(String number : givenNumbers) {
            result-=Double.parseDouble(number);
        }
        return result;
    }

    @Override
    public double multiply(String[] givenNumbers) {
        double result = 1;
        for(String number : givenNumbers) {
            result*=Double.parseDouble(number);
        }
        return result;
    }

    public static boolean isNumeric(String[] numbers){


        try {
            for (String s: numbers) {
                double d = Double.parseDouble(s);
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        double result = 0;
        String givenNumber;
        String requiredOperation;
        Calculator calculator = new Calculator();
        while (true) {
            Scanner scanObject = new Scanner(System.in);
            System.out.println("please enter required numbers separated by space");
            givenNumber = scanObject.nextLine();
            String[] numbers = givenNumber.split("\\s");
            if (isNumeric(numbers)) {
                System.out.println("what is the required Operation");
                requiredOperation = scanObject.next();

                switch (requiredOperation) {
                    case "add" -> result = calculator.add(numbers);
                    case "subtract" -> result = calculator.subtract(numbers);
                    case "multiply" -> result = calculator.multiply(numbers);
                }
                System.out.println(result);
            } else {
                System.out.println("enter a valid number");
            }
            scanObject.close();
        }
    }

}
