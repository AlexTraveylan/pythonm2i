/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.bonus;
import java.util.*;
        

/**
 *
 * @author tdema
 */
public class exBonus {
    
    public static void main(String args[]) {
        int[] nums1 = {1,2,6};
        int[] nums2 = {2,6,9,65,126};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    
/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *The overall run time complexity should be O(log (m+n)).
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
 
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int taille1 = nums1.length;
        int taille2 = nums2.length;
        int tailleResult = taille1 + taille2;
        int[] resultat = new int[tailleResult];
        for (int i = 0; i < taille1; i++) {
            resultat[i] = nums1[i];
        }
        for (int i = 0; i < taille2; i++) {
            resultat[i + taille1] = nums2[i];
        }
        
        Arrays.sort(resultat);
        
        System.out.println("Affichage du tableau concaténé triée : ");
        for (int nombre : resultat) {
        System.out.print(nombre + " ");
        }
        
        if (tailleResult % 2 == 1) {
            return resultat[(int)(tailleResult/2)];
        } else {
            return (resultat[tailleResult/2] + resultat[tailleResult/2])/2f;
        }
    }
}