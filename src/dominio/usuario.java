package dominio;

public class Usuario {
    //Atributos de la clase 
    private int codigo;
    private String nombreUsuario;
    private String clave;
    private int rol;
    private boolean estado;
    
    public Usuario(int pCodigo,String pNombreUsuario,String pClave,int pRol) {
        this.setCodigo(pCodigo);
        this.setNombreUsuario(pNombreUsuario);
        this.setClave(pClave);
        this.setRol(pRol);
        this.estado=true;
        }
    //set y get de clase
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }
}
