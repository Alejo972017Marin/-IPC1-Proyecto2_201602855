package Listas;

public class Hospedaje {

    private String IDHospedaje;
    private String Direccion;
    private String CantCuartDisp;
    private String IDDestino;

    public Hospedaje(String IDHospedaje, String Direccion, String CantCuartDisp, String IDDestino) {
        this.CantCuartDisp=CantCuartDisp;
        this.Direccion=Direccion;
        this.IDDestino=IDDestino;
        this.IDHospedaje=IDHospedaje;
    }

    public String getIDHospedaje() {
        return IDHospedaje;
    }

    public void setIDHospedaje(String IDHospedaje) {
        this.IDHospedaje = IDHospedaje;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCantCuartDisp() {
        return CantCuartDisp;
    }

    public void setCantCuartDisp(String CantCuartDisp) {
        this.CantCuartDisp = CantCuartDisp;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }

}
