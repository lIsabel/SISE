package dominio;

import java.text.DecimalFormat;

public class Producto {
    private String codigoProducto;
    private String descripcionProducto;
    private String codigoAutorizacion;
    private String lineaSeguro;
    private String Modalidad;
    private double montoMinimo;
    private double montoMaximo;
    private int tasaFactor;
    private boolean estado;
    
    public Producto(String codigoProducto,String descripcionProducto,String codigoAutorizacion,
                    String lineaSeguro,String Modalidad,double montoMinimo,double montoMaximo,
                    int tasaFactor,boolean estado){
        this.codigoProducto = codigoProducto;
        this.setDescripcionProducto(descripcionProducto);
        this.setCodigoAutorizacion(codigoAutorizacion);
        this.setLineaSeguro(lineaSeguro);
        this.setModalidad(Modalidad);
        this.setMontoMinimo(montoMinimo);
        this.setMontoMaximo(montoMaximo);
        this.setTasaFactor(tasaFactor);
        
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setLineaSeguro(String lineaSeguro) {
        this.lineaSeguro = lineaSeguro;
    }

    public String getLineaSeguro() {
        return lineaSeguro;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setTasaFactor(int tasaFactor) {
        this.tasaFactor = tasaFactor;
    }

    public int getTasaFactor() {
        return tasaFactor;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }
    public String toString() {
        //private String codigoProducto;
        // private String descripcionProducto;
        // private String codigoAutorizacion;
        // private String lineaSeguro;
        // private String Modalidad;
        // private double montoMinimo;
        // private double montoMaximo;
        // private int tasaFactor;
        // private boolean estado;
        return "";
    }
}
