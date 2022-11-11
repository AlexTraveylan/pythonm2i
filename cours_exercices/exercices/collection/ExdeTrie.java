/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tdema
 */
public class ExdeTrie {
    
    public static void main(String[] args) {
    
    //Set<Integer> list = new TreeSet<>((o1 , o2) -> (o2-o1));
    Set<Integer> list = new TreeSet<>(new SuperComparator());
    list.add(-5);
    list.add(-54);
    list.add(54);
    list.add(21);
    list.add(6);
    list.add(13);
    list.add(-105);
    
    System.out.println("affichage de la list : " + list);
    
    
    
    
    
    
    
    }
}
