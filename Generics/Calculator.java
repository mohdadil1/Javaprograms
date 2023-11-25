public class Calculator<T extends Number> {
    private T operand1;
    private T operand2;

    public Calculator(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public T add() {
        if (operand1 instanceof Integer) {
            return operand1.intValue() + operand2.intValue();;
        } else if (operand1 instanceof Double) {
            return (T) (Number) (operand1.doubleValue() + operand2.doubleValue());
        } else {
            throw new IllegalArgumentException("Addition not supported for this data type");
        }
    }

    public T subtract() {
        if (operand1 instanceof Integer) {
            return (T) (Number) (operand1.intValue() - operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Number) (operand1.doubleValue() - operand2.doubleValue());
        } else {
            throw new IllegalArgumentException("Subtraction not supported for this data type");
        }
    }

    public T multiply() {
        if (operand1 instanceof Integer) {
            return (T) (Number) (operand1.intValue() * operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Number) (operand1.doubleValue() * operand2.doubleValue());
        } else {
            throw new IllegalArgumentException("Multiplication not supported for this data type");
        }
    }

    public T divide() {
        if (operand1 instanceof Integer) {
            if (operand2.intValue() == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return (T) (Number) (operand1.intValue() / operand2.intValue());
        } else if (operand1 instanceof Double) {
            if (operand2.doubleValue() == 0.0) {
                throw new ArithmeticException("Division by zero");
            }
            return (T) (Number) (operand1.doubleValue() / operand2.doubleValue());
        } else {
            throw new IllegalArgumentException("Division not supported for this data type");
        }
    }

    public int modulus() {
        if (operand1 instanceof Integer) {
            if (operand2.intValue() == 0) {
                throw new ArithmeticException("Modulo by zero");
            }
            return operand1.intValue() % operand2.intValue();
        } else {
            throw new IllegalArgumentException("Modulus operation only supported for integers");
        }
    }
}
