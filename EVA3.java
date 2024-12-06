import java.util.Scanner;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de estudiantes
        System.out.println("Ingrese el número de estudiantes: ");
        int estudiantes = scanner.nextInt();
        while (estudiantes <= 0) {
            System.out.println("El número debe ser mayor a 0. Intente de nuevo: ");
            estudiantes = scanner.nextInt();
        }

        // Crear arreglo y leer calificaciones
        double[] calificaciones = new double[estudiantes];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la calificación del estudiante %d (0-100): ", i + 1);
            calificaciones[i] = scanner.nextDouble();
            while (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("Calificación inválida. Intente de nuevo: ");
                calificaciones[i] = scanner.nextDouble();
            }
            suma += calificaciones[i];
        }

        // Calcular promedio
        double promedio = suma / estudiantes;

        // Determinar cuántas calificaciones son mayores o iguales al promedio
        int mayoresOIguales = 0;
        double max = calificaciones[0], min = calificaciones[0];
        for (double cal : calificaciones) {
            if (cal >= promedio) mayoresOIguales++;
            if (cal > max) max = cal;
            if (cal < min) min = cal;
        }

        // Mostrar resultados
        System.out.printf("Promedio de calificaciones: %.2f%n", promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.printf("Calificación más alta: %.2f%n", max);
        System.out.printf("Calificación más baja: %.2f%n", min);

        scanner.close();
    }
