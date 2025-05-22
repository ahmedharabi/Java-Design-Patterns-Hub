package structural.composite;

import java.util.ArrayList;

public class Manager extends Employe{
    ArrayList<Employe> list=new ArrayList<>();
    public Manager(String nom,String poste){
        super(nom,poste);

    }
    public void ajouterEmploye(Employe employe){
        list.add(employe);
    }
    public void supprimerEmploye(Employe employe){
        list.remove(employe);
    }

    @Override
    public void afficherInformations() {
        System.out.println("nom: "+super.nom+ " poste: "+super.poste);
        for(int i=0;i<list.size();i++){
            list.get(i).afficherInformations();
        }
    }
}
