
package Listas;

public class RentaAut {
    private String IDEmpresaRenta;
    private String IDCliente;
    private String CantPasajero;
    private String TipoTerreno;
    private String DiasAutilizar;
    private String MontoTot;
    private String FechaEntreg;
    private String FechaDevol;
    private String Condiciones;
    public RentaAut(String IDEmpresaRenta,String IDCliente,String CantPasajero,String TipoTerreno,String DiasAutilizar,String MontoTot,String FechaEntreg,String FechaDevol,
    String Condiciones){
    this.CantPasajero=CantPasajero;
    this.Condiciones=Condiciones;
    this.DiasAutilizar=DiasAutilizar;
    this.FechaDevol=FechaDevol;
    this.FechaEntreg=FechaEntreg;
    this.IDCliente=IDCliente;
    this.IDEmpresaRenta=IDEmpresaRenta;
    this.MontoTot=MontoTot;
    this.TipoTerreno=TipoTerreno;
    
    
    }

    public String getIDEmpresaRenta() {
        return IDEmpresaRenta;
    }

    public void setIDEmpresaRenta(String IDEmpresaRenta) {
        this.IDEmpresaRenta = IDEmpresaRenta;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getCantPasajero() {
        return CantPasajero;
    }

    public void setCantPasajero(String CantPasajero) {
        this.CantPasajero = CantPasajero;
    }

    public String getTipoTerreno() {
        return TipoTerreno;
    }

    public void setTipoTerreno(String TipoTerreno) {
        this.TipoTerreno = TipoTerreno;
    }

    public String getDiasAutilizar() {
        return DiasAutilizar;
    }

    public void setDiasAutilizar(String DiasAutilizar) {
        this.DiasAutilizar = DiasAutilizar;
    }

    public String getMontoTot() {
        return MontoTot;
    }

    public void setMontoTot(String MontoTot) {
        this.MontoTot = MontoTot;
    }

    public String getFechaEntreg() {
        return FechaEntreg;
    }

    public void setFechaEntreg(String FechaEntreg) {
        this.FechaEntreg = FechaEntreg;
    }

    public String getFechaDevol() {
        return FechaDevol;
    }

    public void setFechaDevol(String FechaDevol) {
        this.FechaDevol = FechaDevol;
    }

    public String getCondiciones() {
        return Condiciones;
    }

    public void setCondiciones(String Condiciones) {
        this.Condiciones = Condiciones;
    }
    
}
