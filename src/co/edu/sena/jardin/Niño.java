package co.edu.sena.jardin;

public class Niño {
    private String nombre;
    private int edad;
    private String grupo;
    private String nombreTutor;
    private String telefonoContacto;

    public Niño(String nombre, int edad, String grupo, String nombreTutor, String telefonoContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
        this.nombreTutor = nombreTutor;
        this.telefonoContacto = telefonoContacto;
    }

    public String obtenerInformacion() {
        return "Niño: " + nombre + " (" + edad + " años) - Grupo: " + grupo +
                " - Tutor: " + nombreTutor + " - Tel: " + telefonoContacto;
    }

    public boolean puedeLeer() {
        return edad >= 4;
    }

    // Getters y Setters...
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getGrupo() { return grupo; }
    public void setGrupo(String grupo) { this.grupo = grupo; }
    public String getNombreTutor() { return nombreTutor; }
    public void setNombreTutor(String nombreTutor) { this.nombreTutor = nombreTutor; }
    public String getTelefonoContacto() { return telefonoContacto; }
    public void setTelefonoContacto(String telefonoContacto) { this.telefonoContacto = telefonoContacto; }
}