package heritage_et_polymorphisme;

import classe_et_object.point;

public class test {
    public static void main(String[] args) {
        Point p1=new Point(1, 2);
        Pointnom p2=new Pointnom(2,3,"A");
        p1.affCoord();
        //p2 est herite les fonction dans class Point est la polymorphism
        p2.affCoordnom();
        
    }
}
