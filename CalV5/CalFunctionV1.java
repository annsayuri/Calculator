import javax.swing.JOptionPane;

public class CalFunctionV1{
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }

    public static void showSub(double num1, double num2){
        double sub = num1 - num2;
        JOptionPane.showMessageDialog(null, "The difference is: " + sub);
    }

    public static void showMul(double num1, double num2){
        double mul = num1 * num2;
        JOptionPane.showMessageDialog(null, "The product is: " + mul);
    }

    public static void showDiv(double num1, double num2){
        if(num2 != 0) {
            double div = num1 / num2;
            JOptionPane.showMessageDialog(null, "The quotient is: " + div);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
        }
    }

    public static void showRem(double num1, double num2){
        if(num2 != 0) {
            double rem = num1 % num2;
            JOptionPane.showMessageDialog(null, "The remainder is: " + rem);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
        }
    }
}