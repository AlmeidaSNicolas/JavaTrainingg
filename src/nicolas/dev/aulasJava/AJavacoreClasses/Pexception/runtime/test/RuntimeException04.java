package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Pexception.Ex2.Model.MochilaRasgadaException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {

    public static void main(String[] args) {

        try{
            throw new MochilaRasgadaException("Dentro de mohcilaRasgadaException");
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.println("Dentro do NullPointerException");
        }catch (MochilaRasgadaException e){
            System.out.println("Dentro de mohcilaRasgadaException");
        }
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            MochilhaRasgadaException();
        }catch (SQLException | NullPointerException e){
            System.out.println("Dentro do SQLException");
            e.printStackTrace();
        }
    }
    private static void MochilhaRasgadaException() throws SQLException, ClassCastException {
    }


}

