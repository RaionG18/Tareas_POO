// Emilio Gordillo, Carnet 18062
// POO - 2023

package Torneo;
import java.util.Scanner;

public class ViewTorneo {
    private ControllerTorneo controller;
    private Scanner scanner;

    public ViewTorneo(ControllerTorneo controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println();
        System.out.println("Bienvenido al sistema de estadísticas del torneo de fútbol");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Agregar equipo");
        System.out.println("2. Mostrar estadísticas generales del torneo");
        System.out.println("3. Mostrar estadísticas de un equipo");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (option) {
            case 1:
                agregarEquipo();
                break;
            case 2:
                showGeneralStatistics();
                break;
            case 3:
                showTeamStatistics();
                break;
            case 4:
                System.out.println("Gracias por utilizar el sistema. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                showMenu();
        }
    }

    public void agregarEquipo() {
        System.out.println("Ingrese los datos del equipo:");
        System.out.print("Nombre del equipo: ");
        String name = scanner.nextLine();
        System.out.print("Posicion del equipo: ");
        int posicion = scanner.nextInt();
        System.out.print("Num. de Tiros de Esquina del equipo: ");
        int numTirosEsquina = scanner.nextInt();
        System.out.print("Num. de Juegos Ganados del equipo: ");
        int numJuegosGanados = scanner.nextInt();
        System.out.print("Num. de Juegos Perdidos del equipo: ");
        int numJuegosPerdidos = scanner.nextInt();
        System.out.print("Num. de Tiros a Gol del equipo: ");
        int numTirosAGol = scanner.nextInt();
        System.out.print("Num. de Goles del equipo: ");
        int numGoles = scanner.nextInt();
        System.out.print("Num. de Tarjetas Amarillas del equipo: ");
        int numTarjetasAmarillas = scanner.nextInt();
        System.out.print("Num. de Tarjetas Rojas del equipo: ");
        int numTarjetasRojas = scanner.nextInt();
        System.out.print("Num. de Faltas del equipo: ");
        int numFaltas = scanner.nextInt();


        Equipo team = new Equipo(name, posicion, numTirosEsquina, numJuegosGanados, numJuegosPerdidos,
                numTirosAGol, numGoles, numTarjetasAmarillas, numTarjetasRojas, numFaltas);

        controller.agregarEquipo(team);
        System.out.println("Equipo agregado correctamente.");
        showMenu();
    }

    public void showGeneralStatistics() {
        System.out.println("Estadísticas generales del torneo:");
        System.out.println("Total de goles: " + controller.getTotalGoles());
        System.out.println("Total de tiros de esquina: " + controller.getTotalTirosEsquina());
        System.out.println("Total de tarjetas amarillas: " + controller.getTotalTarjetasAmarillas());
        System.out.println("Total de tarjetas rojas: " + controller.getTotalTarjetasRojas());
        showMenu();
    }

    public void showTeamStatistics() {
        System.out.print("Ingrese el nombre del equipo: ");
        String teamName = scanner.nextLine();
        Equipo team = controller.getNombreEquipo(teamName);
        if (team != null) {
            System.out.println("Estadísticas generales del Equipo:");
            System.out.println("Total de goles: " + team.getNumGoles());
            System.out.println("Total de tiros de esquina: " + team.getNumTirosEsquina());
            System.out.println("Total de tarjetas amarillas: " + team.getNumTarjetasAmarillas());
            System.out.println("Total de tarjetas rojas: " + team.getNumTarjetasRojas());
        } else {
            System.out.println("Equipo no encontrado. Intente nuevamente.");
        }
        showMenu();
    }
}