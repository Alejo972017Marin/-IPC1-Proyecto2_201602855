
package Listas;


public class Asientos {
   private String IDtransporte;
   private String IDReservacion;
   private String AsientoViajero;
   private String ClaseAsiento;
   private String CostoPasaje;
   
      public Asientos(String IDtransporte,String IDReservacion,String AsientoViajero, String ClaseAsiento,String CostoPasaje){
   this.AsientoViajero=AsientoViajero;
   this.ClaseAsiento=ClaseAsiento;
   this.CostoPasaje=CostoPasaje;
   this.IDReservacion=IDReservacion;
   this.IDtransporte=IDtransporte;
   
   }

    public String getIDtransporte() {
        return IDtransporte;
    }

    public void setIDtransporte(String IDtransporte) {
        this.IDtransporte = IDtransporte;
    }

    public String getIDReservacion() {
        return IDReservacion;
    }

    public void setIDReservacion(String IDReservacion) {
        this.IDReservacion = IDReservacion;
    }

    public String getAsientoViajero() {
        return AsientoViajero;
    }

    public void setAsientoViajero(String AsientoViajero) {
        this.AsientoViajero = AsientoViajero;
    }

    public String getClaseAsiento() {
        return ClaseAsiento;
    }

    public void setClaseAsiento(String ClaseAsiento) {
        this.ClaseAsiento = ClaseAsiento;
    }

    public String getCostoPasaje() {
        return CostoPasaje;
    }

    public void setCostoPasaje(String CostoPasaje) {
        this.CostoPasaje = CostoPasaje;
    }
   

    
}
