package creational.factory;

public class EnemyFactory {
    public static final int SMALL=0;
    public static final int BIG=1;
    public static Enemy createEnemy(int id){
        if(id==SMALL)return new EnemySmall();
        else if(id==BIG) return new EnemyBig();
        else return null;
    }
}
