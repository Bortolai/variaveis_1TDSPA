package fiap.tds.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays ou vetores
        var nomes = new String[] {"João", "Maria", "José"};
        var numeros = new int[] {1,2,3,4,5,6,7,8};

        // for tradicional
        // para 1 = 0; i < tamanho do vetor; i++
        for(int i = 0; i< numeros.length; i++)
            System.out.println(numeros[i]);

        // para cada número dentro do vetor de nomes
        for(var nome : nomes)
            // imprime o nome
            System.out.println(nome);

        // while
        System.out.println("While: ");
        var contador = 0;
        while(contador < nomes.length)
            System.out.println(nomes[contador++]);

    }

        public static void variaveisEcondicionais(){
            var calculo = 1 + 2 - (3 * 2) / 5.0;
            System.out.println(calculo);
            calculo++;
            System.out.println(calculo);
            calculo--;
            System.out.println(calculo);

            //condicionais();
            var scanner = new Scanner(System.in);
            System.out.println("Digite a idade: ");
            var idade = scanner.nextInt();
            scanner.nextLine();

            if(idade >= 18 && idade <= 200)
                System.out.println("A pessoa é maior de idade");
            else if (idade > 200)
                System.out.println("A pessoa é um vampiro");
            else
                System.out.println("A pessoa é menor de idade");

            var notaDDD = 8;
            var notaCPT = 3;
            var notaBD = 10;

            System.out.println(
                    notaDDD < 6 || notaCPT < 6 || notaBD < 6 ? "Reprovado em pelo menos uma disciplina, " +
                            "nao irá se formar no tempo minimo" : "Aprovado em todas as matérias");

            System.out.println("Digite o numero");
            var numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println(numero % 2 == 0 ? "o número é par" : "o número é ímpar");
        }

        public static void variaveis(){
            System.out.println("Sistema iniciando...");

            var scan = new Scanner(System.in);
            System.out.println("Digite o numero 1: ");
            var numero1 = scan.nextBigDecimal();
            scan.nextLine();
            System.out.println("Digite o número 2: ");
            var numero2 = scan.nextBigDecimal();
            scan.nextLine();

            System.out.println(numero1.add(numero2));

            String nome = "FIAP";
            System.out.println(nome);

            int numero = 10;
            System.out.println(numero + 10);

            double valor = 10.5;
            System.out.println(numero + 10.5);

            long valorGrande = 1000000000000000L;
            short valorPequeno = 10;
            var valorpequeno = (short) 10;

            char letra = 'A';
            boolean condição = true;

            var temp = 30.5;
            System.out.println("A temp é de: " + temp + "graus");

            var numeroTexto = "10";
            //conversão explícita de string para int
            var numeroConvertido = Integer.parseInt(numeroTexto);

            //declaração de variáveis
            int idade;
            //inicialização de variaveis
            idade = 10;
            idade = 20;
            idade = 30;
            //declaração e inicialização
            int idade2 = 10;

            System.out.println("Sistema finalizando...");
        }
        }

