package dominio;

public class Beneficiario extends Persona {
    private String parentesco;
    private int porcentaje;

    public Beneficiario(String identificacion, String nombre, String primerApellido, String segundoApellido,
                        String provincia, String canton, String distrito, String direccionSennas, String telefonoCasa,
                        String pParentesco, int pPorcentaje) {
        super(identificacion, nombre, primerApellido, segundoApellido, provincia, canton, distrito, direccionSennas,
              telefonoCasa);
        this.setParentesco(pParentesco);
        this.setPorcentaje(pPorcentaje);
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
}
