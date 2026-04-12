import javax.swing.JOptionPane;

public class CalV1{
  
  double n1;
  double n2;

  public CalV1(double x, double y){
    n1 = x;
    n2 = y;
  }

  public void showSum(){
    double ans= n1 +n2;
    JOptionPane.showMessageDialog(null, "Answer is: " + ans);
  }

    public void showSub(){
        double ans= n1 - n2;
        JOptionPane.showMessageDialog(null, "Answer is: " + ans);
    }

    public void showMul(){
        double ans= n1 * n2;
        JOptionPane.showMessageDialog(null, "Answer is: " + ans);
    }

    public void showDiv(){
        double ans= n1 / n2;
        JOptionPane.showMessageDialog(null, "Answer is: " + ans);
    }

    public void showRem(){
        double ans= n1 % n2;
        JOptionPane.showMessageDialog(null, "Answer is: " + ans);
    }
}