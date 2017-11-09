package Listas;

public class Clientes {

    private String id;
    private String Nombre;
    private String Apellido;
    private String Tarjeta;
    private String Movil;
    private String Tel;
    private String Nac;
    private String Residencia;
    private String Frec;
    private String ClacifMonto;

    public Clientes(String id,String Nombre,String Apellido,String Tarjeta,String Movil, String Tel,String Nac,String Residencia,String Frec,String ClacifMonto) 
    {
        this.id=id;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Tarjeta=Tarjeta;
        this.Movil=Movil;
        this.Tel=Tel;
        this.Nac=Nac;
        this.Residencia=Residencia;
        this.Frec= Frec;
        this.ClacifMonto=ClacifMonto;
        
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String Movil) {
        this.Movil = Movil;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getNac() {
        return Nac;
    }

    public void setNac(String Nac) {
        this.Nac = Nac;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getFrec() {
        return Frec;
    }

    public void setFrec(String Frec) {
        this.Frec = Frec;
    }

    public String getClacifMonto() {
        return ClacifMonto;
    }

    public void setClacifMonto(String ClacifMonto) {
        this.ClacifMonto = ClacifMonto;
    }

}
