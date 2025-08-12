package generales;

public class Curso {


    private String nombreCurso;
    private Profesor profesorAsignado;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.profesorAsignado = null;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesorAsignado = profesor;
        System.out.println("Profesora " + profesor.getNombre() + " asignada al curso de " + nombreCurso + ".");
    }

    public void mostrarInformacionCurso() {
        System.out.println("Nombre del curso: " + nombreCurso);
        if (profesorAsignado != null) {
            System.out.println("Profesora asignado: " + profesorAsignado.getNombre());
        } else {
            System.out.println("No hay profesor asignado.");
        }
    }

    // Getters y setters opcionales
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }
}
