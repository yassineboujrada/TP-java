package class_abstrait_et_interface;

public abstract class Figure {
    public abstract void affiche();
    public abstract void homothetie (double coeff);
    public abstract  void rotation (double angle);
    public abstract void homorot(double coeff,double angle);
    // j'ai utiliser modificateur protected pour ce methode affiche seulement si 
    //on fait hritage et car on ne peut pas utiliser methode static en abstract
    protected abstract void affichefigure(Figure fig);
    protected abstract void homofigure(Figure fig);
    protected abstract void rotationfigure(Figure fig);
}
