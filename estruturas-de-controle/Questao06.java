import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite um número inteiro maior que 1: ");
        numero = sc.nextInt();
        
        for(int i=1;i<(numero+1);i++){
            System.out.println(i);
        }
    }
}