package ejercicio;

public class Ejercicios {

    public static void main(String[] args) {
        // Ejercicio 1a
/*  a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
	y “b”. Su código puede arrancar (por ejemplo):*/
        int numeroInicio1 = 5;
        int numeroFin1 = 14;
        imprimirNumeros(numeroInicio1, numeroFin1);

        // Ejercicio 1b
        int numeroInicio2 = 5;
        int numeroFin2 = 14;
        imprimirNumerosPares(numeroInicio2, numeroFin2);

        // Ejercicio 1c
        int numeroInicio3 = 5;
        int numeroFin3 = 14;
        boolean mostrarPares = true; // Cambiar según lo necesites
        imprimirNumerosSegunVariable(numeroInicio3, numeroFin3, mostrarPares);

        // Ejercicio 1d
        int numeroInicio4 = 14;
        int numeroFin4 = 5;
        imprimirNumerosParesInverso(numeroInicio4, numeroFin4);

        // Ejercicio 2
        double ingresos = 500000; // Cambiar el valor según los ingresos
        int vehiculos = 4; // Cambiar el valor según la cantidad de vehículos
        int inmuebles = 2; // Cambiar el valor según la cantidad de inmuebles
        boolean poseeActivosSocietarios = false; // Cambiar a true si posee activos societarios
        boolean poseeEmbarcacionOAvion = false; // Cambiar a true si posee embarcación o aeronave de lujo
        verificarIngresosAltos(ingresos, vehiculos, inmuebles, poseeActivosSocietarios, poseeEmbarcacionOAvion);
    }

    // Métodos para los ejercicios

    public static void imprimirNumeros(int inicio, int fin) {
        for (int numeroActual = inicio; numeroActual <= fin; numeroActual++) {
            System.out.print(numeroActual);
            if (numeroActual < fin) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void imprimirNumerosPares(int inicio, int fin) {
        for (int numeroActual = inicio; numeroActual <= fin; numeroActual++) {
            if (numeroActual % 2 == 0) {
                System.out.print(numeroActual);
                if (numeroActual < fin) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void imprimirNumerosSegunVariable(int inicio, int fin, boolean mostrarPares) {
        for (int numeroActual = inicio; numeroActual <= fin; numeroActual++) {
            if ((mostrarPares && numeroActual % 2 == 0) || (!mostrarPares && numeroActual % 2 != 0)) {
                System.out.print(numeroActual);
                if (numeroActual < fin) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void imprimirNumerosParesInverso(int inicio, int fin) {
        for (int numeroActual = inicio; numeroActual >= fin; numeroActual--) {
            if (numeroActual % 2 == 0) {
                System.out.print(numeroActual);
                if (numeroActual > fin) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void verificarIngresosAltos(double ingresos, int vehiculos, int inmuebles, boolean poseeActivosSocietarios, boolean poseeEmbarcacionOAvion) {
        if (ingresos >= 489083 ||
            (vehiculos >= 3 || inmuebles >= 3 || poseeActivosSocietarios || poseeEmbarcacionOAvion)) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("No pertenece al segmento de ingresos altos");
        }
    }
}