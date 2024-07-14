import java.util.Scanner;

public class ContadorTeste {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);

        
        System.out.print("Primeiro parâmetro: ");
        int parametro1 = scr.nextInt();
        System.out.print("Segundo parâmetro: ");
        int parametro2 = scr.nextInt();


        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


        scr.close();
    }

    static void contar(int parametro1,int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;


        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);            
        }
    }
}
