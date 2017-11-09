
package Listas;

public class Habitacion {
    private String IDHospedaje;
    private String NoHabitacion;
    private String IDReservacion;
    private String CantPersonasxHabit;
    private String CostoHabitacion;
    private String ClaseHabit;
    public Habitacion(String IDHospedaje,String NoHabitacion,String IDReservacion,String CantPersonasxHabit,String CostoHabitacion,String ClaseHabit){
    this.CantPersonasxHabit=CantPersonasxHabit;
    this.ClaseHabit=ClaseHabit;
    this.CostoHabitacion=CostoHabitacion;
    this.IDHospedaje=IDHospedaje;
    this.NoHabitacion=NoHabitacion;
    this.IDReservacion=IDReservacion;
    
    }

    public String getIDHospedaje() {
        return IDHospedaje;
    }

    public void setIDHospedaje(String IDHospedaje) {
        this.IDHospedaje = IDHospedaje;
    }

    public String getNoHabitacion() {
        return NoHabitacion;
    }

    public void setNoHabitacion(String NoHabitacion) {
        this.NoHabitacion = NoHabitacion;
    }

    public String getIDReservacion() {
        return IDReservacion;
    }

    public void setIDReservacion(String IDReservacion) {
        this.IDReservacion = IDReservacion;
    }

    public String getCantPersonasxHabit() {
        return CantPersonasxHabit;
    }

    public void setCantPersonasxHabit(String CantPersonasxHabit) {
        this.CantPersonasxHabit = CantPersonasxHabit;
    }

    public String getCostoHabitacion() {
        return CostoHabitacion;
    }

    public void setCostoHabitacion(String CostoHabitacion) {
        this.CostoHabitacion = CostoHabitacion;
    }

    public String getClaseHabit() {
        return ClaseHabit;
    }

    public void setClaseHabit(String ClaseHabit) {
        this.ClaseHabit = ClaseHabit;
    }
    
    
    
}
