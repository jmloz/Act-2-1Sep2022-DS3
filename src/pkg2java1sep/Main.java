
package pkg2java1sep;

/**
Construye un programa “main” en Java que realice las siguientes acciones:

Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar (la consola de MSDOS);
Lee un objeto de tipo “String” de la misma en un objeto “lectTeclado”;
Invoca al método “caracterEn” definido en el ejercicio anterior,
* con la “String” leída de la entrada estándar y el entero “7”, mostrándolo por pantalla;
Captura la posible excepción, mostrando por pantalla un mensaje: “Has intentado recuperar 
una posición de la cadena de caracteres que no existe;”.

 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cadena: ");
        String s = teclado.nextLine();
        int n = 7;
        caracter(s, n);
    }
        public static void caracter (String s,int n){
            try {
                if (n<= s.length() && n> 0) {System.out.println("La posicion del numero es: " + s.charAt(n)); 
                }else{ System.out.println("Caracteres no exite ");
                }
            } catch (InputMismatchException ex) { }
    }
    
}
