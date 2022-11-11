/**
 * Exercices methodes
 * 
 * 1. Definir une methode maximum(n1, n2, n3) qui renvoi le plus grand 
 * des 3 nombres n1, n2, n3 fourni en arguments.
 * exemple : maximum(2, 15, 5) doit afficher : 15
 * 
 * 2. Ecrire une fonction cube qui retourne le cube de son argument.
 * Ecrire une fonction volumeSphere qui calcule le volume d'une sphere de rayon r
 * fourni en argument et qui utilise la fonction cube. 
 */

package cours_exercices.exercices.methodes;

// Classe principale

import java.util.Scanner;

public class ExMethodes {
    // Methode maximum
    private static int maxTroisNombres(int n1, int n2, int n3) {
        int max = Math.max(n3, Math.max(n1, n2));
        return max;
    }

    // Methode cube
    private static int cube(int n) {
        return n*n*n;
    }
    
    // Methode volume
    private static double volumeSphere(int rayon) {
        return (4f / 3) * Math.PI * cube(rayon);
    }
    
    //bonus factoriel
    private static long factoriel(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factoriel(n-1);
        }
    }
    
    // Methode principale
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Entrer le nombre n°1 : ");
        int num1 = keyb.nextInt();
        
        System.out.print("Entrer le nombre n°2 : ");
        int num2 = keyb.nextInt();
        
        System.out.print("Entrer le nombre n°3 : ");
        int num3 = keyb.nextInt();
        
        System.out.println("\nLe maximum des trois nombres entrée est : " + maxTroisNombres(num1, num2, num3) + "\n");
        int[] listNombres = {num1, num2, num3};
        for (int nombre : listNombres) {
            System.out.println(nombre + "! = " + factoriel(nombre));
            System.out.println("Le cube de " + nombre + " est : " + cube(nombre));
            System.out.println("Le volume d'une sphère de rayon " + nombre + " m est : " + volumeSphere(nombre) + " m3\n");
        }
        
    }
}