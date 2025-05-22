package structural.composite;

public class EmployeSimple extends Employe {

    public EmployeSimple(String nom,String poste){
        super(nom,poste);
    }


    @Override
    public void afficherInformations() {
        System.out.println("nom: "+super.nom+ " poste: "+super.poste);
    }
}
