import java.util.Scanner;

public class Calc {
    float res;
    Scanner input = new Scanner(System.in);

    public Calc(float res){
        this.res = res;
    }

    public void Somar() {
        System.out.println("Valor a ser somado: ");
        res += input.nextFloat();
    }

    public void Subtrair() {
        System.out.println("Valor a ser subtraido: ");
        res -= input.nextFloat();
    }
    public void Multiplicar() {
        System.out.println("Multiplicar por: ");
        res *= input.nextFloat();
    }
    public void Dividir() {
        System.out.println("Divisor: ");
        float div = input.nextFloat();
        if (div != 0) {
            res /= div;
        }
        else {
            System.out.println("Erro: Divisão por zero");
        }
    }
    public void Zerar() {
        res = 0;
    }
    public void Exibir() {
        System.out.println("Resultado: " + res);
    }
}
