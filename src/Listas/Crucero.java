package Listas;

public class Crucero {

    private String IDCrucero;
    private String FechaSalida;
    private String FechaLLegada;
    private String CapacidadPasajeros;
    private String DuracionCrucero;
    private String Condicion;
    private String IDDestino;

    public Crucero(String IDCrucero, String FechaSalida,String FechaLLegada,String CapacidadPasajeros,String DuracionCrucero,String Condicion,String IDDestino) {
   this.CapacidadPasajeros=CapacidadPasajeros;
   this.Condicion=Condicion;
   this.DuracionCrucero=DuracionCrucero;
   this.FechaLLegada=FechaLLegada;
   this.FechaSalida=FechaSalida;
   this.IDCrucero=IDCrucero;
   this.IDDestino=IDDestino;
    
    }

    public String getIDCrucero() {
        return IDCrucero;
    }

    public void setIDCrucero(String IDCrucero) {
        this.IDCrucero = IDCrucero;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaLLegada() {
        return FechaLLegada;
    }

    public void setFechaLLegada(String FechaLLegada) {
        this.FechaLLegada = FechaLLegada;
    }

    public String getCapacidadPasajeros() {
        return CapacidadPasajeros;
    }

    public void setCapacidadPasajeros(String CapacidadPasajeros) {
        this.CapacidadPasajeros = CapacidadPasajeros;
    }

    public String getDuracionCrucero() {
        return DuracionCrucero;
    }

    public void setDuracionCrucero(String DuracionCrucero) {
        this.DuracionCrucero = DuracionCrucero;
    }

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }
    

}
