package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilaService<T> {
    private List<T> fila = new ArrayList<>();


    public void entrar(T item){
        fila.add(item);
    }

    public Optional<T> chamarProximo(){
        if (fila.isEmpty()){
            return Optional.empty();
        }
            T t = fila.remove(0);
            return Optional.of(t);
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
