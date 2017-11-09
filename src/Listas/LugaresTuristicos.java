package Listas;

public class LugaresTuristicos {
    private String IDLugar;
    private String NombreLugar;
    private String DescripcionLugar;
    private String Pais;
    private String Ciudad;
    private String Direccion;
    private String LimitEdadPerm;
    private String HorInicActiv;
    private String HorFunciones;
    private String RecomendacionSeguridad;
    private String IDDestino;
    
    public LugaresTuristicos(String IDLugar,String NombreLugar,String DescripcionLugar,String Pais,String Ciudad,String Direccion,String LimitEdadPerm,String HorInicActiv,String HorFunciones,String RecomendacionSeguridad,String IDDestino){
    this.Ciudad=Ciudad;
    this.DescripcionLugar=DescripcionLugar;
    this.Direccion=Direccion;
    this.HorFunciones=HorFunciones;
    this.HorInicActiv=HorInicActiv;
    this.IDDestino=IDDestino;
    this.IDLugar=IDLugar;
    this.LimitEdadPerm=LimitEdadPerm;
    this.NombreLugar=NombreLugar;
    this.Pais=Pais;
    this.RecomendacionSeguridad=RecomendacionSeguridad;
    
    }

    public String getIDLugar() {
        return IDLugar;
    }

    public void setIDLugar(String IDLugar) {
        this.IDLugar = IDLugar;
    }

    public String getNombreLugar() {
        return NombreLugar;
    }

    public void setNombreLugar(String NombreLugar) {
        this.NombreLugar = NombreLugar;
    }

    public String getDescripcionLugar() {
        return DescripcionLugar;
    }

    public void setDescripcionLugar(String DescripcionLugar) {
        this.DescripcionLugar = DescripcionLugar;
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

    public String getLimitEdadPerm() {
        return LimitEdadPerm;
    }

    public void setLimitEdadPerm(String LimitEdadPerm) {
        this.LimitEdadPerm = LimitEdadPerm;
    }

    public String getHorInicActiv() {
        return HorInicActiv;
    }

    public void setHorInicActiv(String HorInicActiv) {
        this.HorInicActiv = HorInicActiv;
    }

    public String getHorFunciones() {
        return HorFunciones;
    }

    public void setHorFunciones(String HorFunciones) {
        this.HorFunciones = HorFunciones;
    }

    public String getRecomendacionSeguridad() {
        return RecomendacionSeguridad;
    }

    public void setRecomendacionSeguridad(String RecomendacionSeguridad) {
        this.RecomendacionSeguridad = RecomendacionSeguridad;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }
    
}
