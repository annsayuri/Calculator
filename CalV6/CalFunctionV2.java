import javax.swing.JOptionPane;

public class CalFunctionV2{
    public static double getSum(double num1, double num2){
        return num1 + num2;
    }

    public static double getSub(double num1, double num2){
        return num1 - num2;
    }

    public static double getMul(double num1, double num2){
        return num1 * num2;
    }

    public static double getDiv(double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
            return 0;
        }
    }

    public static double getRem(double num1, double num2){
        if(num2 != 0) {
            return num1 % num2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
            return 0;
        }
    }
}