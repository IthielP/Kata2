/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.*;
/**
 *
 * @author Ithiel
 */
public class Histogram {
     private final int [] data;
 
     public Histogram(int[] data) {
         this.data = data;
     }

    Histogram(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
     
 
     public int[] getArray() {
         return data;
     }
     
     Map<Integer, Integer> getHistogram(){
         Map<Integer, Integer> histogram = new HashMap<>();
         for (int key : data) {
             histogram.put(key, histogram.containsKey(key) ?
             histogram.get(key) + 1 : 1);
         }
         
         return histogram;
     }
     
 }  
