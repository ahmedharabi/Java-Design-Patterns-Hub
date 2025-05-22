package structural.composite;

public abstract class Employe {
    String nom;
    String poste;
    public Employe(String nom,String poste){
        this.nom=nom;
        this.poste=poste;
    }

    public abstract void afficherInformations();
}
