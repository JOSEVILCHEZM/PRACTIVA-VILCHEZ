
package FULL_JAVA;

import java.util.Scanner;

public class Pract1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = leer.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",n,i,(n * i));
        
    }
    
}

}