package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory factory;
        String os="windows".toLowerCase();
        if(os.equals("mac")){
            factory=new MacFactory();
        } else if (os.equals("windows")) {
            factory=new WindowsFactory();
        }
        else {
            factory=null;
        }
        try {
            Button b1 = factory.createButton();
            CheckBox cb1 = factory.createCheckBox();
            b1.render();
            cb1.check();
        }catch (Exception e){
            System.out.println("you must specify an operating system");
        }
    }


}
