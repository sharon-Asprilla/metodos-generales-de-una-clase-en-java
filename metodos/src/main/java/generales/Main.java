package generales;

public class Main {
    public static void main(String[] args) {
       Profesor profesor = new Profesor("Ana", "12345", 2500.0, 40, true);

        // Imprimir los atributos del profesor
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Cédula: " + profesor.getCedula());
        System.out.println("Salario: " + profesor.getSalario());
        System.out.println("Horas semanales: " + profesor.getHorassemanales());
        System.out.println("¿Tiempo completo?: " + profesor.getTiempocompleto());
    }
    }
