package FluxControl;

import java.util.Scanner;

import FluxControl.Exception.ParametroInvalidoException;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o numero 1:");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o numero 2:");
        int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm,parametroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println("O parametro dois deve ser maior que o parametro um");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {

        if(parametroUm > parametroDois) {
            throw new ParametroInvalidoException();
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i++) {
            System.out.println("Numero "+i);
        }
    }

}
