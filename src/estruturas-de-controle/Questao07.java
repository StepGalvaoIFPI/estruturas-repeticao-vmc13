import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        while (numero != 1) {
            System.out.print("Digite o número 1: ");
            numero = sc.nextInt();
        }
        System.out.print("Fim do programa!");
    }
}
