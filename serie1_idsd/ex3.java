import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

    }

    // methode de calcul surface

    static int Surface_rect(int L, int l) {
        return L * l;
    }

    // min && max
    static float max(float a, float b, float c, float d) {
        if (a > b && a > c && a > d)
            return a;
        if (a < b && b > c && b > d)
            return b;
        if (c > a && c > b && c > d)
            return c;
        else
            return d;
    }

    static float min(float a, float b, float c, float d) {
        if (a < b && a < c && a < d)
            return a;
        if (a > b && b < c && b < d)
            return b;
        if (c < a && c < b && c < d)
            return c;
        else
            return d;
    }

    // tri
    static int tri_nbr() {
        Scanner x = new Scanner(System.in);
        System.out.println("donnez le nombre" + 1);
        int max = x.nextInt();
        for (int i = 1; i < 7; i++) {
            System.out.println("donnez le nombre" + (i + 1));
            int y = x.nextInt();
            if (y > max) {
                max = y;
            }
        }
        return max;
    }
}
