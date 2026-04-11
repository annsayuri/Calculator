import javax.swing.JOptionPane;

public class CalV6{
    public static void main(String[] args){

        while(true) {

        String opcode = JOptionPane.showInputDialog("Select Operation\n\n"
            + "1. for Addition(+) \n"
            + "2. for Subtraction(-) \n"
            + "3. for Multiplication(*)\n"
            + "4. for Division(/) \n"
            + "5. for Remainder(%) \n "
            + "0. for Exit");

        int op = Integer.parseInt(opcode);

        if(op == 0) {
            System.exit(0);
        }

        String input1 = JOptionPane.showInputDialog("Enter first number:");
        String input2 = JOptionPane.showInputDialog("Enter second number:");

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        
        double ans = 0;

        if(op==1) ans = CalFunctionV2.getSum(num1,num2);
        if(op==2) ans = CalFunctionV2.getSub(num1,num2);
        if(op==3) ans = CalFunctionV2.getMul(num1,num2);
        if(op==4) ans = CalFunctionV2.getDiv(num1,num2);
        if(op==5) ans = CalFunctionV2.getRem(num1,num2);

        JOptionPane.showMessageDialog(null, "The answer is: " + ans);
    }
}
}