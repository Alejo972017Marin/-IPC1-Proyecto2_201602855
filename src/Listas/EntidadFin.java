
package Listas;


public class EntidadFin {
    private String IDEntidad;
    private String IDCliente;
    private String TipoTarj;
    private String CodigoTarj;
    private String Saldo;
    private String MontoMax;
    public EntidadFin(    String IDEntidad,String IDCliente,String TipoTarj,String CodigoTarj,String Saldo,String MontoMax){
    this.CodigoTarj=CodigoTarj;
    this.IDCliente=IDCliente;
    this.IDEntidad=IDEntidad;
    this.MontoMax=MontoMax;
    this.Saldo=Saldo;
    this.TipoTarj=TipoTarj;
    }

    public String getIDEntidad() {
        return IDEntidad;
    }

    public void setIDEntidad(String IDEntidad) {
        this.IDEntidad = IDEntidad;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getTipoTarj() {
        return TipoTarj;
    }

    public void setTipoTarj(String TipoTarj) {
        this.TipoTarj = TipoTarj;
    }

    public String getCodigoTarj() {
        return CodigoTarj;
    }

    public void setCodigoTarj(String CodigoTarj) {
        this.CodigoTarj = CodigoTarj;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getMontoMax() {
        return MontoMax;
    }

    public void setMontoMax(String MontoMax) {
        this.MontoMax = MontoMax;
    }
    
}
