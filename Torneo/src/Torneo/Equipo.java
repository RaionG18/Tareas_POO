package Torneo;

// Modelo
public class Equipo {
    // Variables de instancia (atributos)
    private String nombreEquipo;
    private int posicionEnTorneo;
    private int numTirosEsquina;
    private int numJuegosGanados;
    private int numJuegosPerdidos;
    private int numTirosAGol;
    private int numGoles;
    private int numTarjetasAmarillas;
    private int numTarjetasRojas;
    private int numFaltas;

    // Constructor
    public Equipo(String nombreEquipo, int posicionEnTorneo, int numTirosEsquina,
                  int numJuegosGanados, int numJuegosPerdidos, int numTirosAGol,
                  int numGoles, int numTarjetasAmarillas, int numTarjetasRojas,
                  int numFaltas) {
        this.nombreEquipo = nombreEquipo;
        this.posicionEnTorneo = posicionEnTorneo;
        this.numTirosEsquina = numTirosEsquina;
        this.numJuegosGanados = numJuegosGanados;
        this.numJuegosPerdidos = numJuegosPerdidos;
        this.numTirosAGol = numTirosAGol;
        this.numGoles = numGoles;
        this.numTarjetasAmarillas = numTarjetasAmarillas;
        this.numTarjetasRojas = numTarjetasRojas;
        this.numFaltas = numFaltas;
    }

    // Funciones get (obtener valor)
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getPosicionEnTorneo() {
        return posicionEnTorneo;
    }

    public int getNumTirosEsquina() {
        return numTirosEsquina;
    }

    public int getNumJuegosGanados() {
        return numJuegosGanados;
    }

    public int getNumJuegosPerdidos() {
        return numJuegosPerdidos;
    }

    public int getNumTirosAGol() {
        return numTirosAGol;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public int getNumTarjetasAmarillas() {
        return numTarjetasAmarillas;
    }

    public int getNumTarjetasRojas() {
        return numTarjetasRojas;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    // Funciones set (asignar nuevo valor)
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setPosicionEnTorneo(int posicionEnTorneo) {
        this.posicionEnTorneo = posicionEnTorneo;
    }

    public void setNumTirosEsquina(int numTirosEsquina) {
        this.numTirosEsquina = numTirosEsquina;
    }

    public void setNumJuegosGanados(int numJuegosGanados) {
        this.numJuegosGanados = numJuegosGanados;
    }

    public void setNumJuegosPerdidos(int numJuegosPerdidos) {
        this.numJuegosPerdidos = numJuegosPerdidos;
    }

    public void setNumTirosAGol(int numTirosAGol) {
        this.numTirosAGol = numTirosAGol;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public void setNumTarjetasAmarillas(int numTarjetasAmarillas) {
        this.numTarjetasAmarillas = numTarjetasAmarillas;
    }

    public void setNumTarjetasRojas(int numTarjetasRojas) {
        this.numTarjetasRojas = numTarjetasRojas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }
}
