// Emilio Gordillo, Carnet 18062
// POO - 2023

package Torneo;
import java.util.ArrayList;
import java.util.List;

public class ModelEquipos {
    private static List<Equipo> equipos;

    public ModelEquipos() {
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public int getTotalGoles() {
        int totalGoles = 0;
        for (Equipo team : equipos) {
            totalGoles += team.getNumGoles();
        }
        return totalGoles;
    }

    public int getTotalTirosEsquina() {
        int TotalTirosEsquina = 0;
        for (Equipo team : equipos) {
            TotalTirosEsquina += team.getNumTirosEsquina();
        }
        return TotalTirosEsquina;
    }

    public int getTotalTarjetasAmarillas() {
        int TotalTarjetasAmarillas = 0;
        for (Equipo team : equipos) {
            TotalTarjetasAmarillas += team.getNumTarjetasAmarillas();
        }
        return TotalTarjetasAmarillas;
    }

    public int getTotalTarjetasRojas() {
        int TotalTarjetasRojas = 0;
        for (Equipo team : equipos) {
            TotalTarjetasRojas += team.getNumTarjetasRojas();
        }
        return TotalTarjetasRojas;
    }

    public static Equipo getNombreEquipo(String name) {
        for (Equipo team : equipos) {
            if (team.getNombreEquipo().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }
}

