
package FULL_JAVA;


public class Pract3 {
 
    
     public static void main(String[] args) {
        
         int[][] x = {
            {1,2,3},
            {4,5,6},
            {7,8},
        };
        //Primer for iterar array 
        for (int[] matrizInterna: x) {
            //Segundo for iterar datos de cada array 
            for(int dato: matrizInterna) {
                System.out.println(dato);
    }
    
}
     }
}
