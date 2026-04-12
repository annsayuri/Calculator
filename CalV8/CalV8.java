import javax.swing.JOptionPane;

public class CalV7{
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
        
        CalV2 c1 = new CalV2(num1, num2);
        double ans = 0;

        if(op==1) ans = c1.getSum();
        if(op==2) ans = c1.getSub();
        if(op==3) ans = c1.getMul();
        if(op==4) ans = c1.getDiv();
        if(op==5) ans = c1.getRem();

        JOptionPane.showMessageDialog(null, "Answer is: " + ans);
    }
}
}