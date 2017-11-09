package proyecto2;

public class Nodo {

    public Nodo siguiente;
    public Nodo anterior;
    public Object dato;

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public void Imprimir() {
        System.out.println(dato);
    }

}
