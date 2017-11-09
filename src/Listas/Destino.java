
package Listas;

public class Destino {
    private String IDDestino;
    private String Pais;
    private String Ciudad;
    private String Direccion;
    private String NombreDestino;
    private String DescripcionDestino;
    private String DescMedidasSeguridad;
    public Destino(String IDDestino,String Pais,String Ciudad,String Direccion,String NombreDestino,String DescripcionDestino,String DescMedidasSeguridad)
    {
    this.Ciudad=Ciudad;
    this.DescMedidasSeguridad=DescMedidasSeguridad;
    this.DescripcionDestino=DescripcionDestino;
    this.Direccion=Direccion;
    this.IDDestino=IDDestino;
    this.NombreDestino=NombreDestino;
    this.Pais=Pais;
    
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombreDestino() {
        return NombreDestino;
    }

    public void setNombreDestino(String NombreDestino) {
        this.NombreDestino = NombreDestino;
    }

    public String getDescripcionDestino() {
        return DescripcionDestino;
    }

    public void setDescripcionDestino(String DescripcionDestino) {
        this.DescripcionDestino = DescripcionDestino;
    }

    public String getDescMedidasSeguridad() {
        return DescMedidasSeguridad;
    }

    public void setDescMedidasSeguridad(String DescMedidasSeguridad) {
        this.DescMedidasSeguridad = DescMedidasSeguridad;
    }
    
   
}
