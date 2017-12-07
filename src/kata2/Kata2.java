package kata2;
import java.util.*;
/**
 *
 * @author Ithiel
 */
public class Kata2 {
    public static void main(String[] args) {
        int [] data = {1,1,1,0,1,2,1,0,3};
        Map<Integer, Integer> myMap = new HashMap<>();
        
        for(int key:data){
            myMap.put(key, myMap.containsKey(key)?
                    myMap.get(key)+1: 1);
        }
        
        for (int key : myMap.keySet()){
            System.out.println(key + " ==> " + myMap.get(key) + " veces");
        }
    }  
 }  
