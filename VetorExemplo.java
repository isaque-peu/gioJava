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
public class Main {
    public static void main(String[] args) {
        String texto = "Java";
        System.out.println("Quantidade de caracteres: " + texto.length());
    }
}
//exercicio 11//
public class Main {
    public static void main(String[] args) {
        String texto = "java";
        System.out.println(texto.toUpperCase());
    }
}
//exercicio 12//
public class Main {
    public static void main(String[] args) {
        String texto = "JAVA";
        System.out.println(texto.toLowerCase());
    }
}
//exercicio 13//
public class Main {
    public static void main(String[] args) {
        String frase = "Eu gosto de Java";
        
        if (frase.contains("Java")) {
            System.out.println("A frase contém a palavra!");
        } else {
            System.out.println("Não contém!");
        }
    }
}
//exercicio 14//
public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        if (a.equals(b)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
//exercicio 15//
public class Main {
    public static void main(String[] args) {
        String texto = "Java";

        char primeiro = texto.charAt(0);
        char ultimo = texto.charAt(texto.length() - 1);

        System.out.println("Primeiro: " + primeiro);
        System.out.println("Último: " + ultimo);
    }
}
// exercicio 16//
public class Main {
    public static void main(String[] args) {
        String palavra = "programacao";
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);
    }
}
// exercicio 17//
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//exercicio 18//
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}
//exercicio 19//
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
//exercicio 20//
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 10}
        };

        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + contador);
    }
}
//exercicio A//
public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Eduardo", "Joao"};

        for (String nome : nomes) {
            if (nome.length() > 5) {
                System.out.println(nome);
            }
        }
    }
}
//exercicio B//
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 20, 3},
            {4, 5, 60},
            {7, 8, 9}
        };

        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);
    }
}
//exercicio C//
public class Main {
    public static void main(String[] args) {
        String texto = "banana";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("Quantidade de 'a': " + contador);
    }
}
