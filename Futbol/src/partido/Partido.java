package partido;

import equipos.Equipo;

public class Partido {

    /*VARIABLES*/
    private Equipo equipo1, equipo2;
    private String resultado;
    private int hora, numeroCancha;

    /*CONSTRUCTORES*/
    public Partido(String resultado, int hora, int numeroCancha, Equipo equipo1, Equipo equipo2) {
        super();
        this.hora = hora;
        this.numeroCancha = numeroCancha;
        this.resultado = resultado;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Partido(int hora, int numeroCancha, Equipo equipo1, Equipo equipo2) {
        super();
        this.hora = hora;
        this.numeroCancha = numeroCancha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    /*GETTERS Y SETTERS*/
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getNumeroCancha() {
        return numeroCancha;
    }

    public void setNumeroCancha(int numeroCancha) {
        this.numeroCancha = numeroCancha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
}
