package classe_et_object;
public class ex1_class_object {
    public static void main(String[] args) throws Exception {
        point t = new point("test", 2.3, 1.3);
        t.afficher();
        t.translation(3);
        // claculons la distance entre t1 et t2
        point t1 = new point("test", 1, 2);
        point t2 = new point("test2", 4, 6);
        System.out.println(distance_point(t1,t2));
        
    }

    public static double distance_point(point A, point B) {
        // return pour ex1
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
    }
}
