package nicofilm;

public class Lista<E> implements ILista<E> {

    private INodo<E> primero;

    public Lista() {
        primero = null;
    }

    public Lista(INodo<E> unNodo) {
        this.primero = unNodo;
    }

    public void insertar(INodo<E> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            INodo<E> aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    public INodo<E> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            INodo<E> aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        INodo<E> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            INodo<E> temp1 = aux;
            INodo<E> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                INodo<E> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            INodo<E> temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                aux += temp.getEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            INodo<E> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    public INodo<E> getPrimero() {
        return primero;
    }
    

   public boolean insertarOrdenado(INodo<E> unNodo){        
        INodo<E> actual = primero;        
        if (esVacia() == true){
            primero = unNodo;
            unNodo.setSiguiente(null);
            return true;
        }else{
            INodo<E> siguiente = primero.getSiguiente();
            while (actual!= null){
                if (unNodo.compareTo(actual.getEtiqueta())<=0){
                    unNodo.setSiguiente(primero);
                    primero = unNodo;
                    return true;
                }else if(unNodo.compareTo(actual.getEtiqueta())> 0 && actual.getSiguiente()== null){
                    actual.setSiguiente(unNodo);
                    unNodo.setSiguiente(null);
                    return true;                   
                }else{
                    if (unNodo.compareTo(actual.getEtiqueta())> 0 && unNodo.compareTo(siguiente.getEtiqueta())<=0){
                        actual.setSiguiente(unNodo);
                        unNodo.setSiguiente(siguiente);
                        return true;
                    }
               } actual = actual.getSiguiente();
            }           
        }
        return false;
    }
    @Override
    public void Ordenar(){
        Lista<E> lista = new Lista<>();            
        while (esVacia() != true) {
            INodo<E> nuevoElemento = primero;
            eliminar(primero.getEtiqueta());            
            lista.insertarOrdenado(nuevoElemento);      
        }
         //INodo<E> nuevoElemento1 = lista.getPrimero();
         //this.insertarOrdenado(nuevoElemento1); 
         while (lista.esVacia() != true) {
            INodo<E> nuevoElemento1 = lista.getPrimero();
            lista.eliminar(lista.getPrimero().getEtiqueta());            
            this.insertarOrdenado(nuevoElemento1);     
        }        
    }

    @Override
    public INodo<E> quitarPrimero() {
        INodo tempNodo = getPrimero();
        if (tempNodo != null){
            this.primero = tempNodo.getSiguiente();
            tempNodo.setSiguiente(null);
        }
        return tempNodo;
    }
}
