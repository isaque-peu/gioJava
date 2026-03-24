//exercicio 01//
public class SomaVetor {
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50, 60};
        int soma = 0;

        // Somando os elementos
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        // Mostrando o resultado
        System.out.println("A soma dos elementos é: " + soma);
    }
}
//exercicio 02//
public class MaiorValorVetor {
    public static void main(String[] args) {

        int[] vetor = {12, 45, 7, 89, 23, 56, 90, 34};
        
        int maior = vetor[0]; // assume o primeiro como maior

        // Percorrendo o vetor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // Mostrando o resultado
        System.out.println("O maior valor do vetor é: " + maior);
    }
}
//exercicio 03//
public class MaiorValorVetor {
    public static void main(String[] args) {
        
        int[] numeros = {10, 25, 7, 89, 34, 2, 56, 18};
        
        int maior = numeros[0]; // assume o primeiro como maior
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("O maior valor do vetor é: " + maior);
    }
}
//exercicio 04//
public class MenorValorVetor {
    public static void main(String[] args) {
        
        int[] numeros = {10, 25, 7, 89, 34, 2, 56, 18};
        
        int menor = numeros[0]; // assume o primeiro como menor
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("O menor valor do vetor é: " + menor);
    }
}
//exercicio 05//
public class MediaVetor {
    public static void main(String[] args) {
        
        // Criando o vetor com 5 notas
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
        
        double soma = 0;
        
        // Somando os valores
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        
        // Calculando a média
        double media = soma / notas.length;
        
        // Mostrando o resultado
        System.out.println("Média: " + media);
    }
}
//exercicio 06//
public class ContarPares {
    public static void main(String[] args) {
        int[] numeros = {10, 3, 4, 7, 8, 15, 20, 1, 6, 9};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares: " + contador);
    }
}
//exercicio 07//
public class MostrarPosicoes {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
    }
}
//exercicio 08//
import java.util.Scanner;

public class BuscarValor {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para buscar: ");
        int valor = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado no vetor!");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
//exercicio 09//
public class ExibirString {
    public static void main(String[] args) {
        String nome = "Edson";

        System.out.println("Meu nome é " + nome);
    }
}
//exercicio 10//
