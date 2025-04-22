import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, aumento, novo_salario;
        
        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        
        if (salario > 1250) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
        
        novo_salario = aumento + salario;
        
        System.out.printf("Aumento: R$%.2f\n", aumento);
        System.out.printf("Novo salário: R$%.2f\n", novo_salario);
    }
}
