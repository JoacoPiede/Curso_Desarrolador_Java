package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio3 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Debe proporcionar la operación (codificar o decodificar), el desplazamiento, y los nombres de los archivos de entrada y salida.");
            return;
        }

        String operacion = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];

        try {
            if (operacion.equalsIgnoreCase("codificar")) {
                codificarArchivo(archivoEntrada, archivoSalida, desplazamiento);
            } else if (operacion.equalsIgnoreCase("decodificar")) {
                decodificarArchivo(archivoEntrada, archivoSalida, desplazamiento);
            } else {
                System.out.println("La operación debe ser 'codificar' o 'decodificar'.");
            }
            System.out.println("Proceso completado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }

    public static void codificarArchivo(String archivoEntrada, String archivoSalida, int desplazamiento) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                String lineaCodificada = codificarLinea(linea, desplazamiento);
                writer.write(lineaCodificada);
                writer.newLine();
            }
        }
    }

    public static void decodificarArchivo(String archivoEntrada, String archivoSalida, int desplazamiento) throws IOException {
        // Para decodificar, simplemente utilizamos un desplazamiento negativo
        codificarArchivo(archivoEntrada, archivoSalida, -desplazamiento);
    }

    public static String codificarLinea(String linea, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();

        for (char caracter : linea.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                char codificado = (char) (((caracter - base + desplazamiento) % 26 + 26) % 26 + base);
                resultado.append(codificado);
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}