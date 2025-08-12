package generales;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("rosa", "328954671", 2500.0, 30, true);

        System.out.println("_____________información del profesor_____________");
        profesor.mostrarInformacion();

        System.out.println("_____________calculo de salario mensual_____________");
        double salarioMensual = profesor.getSalario();
        System.out.println("Salario mensual: " + salarioMensual);

        System.out.println("_____________información del curso_____________");
        Curso curso = new Curso("Matemáticas");
        curso.asignarProfesor(profesor);
    }
}
