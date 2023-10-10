package ejercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Debe proporcionar la operación ('suma' o 'multiplicacion').");
            return;
        }

        String operacion = args[1]; // Cambiar de args[0] a args[1]

        try {
            double resultado = calcularResultado("recursos/texto.txt", operacion);
            System.out.println("Resultado de la " + operacion + ": " + resultado);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo debe contener números válidos.");
        }
    }

    public static double calcularResultado(String rutaArchivo, String operacion) throws IOException {
        double resultado = (operacion.equalsIgnoreCase("suma")) ? 0 : 1;

        Path archivo = Path.of(rutaArchivo);
        List<String> lineas = Files.readAllLines(archivo);

        for (String linea : lineas) {
            double numero = Double.parseDouble(linea);
            if (operacion.equalsIgnoreCase("suma")) {
                resultado += numero;
            } else if (operacion.equalsIgnoreCase("multiplicacion")) {
                resultado *= numero;
            } else {
                throw new IllegalArgumentException("La operación debe ser 'suma' o 'multiplicacion'.");
            }
        }

        return resultado;
    }
}