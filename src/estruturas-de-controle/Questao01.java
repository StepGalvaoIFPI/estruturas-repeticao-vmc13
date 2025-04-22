import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a velocidade: ");
        int velocidade = Integer.valueOf(sc.nextLine());
        
        if (velocidade < 80) {
            System.out.println("Verde");
        } else {
            System.out.println("Vermelho");
        }
    }
}
