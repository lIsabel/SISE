package dominio;

public class Asegurado extends Persona {
    private String profesion;
    private String nivelEscolaridad;
    private double ingresos;

    public Asegurado(String identificacion, String nombre, String primerApellido, String segundoApellido,
                     String provincia, String canton, String distrito, String direccionSennas, String telefonoCasa,
                     String pProfesion, String pNivelEscolaridad, double pIngresos) {
        super(identificacion, nombre, primerApellido, segundoApellido, provincia, canton, distrito, direccionSennas,
              telefonoCasa);
        this.setProfesion(pProfesion);
        this.setNivelEscolaridad(pNivelEscolaridad);
        this.setIngresos(pIngresos);
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getIngresos() {
        return ingresos;
    }
}
