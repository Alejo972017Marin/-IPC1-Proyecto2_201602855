package proyecto2;

public class ListaDoble {

    public Nodo primero;

    public ListaDoble(Object dato) {
        primero = new Nodo(dato);
    }

    public void InsertarAlFrente(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero==null) {
            primero=nuevo;
            
        }else{
        nuevo.siguiente = primero;
        primero.anterior = nuevo;
        primero = nuevo;
        }
        
        
    }
    
    public void InsertarAlFinal(Object dato){
    Nodo nuevo = new Nodo(dato);
        if (primero==null) {
            primero=nuevo;
            
        }else{
        Nodo aux = primero;
            while (aux.siguiente!=null) {
                aux= aux.siguiente;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        }
    
    }

    public void Imprimir() {
        System.out.println("Insertar Al Frente y Al final");
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            auxiliar.Imprimir();
            auxiliar = auxiliar.siguiente;
            System.out.print(",");
        }

    }
}
