package proyecto2;

public class ListaDoble {

    public Nodo primero;

    public ListaDoble(int dato) {
        primero = new Nodo(dato);
    }

    public void InsertarAlFrente(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = primero;
        primero.anterior = nuevo;
        primero = nuevo;
    }

    public void Imprimir() {
        System.out.println("Insertar Al Frente");
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            auxiliar.Imprimir();
            auxiliar = auxiliar.siguiente;
            System.out.print(",");
        }

    }
}
