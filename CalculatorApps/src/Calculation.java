import java.util.HashMap;
import java.util.Map;

public class Calculation
{
    private char operation;
    private double operand1;
    private double operand2;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculation(double operand1, double operand2, char operation)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;

        // inisialisasi operationmap
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation()
    {
        Operation operationImpl = operationMap.get(operation);
        if (operationImpl != null)
        {
            return operationImpl.calculateResult(operand1, operand2);
        }
        else
        {
            throw new UnsupportedOperationException("Invalid operation: " + operation);
        }
    }
}
