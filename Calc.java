import java.util.Scanner;

public class Calc {
    float res;
    Scanner input = new Scanner(System.in);

    public Calc(float res){
        this.res = res;
    }

    public void Add() {
        System.out.println("Value to be added: ");
        res += input.nextFloat();
    }

    public void Subtract() {
        System.out.println("Value to be subtracted: ");
        res -= input.nextFloat();
    }
    public void Multiply() {
        System.out.println("Multiply by: ");
        res *= input.nextFloat();
    }
    public void Divide() {
        System.out.println("Divide by: ");
        float div = input.nextFloat();
        if (div != 0) {
            res /= div;
        }
        else {
            System.out.println("Error: Division by zero");
        }
    }
    public void Zero() {
        res = 0;
    }
    public void ShowRes() {
        System.out.println("Result: " + res);
    }
}
