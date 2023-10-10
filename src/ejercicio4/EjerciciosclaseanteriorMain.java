package ejercicio4;

import java.util.Scanner;

public class EjerciciosclaseanteriorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números separados por espacios:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea

        System.out.println("Ingrese 'A' para ascendente o 'D' para descendente:");
        char orden = scanner.nextLine().charAt(0);

        if (orden == 'A') {
            ordenarYMostrarNumeros(num1, num2, num3, true);
        } else if (orden == 'D') {
            ordenarYMostrarNumeros(num1, num2, num3, false);
        } else {
            System.out.println("La letra de orden debe ser 'A' para ascendente o 'D' para descendente.");
        }

        scanner.close();
    }

    public static void ordenarYMostrarNumeros(int num1, int num2, int num3, boolean ascendente) {
        int[] numeros = { num1, num2, num3 };
        int[] numerosOrdenados = ordenarNumeros(numeros, ascendente);

        System.out.print("Números ordenados: ");
        for (int num : numerosOrdenados) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] ordenarNumeros(int[] numeros, boolean ascendente) {
        int[] numerosOrdenados = copiarArray(numeros);

        for (int i = 0; i < numerosOrdenados.length - 1; i++) {
            for (int j = 0; j < numerosOrdenados.length - i - 1; j++) {
                if (ascendente) {
                    if (numerosOrdenados[j] > numerosOrdenados[j + 1]) {
                        int temp = numerosOrdenados[j];
                        numerosOrdenados[j] = numerosOrdenados[j + 1];
                        numerosOrdenados[j + 1] = temp;
                    }
                } else {
                    if (numerosOrdenados[j] < numerosOrdenados[j + 1]) {
                        int temp = numerosOrdenados[j];
                        numerosOrdenados[j] = numerosOrdenados[j + 1];
                        numerosOrdenados[j + 1] = temp;
                    }
                }
            }
        }
        return numerosOrdenados;
    }

    public static int[] copiarArray(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }
}