package generales;

public class Profesor {
    private String nombre;
    private String cedula;
    private Double salario;
    private int horassemanales;
    private Boolean tiempocompleto;

    public Profesor(String nombre, String numeroIdentificacion, Double salarioMensual, int horasSemanales, Boolean esTiempoCompleto) {
        this.nombre = nombre;
        this.cedula = numeroIdentificacion;
        this.salario = salarioMensual;
        this.horassemanales = horasSemanales;
        this.tiempocompleto = esTiempoCompleto;
    }

     public Profesor(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.cedula = numeroIdentificacion;
        this.salario = 0.0;
        this.horassemanales = 10;
        this.tiempocompleto = false;
    }

     public Profesor() {
        this.nombre = "Sin nombre";
        this.cedula = "Sin identificación";
        this.salario = 0.0;
        this.horassemanales = 0;
        this.tiempocompleto = false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }       
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getHorassemanales() {
        return horassemanales;
    }
    public void setHorassemanales(int horassemanales) {
        this.horassemanales = horassemanales;
    }

    public Boolean getTiempocompleto() {
        return tiempocompleto;
    }   
    public void setTiempocompleto(Boolean tiempocompleto) {
        this.tiempocompleto = tiempocompleto;
    }


}
