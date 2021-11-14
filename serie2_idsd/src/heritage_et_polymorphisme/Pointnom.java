package heritage_et_polymorphisme;

import classe_et_object.point;

public class Pointnom extends Point{
    public String name;
    public Pointnom(int x, int y,String nom){
        super(x,y);
        this.name=nom;
    }
    public void affCoordnom()
    { 
        System.out.println ("le point "+name+"Coordonnees : " + x + " " + y) ;
    }
}
