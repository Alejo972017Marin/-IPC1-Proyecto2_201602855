
package Listas;

public class Reservaciones {

    
    private String reIDRes;
    private String reIDPaq;
    private String reIDCli;
    private String reFechaIn;
    private String reFechaOut;
    private String reCantDias;
    private String reEstadoRes;
    private String reSaldoPendiente;
    
    public Reservaciones(String reIDRes,String reIDPaq,String reIDCli,String reFechaIn,String reFechaOut,String reCantDias,String reEstadoRes,String reSaldoPendiente){
    
        this.reCantDias=reCantDias;
        this.reEstadoRes=reEstadoRes;
        this.reFechaIn=reFechaIn;
        this.reFechaOut=reFechaOut;
        this.reIDCli=reIDCli;
        this.reIDPaq=reIDPaq;
        this.reIDRes=reIDRes;
        this.reSaldoPendiente=reSaldoPendiente;
    }
    public String getReIDRes() {
        return reIDRes;
    }

    public void setReIDRes(String reIDRes) {
        this.reIDRes = reIDRes;
    }

    public String getReIDPaq() {
        return reIDPaq;
    }

    public void setReIDPaq(String reIDPaq) {
        this.reIDPaq = reIDPaq;
    }

    public String getReIDCli() {
        return reIDCli;
    }

    public void setReIDCli(String reIDCli) {
        this.reIDCli = reIDCli;
    }

    public String getReFechaIn() {
        return reFechaIn;
    }

    public void setReFechaIn(String reFechaIn) {
        this.reFechaIn = reFechaIn;
    }

    public String getReFechaOut() {
        return reFechaOut;
    }

    public void setReFechaOut(String reFechaOut) {
        this.reFechaOut = reFechaOut;
    }

    public String getReCantDias() {
        return reCantDias;
    }

    public void setReCantDias(String reCantDias) {
        this.reCantDias = reCantDias;
    }

    public String getReEstadoRes() {
        return reEstadoRes;
    }

    public void setReEstadoRes(String reEstadoRes) {
        this.reEstadoRes = reEstadoRes;
    }

    public String getReSaldoPendiente() {
        return reSaldoPendiente;
    }

    public void setReSaldoPendiente(String reSaldoPendiente) {
        this.reSaldoPendiente = reSaldoPendiente;
    }
    
}
