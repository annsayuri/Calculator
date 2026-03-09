import javax.swing.JOptionPane;

public class CalV4{
    public static void main(String[] args){

        String opcode = JOptionPane.showInputDialog("Select Operation\n\n"
            + "1. for Addition(+) \n"
            + "2. for Subtraction(-) \n"
            + "3. for Multiplication(*)\n"
            + "4. for Division(/) \n"
            + "5. for Remainder(%) \n "
            + "0. for Exit)";

        if(op==)) System.exit(0);

        String input1 = JOptionPane.showInputDialog("Enter first number:");
        String input2 = JOptionPane.showInputDialog("Enter second number:");

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        double result = 0;
        String operationSymbol = "";

        switch(op){
            case 1:
                result = num1 + num2;
                operationSymbol = "+";
                break;
            case 2:
                result = num1 - num2;
                operationSymbol = "-";
                break;
            case 3:
                result = num1 * num2;
                operationSymbol = "*";
                break;
            case 4:
                if(num2 != 0){
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "❌ Error: Cannot divide by zero!");
                    return;
                }
                operationSymbol = "/";
                break;
            case 5:
                result = num1 % num2;
                operationSymbol = "%";
                break;
            default:
                JOptionPane.showMessageDialog(null, "❌ Invalid operation selected!");
                return;
        }

        JOptionPane.showMessageDialog(null, num1 + " " + operationSymbol + " " + num2 + " = " + result);
    }
}
