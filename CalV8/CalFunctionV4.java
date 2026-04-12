import javax.swing.JOptionPane;

public class CalV4{
  
  double n1;
  double n2;

  public CalV1(double x, double y){
    n1 = x;
    n2 = y;
  }

  public double getSum(){
    return n1 + n2;
  }

    public double getSub(){
        return n1 - n2;
    }

    public double getMul(){
        return n1 * n2;
    }

    public double getDiv(){
        return n1 / n2;
    }

    public double getRem(){
        return n1 % n2;
    }
}