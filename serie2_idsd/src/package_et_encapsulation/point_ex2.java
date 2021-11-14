package package_et_encapsulation;
public class point_ex2 {
    public String nom;
    private double x;
    private double y;

    // constractor
    public point_ex2(String name, double abs,double ord){
        this.nom=name;
        this.x=abs;
        this.y=ord;
    }

    //setter absicce
    public void setX(double B){
        this.x=B;
    }
    //getter abssice
    public double getX(){
        return this.x;
    }  

    //setter ordonne
    public void setY(double B){
        this.y=B;
    }   
    //getter ordonne
    public double getY(){
        return this.y;
    } 

    // afficher les cordonnees
    public void afficher(){
        System.out.println("le point :"+this.nom+" avec des cordonnes("+x+","+y+")");
    }

    public double distance_point(point_ex2 A, point_ex2 B) {
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY()- A.getY()), 2));
    }
}