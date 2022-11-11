/*
 * Exercice conditions
 * 
 * 1. Chercher le plus grand des 3 nombres saisie par l'utilisateur
 * 2. Afficher sur les nombres saisie sont pairs ou impairs
 * 3. Demander a l'utilisateur de saisir le numero d'un mois de l'annee
 * et afficher le nombre de jours correspondant au mois choisi (28/29) pour fevrier
 * indiquer un message d'erreur si le numero de mois n'est pas compris entre 1 et 12.
 */

package cours_exercices.exercices.conditions;

// Classe principale

import java.util.Scanner;

public class ExConditions {
    public static void main(String[] args) {
        // Declarations / definitions des variables
        
        Scanner keyb = new Scanner(System.in);
        
        // Recuperer la ligne saisie
        System.out.println("Entrer le nombre n°1 : ");
        int num1 = keyb.nextInt();
        
        System.out.println("Entrer le nombre n°2 : ");
        int num2 = keyb.nextInt();
        
        System.out.println("Entrer le nombre n°3 : ");
        int num3 = keyb.nextInt();
        
        System.out.println(Math.max(num1, Math.max(num2,num3)));
        
        int max = 1000;
        // Fournir les donnees d'entree

        // Chercher le maximum
        // si num1 > num2 et num1 > num3
        if (num1 > num2 && num1 > num3) {
            max = num1;
        }
        // si num1 > num2 mais num1 <= num3
        else if (num1 > num2 && num1 <= num3) {
            max = num3;
        }
        // Si num1 <= num2 et num2 > num3
        else if (num1 <= num2 && num2 > num3) {
            max = num2;
        }
        // si num1 <= num2 et num2 <= num3
        else if (num1 <= num2 && num2 <= num3) {
            max = num3;
        } else {
            max = 0;
        }
        // Afficher le resultat
        System.out.println("Le maximum est : " + max);
        // Afficher si num1 est pair ou impair
        if ( num1 % 2 == 0) {
            System.out.println("Le nombre" + num1 + "est : pair");
        } else {
            System.out.println("Le nombre " + num1 + " est : impair");
        }

        // Fournir les donnees d'entree
        
        System.out.println("Entrer le mois : ");
        int mois = keyb.nextInt();
        
        
        String resultat;
        resultat = switch (mois) {
            case 1,3,5,7,8,10,12 -> "30";
            case 2 -> "28 ou 29";
            case 4,6,9,11 -> "31";
            default -> "erreur";
        };

        // Afficher le resultat
        System.out.println(resultat + " jours dans ce mois");

        // Fermer les ressources
        keyb.close();
    }
}