
package Listas;

public class Camarote {
    private String IDCrucero;
    private String IDReservacion;
    private String HabitacionPasajero;
    private String CostoPasaje;
    public Camarote(String IDCrucero,String IDReservacion,String HabitacionPasajero,String CostoPasaje){
        this.CostoPasaje=CostoPasaje;
        this.HabitacionPasajero=HabitacionPasajero;
        this.IDCrucero=IDCrucero;
        this.IDReservacion=IDReservacion;
    
    }

    public String getIDCrucero() {
        return IDCrucero;
    }

    public void setIDCrucero(String IDCrucero) {
        this.IDCrucero = IDCrucero;
    }

    public String getIDReservacion() {
        return IDReservacion;
    }

    public void setIDReservacion(String IDReservacion) {
        this.IDReservacion = IDReservacion;
    }

    public String getHabitacionPasajero() {
        return HabitacionPasajero;
    }

    public void setHabitacionPasajero(String HabitacionPasajero) {
        this.HabitacionPasajero = HabitacionPasajero;
    }

    public String getCostoPasaje() {
        return CostoPasaje;
    }

    public void setCostoPasaje(String CostoPasaje) {
        this.CostoPasaje = CostoPasaje;
    }
    
}
