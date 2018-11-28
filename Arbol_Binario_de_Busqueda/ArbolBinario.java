
package main;

public class ArbolBinario {

    private Nodo raiz;
    int cant;
    int altura;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz);
    }

    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }

    //metodos nuevos
    public boolean existe(int info) {
        Nodo reco = raiz;
        while (reco != null) {
            if (info == reco.getDato()) {
                return true;
            } else if (info > reco.getDato()) {
                reco = reco.getDer();
            } else {
                reco = reco.getIzq();
            }
        }     
       return false;
    }

    public int cantidad() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidad(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.getIzq());
            cantidad(reco.getDer());
        }
    }

    private int imprimirNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.getIzq() == null && reco.getDer() == null) {
                cant++;            
                System.out.println(reco.getDato());         
             } 
            imprimirNodosHoja(reco.getIzq());
            imprimirNodosHoja(reco.getDer());           
         }  
       return 0;
    }
    
     public int imprimirNodosHoja(){ 
       cant=0;    
       imprimirNodosHoja(raiz); 
       return 0;
    }
    
    public void imprimirArbolConNivel(Nodo reco, int nivel){
        if(reco !=null){
            imprimirArbolConNivel(reco.getIzq(),nivel+1);
            System.out.print(reco.getDato() + "(" +nivel+")-");
            imprimirArbolConNivel(reco.getDer(),nivel+1);
        }
    }
    
    public void imprimirArbolConNivel(){
        imprimirArbolConNivel(raiz,1);
        System.out.println();
    }
    
    public void imprimirNodosMayoreaARaiz(Nodo reco){
        if(reco!=null){
            imprimirNodosMayoreaARaiz(reco.getDer());
            System.out.println(reco.getDato());       
        }    
    }
    public void imprimirNodosMayoreaARaiz(){
        imprimirNodosMayoreaARaiz(raiz);
        System.out.println();
    }
}   
    
/*
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getDer(), nivel + 1);
        }
    }

    public void menorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getIzq() != null) {
                reco = reco.getIzq();
            }
            System.out.println("Menor valor del árbol:" + reco.getDato());
        }
    }
}*/
/*
    public void mayorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getDer() != null) {
                reco = reco.getDer();
            }
            System.out.println("Mayor valor del árbol:" + reco.getDato());
        }
    }

    public int alturaArbol() {
        altura = 0;
        alturaArbol(raiz, 0);
        return altura;
    }

    private void alturaArbol(Nodo pivote, int nivel) {
        if (pivote != null) {
            alturaArbol(pivote.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            alturaArbol(pivote.getDer(), nivel + 1);
        }
    }
}
   */ 