package package_et_encapsulation;

public class tester_package {
    public double a;
    private String b;
    protected String y;


    // pour resoudre probleme de private en utilise truc setter et getter
    //setter
    public void setB(String B){
        this.b=B;
    }
    //getter
    public String getB(){
        return this.b;
    }  
}
