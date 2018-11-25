import java.io.Serializable;

/**
 * Created by Виктор on 25.11.2018.
 */
public class AbstractTask implements Serializable {
    private double operand1,operand2;
    private String operation;
    protected AbstractTask(){
        this(0,0,"");
    }

    public AbstractTask(double operand1, double operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public double getOperand1() {
        return operand1;
    }
    public double getOperand2() {
        return operand2;
    }
    public String getOperation() {
        return operation;
    }
    public Double calculate(){
        if (operation.equals("+")){
            return operand1+operand2;
        }
        else
            return operand1 - operand2;
    }
}
