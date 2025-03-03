package creational.factory;

public class Main {
    public static void main(String[] args) {
        Enemy e1=EnemyFactory.createEnemy(0);
        Enemy e2=EnemyFactory.createEnemy(1);
        System.out.println(e1);
        System.out.println(e2);



    }
}
