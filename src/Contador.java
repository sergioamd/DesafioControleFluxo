import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scn.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = scn.nextInt();
    
        try {
          // chamando o método contendo a lógica de contagem
          contar(numero1, numero2);
    
        } catch (ParametrosInvalidosException e) {
          // imprimir a mensagem: O segundo numerodeve ser maior que o primeiro
          System.out.println("O segundo numero deve ser maior que o primeiro");
        }
    
      }
    
      static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        // validar se numero1 é MAIOR que numero2 e lançar a exceção
        if (numero1 > numero2)
          throw new ParametrosInvalidosException();
    
        int contagem = numero2 - numero1;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
          System.out.println("Imprimindo número " + i);
        }
      }
    }


