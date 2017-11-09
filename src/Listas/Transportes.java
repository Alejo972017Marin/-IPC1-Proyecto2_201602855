
package Listas;

public class Transportes {
    private String IDTransporte;
    private String HoraSalida;
    private String HoraLLegada;
    private String CapacidaPasajeros;
    private String IDDestino;
    public Transportes(String IDTransporte, String HoraSalida,String HoraLLegada,String CapacidaPasajeros,String IDDestino){
    this.CapacidaPasajeros=CapacidaPasajeros;
    this.HoraLLegada=HoraLLegada;
    this.HoraSalida=HoraSalida;
    this.IDDestino=IDDestino;
    this.IDTransporte=IDTransporte;
    }

    public String getIDTransporte() {
        return IDTransporte;
    }

    public void setIDTransporte(String IDTransporte) {
        this.IDTransporte = IDTransporte;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLLegada() {
        return HoraLLegada;
    }

    public void setHoraLLegada(String HoraLLegada) {
        this.HoraLLegada = HoraLLegada;
    }

    public String getCapacidaPasajeros() {
        return CapacidaPasajeros;
    }

    public void setCapacidaPasajeros(String CapacidaPasajeros) {
        this.CapacidaPasajeros = CapacidaPasajeros;
    }

    public String getIDDestino() {
        return IDDestino;
    }

    public void setIDDestino(String IDDestino) {
        this.IDDestino = IDDestino;
    }
    
    
}
