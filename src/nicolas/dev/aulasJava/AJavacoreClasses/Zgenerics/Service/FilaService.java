package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service;

import java.util.ArrayList;
import java.util.List;

public class FilaService<T> {
    private List<T> fila = new ArrayList<>();


    public void entrar(T item){
        fila.add(item);
    }

    public T chamarProximo(){
        T t = fila.remove(0);
        System.out.println(t);
        return t;
    }

    public int tamanho(){
        System.out.println("Tamanho : " + fila.size());
        return fila.size();
    }

    public boolean estaVazia(){
        if (fila.isEmpty()){
            System.out.println("Esta vazia");
            return true;
        }
        System.out.println("Nao esta vazia");
        return false;
    }
}
