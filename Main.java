import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Pra ler do terminal/teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Iniciando Testes da Calculadora ---");
        
        // Criando uma instância da classe Calculadora
        Calculadora calc = new Calculadora();

        System.out.print("Digite a primeira parcela: ");
        int parcela1 = scanner.nextInt();
        
        System.out.print("Digite a segunda parcela: ");
        int parcela2 = scanner.nextInt();

        int resultadoSoma = calc.somar(parcela1, parcela2);
        System.out.println("Resultado da soma: " + resultadoSoma);

        scanner.close();   

    }
}
