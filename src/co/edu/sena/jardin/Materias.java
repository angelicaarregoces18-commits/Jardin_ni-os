package co.edu.sena.jardin;

public class Materias {
    private String nombre;
    private String area;
    private String dificultad;
    private String materialesNecesarios;

    public Materias(String nombre, String area, String dificultad, String materialesNecesarios) {
        this.nombre = nombre;
        this.area = area;
        this.dificultad = dificultad;
        this.materialesNecesarios = materialesNecesarios;
    }

    public String obtenerInformacion() {
        return "Materia: " + nombre + " - Area: " + area +
                " - Dificultad: " + dificultad + " - Materiales: " + materialesNecesarios;
    }

    public boolean esParaPreescolar() {
        return dificultad.equals("Basica");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getMaterialesNecesarios() {
        return materialesNecesarios;
    }

    public void setMaterialesNecesarios(String materialesNecesarios) {
        this.materialesNecesarios = materialesNecesarios;
    }
}
