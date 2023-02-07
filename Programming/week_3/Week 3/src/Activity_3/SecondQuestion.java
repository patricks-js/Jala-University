package Activity_3;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int opcao = 0;
        float x;
        float y;
        float resultado;
        while(opcao != 5){
            System.out.println("Digite uma das opcoes desejadas:");
            System.out.println("1. Somar dois numeros");
            System.out.println("2. Subtrair dois numeros");
            System.out.println("3. Multiplicar dois numeros");
            System.out.println("4. Dividir dois numeros");
            System.out.println("5. SAIR");
            opcao = keyboardInput.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor de x: ");
                    x = keyboardInput.nextFloat();
                    System.out.print("Digite o valor de y: ");
                    y = keyboardInput.nextFloat();
                    resultado = x + y;
                    System.out.println("O resultado da soma eh: " + resultado);
                    break;
                case 2:
                    System.out.print("Digite o valor de x: ");
                    x = keyboardInput.nextFloat();
                    System.out.print("Digite o valor de y: ");
                    y = keyboardInput.nextFloat();
                    resultado = x - y;
                    System.out.println("O resultado da subtracao eh: " + resultado);
                    break;
                case 3:
                    System.out.print("Digite o valor de x: ");
                    x = keyboardInput.nextFloat();
                    System.out.print("Digite o valor de y: ");
                    y = keyboardInput.nextFloat();
                    resultado = x * y;
                    System.out.println("O resultado da subtracao eh: " + resultado);
                    break;
                case 4:
                    System.out.print("Digite o valor de x: ");
                    x = keyboardInput.nextFloat();
                    System.out.print("Digite o valor de y: ");
                    y = keyboardInput.nextFloat();
                    resultado = x / y;
                    System.out.println("O resultado da subtracao eh: " + resultado);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    System.out.println();
                    break;
            }
        }
    }
}
