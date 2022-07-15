/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import java.io.File;

/**
 *
 * @author HP
 */
public class Ejercicio_03_04 {

    public static void main(String[] args) {
        var v1= new VentanaPrincipal();
        v1.setVisible(true);
        var x=0;
        try{
            x= Integer.valueOf("1");
            x=x/10;
        }
        catch(NumberFormatException e){
            System.out.println("Por favor vuelva a ingresar ya que el formato debe ser entero");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede realizar una división para cero.");
        }
        catch(RuntimeException e){
            System.out.println("Se generó un error en tiempo de ejecución");
        }
        catch(Exception e){
            System.out.println("Se generó un error inesperado");
        }
        finally{
            System.out.println("Finalizó el bloque de captura de excepciones");
        }
        
    }
}
