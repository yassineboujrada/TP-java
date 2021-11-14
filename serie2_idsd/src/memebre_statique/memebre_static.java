package memebre_statique;
public class memebre_static {
    static int appel;// dernier objet
    int nbr;// numero de l'object
    public memebre_static(){
        appel++;
        nbr=appel;
    }

    static int getIdentmax(){
        return appel;
    }

    static int ackeramane(int m,int n){
        if(n==0){
            return ackeramane(m-1,1);
        }
        else
            if(m==0){
                return n+1;
            }
            else
                return ackeramane(m-1,ackeramane(m,n-1));
    }

}