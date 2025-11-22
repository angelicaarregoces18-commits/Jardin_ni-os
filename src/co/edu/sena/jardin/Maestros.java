package co.edu.sena.jardin;

public class Maestros {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;
    private String grupoAsignado;

    public Maestros(String nombre, String especialidad, int añosExperiencia, String grupoAsignado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.grupoAsignado = grupoAsignado;
    }

    public String obtenerInformacion() {
        return "Maestro: " + nombre + " - Especialidad: " + especialidad +
                " - Experiencia: " + añosExperiencia + " años - Grupo: " + grupoAsignado;
    }

    public boolean esTitular() {
        return grupoAsignado != null && !grupoAsignado.isEmpty();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getGrupoAsignado() {
        return grupoAsignado;
    }

    public void setGrupoAsignado(String grupoAsignado) {
        this.grupoAsignado = grupoAsignado;
    }
}
