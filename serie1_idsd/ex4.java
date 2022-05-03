import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

public class ex4 {
    public static void main(String[] args) {
        float[] nbr = new float[4];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < 4; i++) { 
            System.out.print("entrez la nombre" + (i + 1) +":"); 
            nbr[i] = x.nextFloat(); 
        }
        
    }

}
