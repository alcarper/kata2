/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Histogram<T> {
    private HashMap<T, Integer> map = new HashMap();

    public Histogram() {
    }

    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public void increment (T key){
        map.put(key, map.containsKey(key)?map.get(key)+1 :1);
    }
}
