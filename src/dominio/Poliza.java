package dominio;

public class Poliza {
    private String codAutorizacion; //SM-SESM-05
    private final int consecutivo=1;  //05
    private int anno; //2015

  //Preguntar como generar los codigos SM-SESM-05-00045275-2015
    public Poliza(String codAutorizacion, int anno) {
        super();
        this.codAutorizacion = codAutorizacion;
        this.anno = anno;
    }

    public void setCodAutorizacion(String codAutorizacion) {
        this.codAutorizacion = codAutorizacion;
    }

    public String getCodAutorizacion() {
        return codAutorizacion;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }
}
