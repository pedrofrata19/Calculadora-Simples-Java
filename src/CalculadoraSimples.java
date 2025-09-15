import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("<----- Calculadora Simples -----> ");
        char resposta;

        do {
            System.out.print("Digite o primeiro numero: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double num2 = sc.nextDouble();

            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int operacao = sc.nextInt();
            double resultado = 0;
            boolean operacaoValida = true;

            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    operacaoValida = false;
                    break;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja continuar usando a calculadora? (s/n) ");
            resposta = sc.next().toLowerCase().charAt(0);
            System.out.println();

        } while (resposta != 'n');

        System.out.println("Encerrando Calculadora!");
        sc.close();
    }
}

