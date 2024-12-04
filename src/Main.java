import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora: ");
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Agora digite um numero de 1 a 5 correspondente as operações abaixo:");

        System.out.println("1 para Adição");
        System.out.println("2 para Subtração ");
        System.out.println("3 para Multiplicação");
        System.out.println("4 para Divisão");
        System.out.println("5 para Resto da divisão (Módulo)");

        int numOperacao = scanner.nextInt();

        System.out.println("Agora digite o segundo número: ");
        int num2 = scanner.nextInt();

        switch (numOperacao) {
            case 1:
                System.out.println("Resultado de " + num1 + "+" + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado de " + num1 + "-" + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado de " + num1 + "x" + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Operação inválida: Erro ao dividir por 0.");
                    break;
                }
                System.out.println("Resultado de " + num1 + "/" + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println("Resultado de " + num1 + "%" + num2 + " = " + (num1 % num2));
                break;
        }

        scanner.close();
    }
}