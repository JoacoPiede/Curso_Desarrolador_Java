package ejercicio;

public class ejerciciostp3 {
    public static void main(String[] args) {
        // Ejercicio 1a: Contar apariciones de una letra en un String
        String cadena = "hola que tal";
        char letra = 'a';
        int contador = contarLetra(cadena, letra);
        System.out.println("Ejercicio 1a: Apariciones de '" + letra + "' en '" + cadena + "': " + contador);

        // Ejercicio 1b: Ordenar números en ascendente o descendente
        int[] numeros = {3, 1, 2};
        int[] numerosOrdenados = ordenarNumeros(numeros, true); // true para ascendente, false para descendente
        System.out.print("Ejercicio 1b: Números ordenados: ");
        imprimirArray(numerosOrdenados);

        // Ejercicio 1c: Sumar números mayores que X en un vector
        int x = 2;
        int[] vector = {3, 1, 2, 4, 5};
        int suma = sumarMayoresQueX(vector, x);
        System.out.println("Ejercicio 1c: Suma de números mayores que " + x + ": " + suma);
    }

    // Ejercicio 1a: Contar apariciones de una letra en un String
    public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    // Ejercicio 1b: Ordenar números en ascendente o descendente
    public static int[] ordenarNumeros(int[] numeros, boolean ascendente) {
        int[] numerosOrdenados = copiarArray(numeros);
        if (ascendente) {
            for (int i = 0; i < numerosOrdenados.length - 1; i++) {
                for (int j = 0; j < numerosOrdenados.length - i - 1; j++) {
                    if (numerosOrdenados[j] > numerosOrdenados[j + 1]) {
                        int temp = numerosOrdenados[j];
                        numerosOrdenados[j] = numerosOrdenados[j + 1];
                        numerosOrdenados[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < numerosOrdenados.length - 1; i++) {
                for (int j = 0; j < numerosOrdenados.length - i - 1; j++) {
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

    // Ejercicio 1c: Sumar números mayores que X en un vector
    public static int sumarMayoresQueX(int[] vector, int x) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > x) {
                suma += vector[i];
            }
        }
        return suma;
    }

    // Método para copiar un array
    public static int[] copiarArray(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }

    // Método para imprimir un array
    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}