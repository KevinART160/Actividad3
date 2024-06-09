package dane;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDepartamento {
    public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---MENU DE OPCIONES---:");
            System.out.println("1. Ingresar datos de un departamento");
            System.out.println("2. Mostrar análisis de datos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarDatosDepartamento(scanner, departamentos);
                    break;
                case 2:
                    if (departamentos.isEmpty()) {
                        System.out.println("No hay datos disponibles.");
                    } else {
                        System.out.println();
                        System.out.println("---Analisis de Datos---");
                        analizarDatos(departamentos);
                        
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println(); // Agregar un espacio después del menú de opciones
        }
    }

    private static void ingresarDatosDepartamento(Scanner scanner, ArrayList<Departamento> departamentos) {
        System.out.print("Ingrese el nombre del departamento: ");
        scanner.nextLine();  // Clear the buffer
        String nombreDepartamento = scanner.nextLine();

        System.out.print("Ingrese el número de municipios: ");
        int numMunicipios = scanner.nextInt();

        for (int i = 0; i < numMunicipios; i++) {
            System.out.println("Municipio " + (i + 1) + ":");
            System.out.print("Ingrese la extensión de tierra (en mt2): ");
            double extension = scanner.nextDouble();
            System.out.print("Ingrese el número de habitantes: ");
            int numHabitantes = scanner.nextInt();
            System.out.print("Ingrese la temperatura promedio (en grados Celsius): ");
            double temperatura = scanner.nextDouble();
            System.out.print("Ingrese el indicativo telefónico: ");
            String indicativo = scanner.next();

            Departamento departamento = new Departamento(nombreDepartamento, numMunicipios, extension, numHabitantes, temperatura, indicativo);
            departamentos.add(departamento);
        }
    }

    private static void analizarDatos(ArrayList<Departamento> departamentos) {
        Departamento mayorExtension = departamentos.get(0);
        Departamento menorTemperatura = departamentos.get(0);
        Departamento mayorHabitantes = departamentos.get(0);
        Departamento menorExtension = departamentos.get(0);

        for (Departamento dept : departamentos) {
            if (dept.getExtension() > mayorExtension.getExtension()) {
                mayorExtension = dept;
            }
            if (dept.getTemperatura() < menorTemperatura.getTemperatura()) {
                menorTemperatura = dept;
            }
            if (dept.getNumHabitantes() > mayorHabitantes.getNumHabitantes()) {
                mayorHabitantes = dept;
            }
            if (dept.getExtension() < menorExtension.getExtension()) {
                menorExtension = dept;
            }
        }

        System.out.println("Departamento con mayor extensión: " + mayorExtension);
        System.out.println("Departamento con menor temperatura: " + menorTemperatura);
        System.out.println("Departamento con mayor número de habitantes: " + mayorHabitantes);
        System.out.println("Departamento con menor extensión: " + menorExtension);
    }
}
