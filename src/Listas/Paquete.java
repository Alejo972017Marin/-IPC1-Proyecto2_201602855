
package Listas;

public class Paquete {
    private String IDPaquete;
    private String TipoPaq;
    private String ClasifPaq;
    private String CantViajeros;
    private String IDTransporte;
    private String IDHospedaje;
    private String IDCrucero;
    private String IDRentadora;
    private String IDDestino;
    private String IDLugar;
    private String MontoPaq;
    
    public Paquete(String IDPaquete,String TipoPaq,String ClasifPaq,String CantViajeros,String IDTransporte,String IDHospedaje,String IDCrucero,String IDRentadora,String IDDestino,String IDLugar,String MontoPaq){
    this.CantViajeros=CantViajeros;
    this.ClasifPaq=ClasifPaq;
    this.IDCrucero=IDCrucero;
    this.IDDestino=IDDestino;
    this.IDHospedaje=IDHospedaje;
    this.IDLugar=IDLugar;
    this.IDPaquete=IDPaquete;
    this.IDRentadora=IDRentadora;
    this.IDTransporte=IDTransporte;
    this.MontoPaq=MontoPaq;
    this.TipoPaq=TipoPaq;
    }

    public String getIDPaquete() {
        return IDPaquete;
    }

    public void setIDPaquete(String IDPaquete) {
        this.IDPaquete = IDPaquete;
    }

    public String getTipoPaq() {
        return TipoPaq;
    }

    public void setTipoPaq(String TipoPaq) {
        this.TipoPaq = TipoPaq;
    }

    public String getClasifPaq() {
        return ClasifPaq;
    }

    public void setClasifPaq(String ClasifPaq) {
        this.ClasifPaq = ClasifPaq;
    }

    public String getCantViajeros() {
        return CantViajeros;
    }

    public void setCantViajeros(String CantViajeros) {
        this.CantViajeros = CantViajeros;
    }

    public String getIDTransporte() {
        return IDTransporte;
    }

    public void setIDTransporte(String IDTransporte) {
        this.IDTransporte = IDTransporte;
    }

    public String getIDHospedaje() {
        return IDHospedaje;
    }

    public void setIDHospedaje(String IDHospedaje) {
        this.IDHospedaje = IDHospedaje;
    }

    public String getIDCrucero() {
        return IDCrucero;
    }

    public void setIDCrucero(String IDCrucero) {
        this.IDCrucero = IDCrucero;
    }

    public String getIDRentadora() {
        return IDRentadora;
    }

    public void setIDRentadora(String IDRentadora) {
        this.IDRentadora = IDRentadora;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }

    public String getIDLugar() {
        return IDLugar;
    }

    public void setIDLugar(String IDLugar) {
        this.IDLugar = IDLugar;
    }

    public String getMontoPaq() {
        return MontoPaq;
    }

    public void setMontoPaq(String MontoPaq) {
        this.MontoPaq = MontoPaq;
    }
    
}
