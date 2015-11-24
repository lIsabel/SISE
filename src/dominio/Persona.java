package dominio;

    /**
     * Clase Persona
     * Proyecto Mantenimiento Asegurados
     * @author Leticia Sánchez Méndez
     * Since Noviembre 2015
     */
public abstract class  Persona {
   protected String identificacion;
   protected String nombre;
   protected String primerApellido;
   protected String segundoApellido;
   protected String provincia;
   protected String canton;
   protected String distrito;
   protected String direccionSennas;
   protected String telefonoCasa;


    public Persona(String identificacion, String nombre, String primerApellido, String segundoApellido,
                   String provincia, String canton, String distrito, String direccionSennas, String telefonoCasa) {
        super();
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.direccionSennas = direccionSennas;
        this.telefonoCasa = telefonoCasa;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCanton() {
        return canton;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDireccionSennas(String direccionSennas) {
        this.direccionSennas = direccionSennas;
    }

    public String getDireccionSennas() {
        return direccionSennas;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }
    //protected String identificacion;
    // protected String nombre;
    // protected String primerApellido;
    // protected String segundoApellido;
    // protected String provincia;
    // protected String canton;
    // protected String distrito;
    // protected String direccionSennas;
    // protected String telefonoCasa;
    public String toString(){
        String vHilera="";
        vHilera += "Identificación" + this.identificacion + "Nombre Completo"+this.nombre+this.primerApellido+this.segundoApellido+
            "Direccion"+this.provincia+this.canton+this.distrito+this.direccionSennas +"Teléfono"+this.telefonoCasa;
        return vHilera;
    }
}
