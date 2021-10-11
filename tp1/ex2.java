import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("###### Bonjour dans notre programme ######");
        System.out.println("Choisis parmit ces choix l'operation qui tu peux:");
        System.out.print("1 : Calcul factorielle\n2 : Somme de 4 nombre\n3 : Calcul n nombre\nEntrez votre chois => ");
        byte choi=input.nextByte();
        switch (choi) {
            case 1:
                int fa=1;
                System.out.print("donnez la nombre : ");
                int nbr=input.nextInt();
                for (int i=1 ;i<=nbr;i++) {
                    fa=fa*i;
                }
                System.out.printf("le factorielle de %d est %d",nbr,fa);
                break;
            case 2:
                int s=0,i=0;
                while (i<4) {
                    System.out.print("donnez la nombre : ");
                    int n=input.nextInt();
                    s+=n;
                    i++;
                }
                System.out.printf("le somme de votre nombre est %d",s);
                break;
            case 3:
                System.out.print("donnez la nombre n : ");
                int N=input.nextInt();
                float fibo=1;
                do {
                    fibo=fibo+1/N;
                    N--;
                } while (N!=0);
                System.out.printf("la solution de suite fibo est %f",fibo);
                break;
            default:
                System.out.println("tu es saisis invalid nombre");
                break;
        }
    }
}
