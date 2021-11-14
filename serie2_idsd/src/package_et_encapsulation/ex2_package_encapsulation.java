package package_et_encapsulation;

public class ex2_package_encapsulation {
    public static void main(String[] args) {
        tester_package w=new tester_package();
        w.a=4; // pour varaiable a , il s'a marche car il est public
        //w.b="test";// pour b il est bloquer car il n'es pas meme class tester package
        w.y="test2";// pour variable y il est acceptable car les deux class en meme package
        // setter & getter
        w.setB("test");
        w.getB();
        
    }
    
}
