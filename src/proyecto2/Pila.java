package proyecto2;

public class Pila {

    public Nodo primero;

    public Pila(Object dato) {
        primero = new Nodo(dato);
    }

    public void Apilar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = primero;
        primero = nuevo;
    }

    public Object Desapilar() {
        Object dato = primero.dato;
        primero = primero.siguiente;
        return dato;
    }

    public void Imprimir() {
        
        while (primero != null) {
            System.out.print(Desapilar());
            System.out.print(",");
        }
    }

}
