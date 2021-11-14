package heritage_et_polymorphisme;
public class Point {
    public Point (int x, int y) { this.x = x ; this.y = y ; }
    public void affCoord()
    { 
        System.out.println ("Coordonnees : " + x + " " + y) ;
    }
    protected int x, y ;
}
    