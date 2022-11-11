/**
 * Exercice Boucles
 * 
 * 1. Afficher tous les nombres entiers de 1 a 20 en utilisant la boucle for et while.
 * 2. Afficher les 20 premiers resultats d'une table de multiplication
 * sous la forme : 1 x 5 = 5 etc...
 * 3. Afficher les tables de multiplication pour les nombres de 5 a 10 inclus.
 */

package cours_exercices.exercices.boucles;

// Classe principale
public class ExBoucles {

    public static void main(String[] args) {
        // Affichage avec la boucle for
        System.out.println("Afficher les nombres de 1 à 20 avec For");
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }
        // Affichage avec la boucle while
        System.out.println("Afficher les nombres de 1 à 20 avec While : ");
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }

        // Table de multiplication
        tableDe(7);
        // Table de multiplication des nombres 5 a 10 inclus
        for (i = 5; i <= 10; i++) {
            tableDe(i);
        }
    }

    private static void tableDe(int table) {
        System.out.println("Table de " + table + " : ");
        int result;
        for (int i = 1; i <= 20; i++) {
            result = i * table;
            System.out.println(i + " x " + table + " = " + result);
        }
    }
}