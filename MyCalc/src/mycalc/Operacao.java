package mycalc;

import java.util.Scanner;

public class Operacao {
    public double soma(){
        double n1, n2;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Insira um número");
        n1 = scn.nextDouble();
        
        System.out.println("Insira outro número");
        n2 = scn.nextDouble();
        
        return n1 + n2;
        
    }
}
