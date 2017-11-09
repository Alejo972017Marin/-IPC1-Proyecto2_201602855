package proyecto2;

public class Cola {

    public Nodo primero;
    public Nodo ultimo;

    public Cola(Object dato) {
        primero = new Nodo(dato);
        ultimo = primero;
    }

    public void Encolar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        ultimo.siguiente = nuevo;
        ultimo = nuevo;
    }

    public Object Desencolar() {
        Object dato = primero.dato;

        primero = primero.siguiente;

        return dato;
    }

    public void Imprimir() {
        System.out.println("Encolar");
        while (primero != null) {

            System.out.print(Desencolar());
            System.out.print(",");
        }
    }
}
