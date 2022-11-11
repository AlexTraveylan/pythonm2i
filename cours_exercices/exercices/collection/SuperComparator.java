/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.collection;

import java.util.Comparator;

/**
 *
 * @author tdema
 */
public class SuperComparator  implements Comparator<Integer>{

    public SuperComparator() {
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
    
}
