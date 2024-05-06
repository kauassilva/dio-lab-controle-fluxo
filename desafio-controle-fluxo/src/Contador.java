import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        
        int contagem = parametroDois - parametroUm;
        
        for (int i=1; i<=contagem; i++)
            System.out.println("Imprimindo o número " + i);
    }

}
