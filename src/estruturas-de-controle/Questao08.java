import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        while (numero != 1 && numero != 2 && numero != 3) {
            System.out.print("Digite um número entre 1 e 3: ");
            numero = sc.nextInt();
        }
        System.out.print("Fim do programa!");
    }
}
