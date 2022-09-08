import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner mainCtl = new Scanner(System.in);
        String ctl;
        boolean run = true;
        boolean autoRes = false;
        Calc calc1 = new Calc(0);
        System.out.println("** Aviso: Insira os números decimais de acordo com o formato do seu sistema (0,1 ou 0.1)");

        System.out.println("Mostrar resultado automaticamente?\n(S)im | (N)ão : ");
        ctl = mainCtl.next();
        if (ctl.equals("S") || ctl.equals("s")){
            autoRes = true;
        }

        while (run == true){
            System.out.println("\nOperação a ser realizada: \n(So)ma | (Su)btração | (M)ultiplicação | (D)ivisão | (Z)erar | (R)esultado | (F)echar : ");
            ctl = mainCtl.next();

            if (ctl.equals("So") || ctl.equals("so")){
                calc1.Somar();
            } else if (ctl.equals("Su") || ctl.equals("su")) {
                calc1.Subtrair();
            } else if (ctl.equals("M") || ctl.equals("m")) {
                calc1.Multiplicar();
            } else if (ctl.equals("D") || ctl.equals("d")) {
                calc1.Dividir();
            } else if (ctl.equals("Z") || ctl.equals("z")) {
                calc1.Zerar();
            } else if (ctl.equals("R") || ctl.equals("r")) {
                if (autoRes == false){
                    calc1.Exibir();
                }
            } else if (ctl.equals("F") || ctl.equals("f")) {
                autoRes = false;
                run = false;
            } else {
                System.out.println("Ação Inválida");
            }

            if (autoRes == true){
                calc1.Exibir();
            }
        }
    }
}
