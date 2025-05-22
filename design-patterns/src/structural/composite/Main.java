package structural.composite;

public class Main {
    public static void main(String[] args){
        EmployeSimple e1=new EmployeSimple("ahmed","developeur");
        EmployeSimple e2=new EmployeSimple("med","swe");
        EmployeSimple e3=new EmployeSimple("aziz","devops");
        Manager em1=new Manager("kamel","lead");
        Manager em2=new Manager("nasir","ceo");
        Manager em3=new Manager("monji","vp");
        em2.ajouterEmploye(e1);
        em2.ajouterEmploye(em3);
        em3.ajouterEmploye(em1);
        e1.afficherInformations();


    }
}
