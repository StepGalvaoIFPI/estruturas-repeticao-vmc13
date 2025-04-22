import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, ir, inss;
        
        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        
        if (salario > 2000) {
            ir = salario * 0.15;
            inss = salario * 0.10;
        } else {
            ir = 0.0;
            inss = 0.0;
        }
        
        System.out.printf("Salário: R$%.2f\n", salario);
        System.out.printf("Imposto de renda: R$%.2f\n", ir);
        System.out.printf("INSS: R$%.2f\n", inss);
    }
}
