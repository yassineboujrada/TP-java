package classe_et_object;
public class point {
    public String nom;
    public double x;
    public double y;

    // constractor
    public point(String name, double abs,double ord){
        this.nom=name;
        this.x=abs;
        this.y=ord;
    }
      
    // afficher les cordonnees
    public void afficher(){
        System.out.println("le point :"+this.nom+" avec des cordonnes("+x+","+y+")");
    }

    //  translation des coordonnees
    public void translation(double trans){
        this.x=x+trans;
        this.y=y+trans;
    }
    
}
