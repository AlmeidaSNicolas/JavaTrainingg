package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service;

import java.util.*;

public class Repositorio<T, ID> {

   Map<ID, T> entityMap = new HashMap<>();

   public void save(ID id, T entity){
       entityMap.put(id, entity);
       System.out.println("201 - Object created ");
   }

    public List<T> findAll() {
        Collection<T> valores = entityMap.values();
        List<T> lista = new ArrayList<>(valores);
       return lista;
    }

    public Optional<T> findById(ID id){
       return Optional.ofNullable(entityMap.get(id));
    }

    public void deletebYid(ID id){
        T t = entityMap.remove(id);
        System.out.println("Objeto removido : " + t);
    }
}
