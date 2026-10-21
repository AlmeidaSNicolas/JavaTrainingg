package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class celular {
    private String serialNumber;
    private String marca;

    public celular(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Ao tratar sobre reescrita do equals respeitar esses parametros:
    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // Para x diferente de null, x.equals(null) tem que retornar false

    @Override
    public boolean equals(Object obj) {
    if (obj == null) return false;
    if (this == obj) return true;
    if (this.getClass() != obj.getClass()) return false;
    celular celular = (celular) obj;

    return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

    @Override
    public String toString() {
        return "celular{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return this.serialNumber.hashCode();
    }
}
