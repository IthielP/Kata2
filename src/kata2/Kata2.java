package kata2;
import java.util.*;
/**
 *
 * @author Ithiel
 */
public class Kata2 {
      public static void main(String[] args) { 
        String [] data = {"uno", "uno", "dos", "tres", "tres"};
        
       Histogram histo = new Histogram(data);
       Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()){
             System.out.println(key + " ==> " + histogr.get(key) + " veces");
         } 
    }  
 }  
