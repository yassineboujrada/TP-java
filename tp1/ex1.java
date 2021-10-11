import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("###### Bonjour dans notre programme ######");
        System.out.println("Choisis parmit ces choix l'operation qui tu peux:");
        System.out.print("1 : Operation de calculatrice\n2 : Resoudre equation de deuxieme degre\nEntrez votre chois => ");
        byte choi=input.nextByte();
        switch (choi) {
            case 1:
                System.out.print("donnez la premier valeur : ");
                int a1=input.nextInt();
                System.out.print("donnez la deuxieme valeur : ");
                int a2=input.nextInt();
                System.out.print("donnez la troisieme valeur : ");
                int a3=input.nextInt();
                System.out.print("donnez la quatrieme valeur : ");
                int a4=input.nextInt();
                System.out.printf("la somme est : %d\nla division est %f\nle min : %d\nle max : %d",Integer.sum(Integer.sum(a1,a2),Integer.sum(a3, a4)),(a1/(double)a2)/(a3/(double)a4),Math.min(Math.min(a1,a2),Math.min(a3,a4)),Math.max(Math.max(a1,a2),Math.max(a3,a4)));
                break;
            
            case 2:
                System.out.println("###### Resoudre problem de deuxieme degree Ax^2+Bx+C=0 ######");
                System.out.print("donnez la valeur de A : ");
                float a=input.nextFloat();
                System.out.print("donnez la valeur de B : ");
                float b=input.nextFloat();
                System.out.print("donnez la valeur de C : ");
                float c=input.nextFloat();
                float delta=(b*b)-4*a*c;
                if (delta==0) {
                    System.out.printf("la solution de votre equation est : %f",(-b)/(2*a));
                }
                else if (delta>0) {
                    System.out.printf("la solution de votre equation est :\nX1 = %f\nX2 = %f",(-b-Math.sqrt(delta)/(2*a)),(-b+Math.sqrt(delta)/(2*a)));
                } else {
                    System.out.println("la solution de votre equation est ensemble vide");
                }
                break;
            default:
                System.out.println("tu es saisis une chois incorrect");
                break;
        }
    }
    
}