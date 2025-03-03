// not thread safe

package creational.singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {
    private String[] items={"a","b","c","d","e","f"};
    private List<String> data= Arrays.asList(items);
    private static Singleton instance;
    public static  Singleton getInstance() {
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    private Singleton(){
        Collections.shuffle(data);
    }
    public void display(){
        System.out.println(data);
    }
}
