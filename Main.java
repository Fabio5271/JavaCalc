import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner mainCtl = new Scanner(System.in);
        String ctl;
        boolean run = true;
        boolean autoRes = false;
        Calc calc1 = new Calc(0);
        System.out.println("** Warning: Insert decimal numbers according to your system format (0,1 | 0.1)");

        System.out.println("Show result automatically?\n(Y)es | (N)o : ");
        ctl = mainCtl.next();
        if (ctl.equals("Y") || ctl.equals("y")){
            autoRes = true;
        }

        while (run == true){
            System.out.println("\nAvailable Actions: \n(A)dd | (S)ubtract | (M)ultiply | (D)ivide | (Z)ero | Show (R)esult | E(x)it : ");
            ctl = mainCtl.next();

            if (ctl.equals("A") || ctl.equals("a")){
                calc1.Add();
            } else if (ctl.equals("S") || ctl.equals("s")) {
                calc1.Subtract();
            } else if (ctl.equals("M") || ctl.equals("m")) {
                calc1.Multiply();
            } else if (ctl.equals("D") || ctl.equals("d")) {
                calc1.Divide();
            } else if (ctl.equals("Z") || ctl.equals("z")) {
                calc1.Zero();
            } else if (ctl.equals("R") || ctl.equals("r")) {
                if (autoRes == false){
                    calc1.ShowRes();
                }
            } else if (ctl.equals("X") || ctl.equals("x")) {
                autoRes = false;
                run = false;
            } else {
                System.out.println("Invalid Action");
            }

            if (autoRes == true){
                calc1.ShowRes();
            }
        }
    }
}
