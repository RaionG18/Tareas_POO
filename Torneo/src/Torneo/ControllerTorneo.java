// Emilio Gordillo, Carnet 18062
// POO - 2023

package Torneo;
import java.util.Scanner;

public class ControllerTorneo {
    private ModelEquipos model;
    private ViewTorneo view;

    public ControllerTorneo() {
        this.model = new ModelEquipos();
        this.view = new ViewTorneo(this);
    }

    public void agregarEquipo(Equipo team) {
        model.agregarEquipo(team);
    }

    public int getTotalGoles() {
        return model.getTotalGoles();
    }

    public int getTotalTirosEsquina() {
        return model.getTotalTirosEsquina();
    }

    public int getTotalTarjetasAmarillas() {
        return model.getTotalTarjetasAmarillas();
    }

    public int getTotalTarjetasRojas() {
        return model.getTotalTarjetasRojas();
    }

    public Equipo getNombreEquipo(String name) {
        return ModelEquipos.getNombreEquipo(name);
    }

    public void showView() {
        view.showMenu();
    }
}
