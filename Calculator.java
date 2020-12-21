//First I will declare what package that this java file is in//
package JavaClassesAndObjectsPart2;

//I don't remember what this code does, but I will insert it in below
import java.util.*;

public class Calculator {

    private int answer;
    private int[] numericalValues;
    private String MathematicalOperation;
    
    public int add() {
        return numericalValues[0] + numericalValues[1];
    }

    public int subtract() {
        return numericalValues[0] - numericalValues[1];
    }

    public int multiply() {
        return numericalValues[0] * numericalValues[1];
    }

    public int divide() {
        return numericalValues[0] / numericalValues[1];
    }

    public int square() {
        return numericalValues[0] * numericalValues[0];
    }

    public void getNumericalValues() {
        Scanner MathematicalOperations = new Scanner(System.in);
        numericalValues = new int[2];
        System.out.print("\nThe first number: ");
        numericalValues[0] = MathematicalOperations.nextInt();
        System.out.print("\nThe second number: ");
        numericalValues[1] = MathematicalOperations.nextInt();
    }

    public void getMathematicalOperation() {
        Scanner objects = new Scanner(System.in);
        System.out.print("\nMathematicalOperation (+, -, *, /, square): ");
        MathematicalOperation = objects.next();
    }

    public int calc() {
        switch (MathematicalOperation) {
            case ("+"):
                answer = add();
                break;
            case ("-"):
                answer = subtract();
            case ("*"):
                answer = multiply();
                break;
            case ("sq"):
                answer = square();
                break;            
        }
        return answer;
    }

    public static void main (String[] arg) {

        Calculator calc = new Calculator();
        calc.getNumericalValues();
        calc.getMathematicalOperation();
        System.out.println(calc.calc());
        
    }
}
