/**
 * Exercice Exceptions
 * 
 * Ecrire un programme qui demande a l'utilisateur de saisir une liste d'entiers puis a l'aide
 * de parcours successifs de la liste effectuer les actions suivantes :
 * 1) Afficher la liste
 * 2) Afficher la liste en colonne de maniere a afficher l'index et le contenu
 * 3) Creer une nouvelle liste qui sera chaque elements de la liste multiplies par 3
 * 4) Obtenir le plus grand nombre de la liste
 * 5) Obtenir le plus petit nombre de la liste 
 * 6) Compter le nombre des nombres pairs presents dans la liste
 * 7) Calculer la somme de tous les nombres impairs de la liste
 * NB: le programme doit gerer les exceptions au niveau de la saisie des donnees de l'utilisateur
 */

package cours_exercices.exercices.exceptions;

// Classe principale

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

public class ExExceptions {
    public static void main(String[] args) {
        List<Integer> listeEntier = new ArrayList<>();
        boolean test = true;
        int max = 1;
        while (test) {
            try {
                Scanner keyb = new Scanner(System.in);
                System.out.print("Combien d'entier voulez-vous ? ");
                max = keyb.nextInt();
                test = false;    
            } catch (InputMismatchException e) {
                System.out.println("\nPas le resultat attendu, recommence.");
            }
        }
        
        //ajoute chaque element de l'utilisateur dans notre collection
        for (int i :demanderUnEntier(max)) {
            listeEntier.add(i);
        };
        
        System.out.println("Affichage de la liste : " + listeEntier);
        
        for (int i=0 ; i < listeEntier.size(); i++) {
            System.out.println("Index : " + i + " Valeur : " + listeEntier.get(i));
        }
        
        List<Integer> newList = listeEntier.stream().map(elm -> elm*3).collect(toList());
        
        System.out.println("Liste *3 : " + newList);
        
        
        listeEntier.sort((o1, o2) -> o1 - o2);
        System.out.println("Le minimum est : " + listeEntier.get(0));
        
        
        listeEntier.sort((o1, o2) -> o2 - o1);
        System.out.println("Le maximum est : " + listeEntier.get(0));
        
        List<Integer> pairs = listeEntier.stream().filter(e -> e%2 == 0).collect(toList());
        System.out.println("Liste des nombres pairs : " + pairs);
        
        int sommeImpairs = listeEntier.stream().filter(e -> e%2 == 1 ).mapToInt(i->i).sum();
        
        System.out.println("Somme des impairs : " + sommeImpairs);
       
    }
    /**
     * Cette fonction renvois un tableau d'entier
     * @param scan scanner pour recuperer les données de l'utilisateur
     * @param max nombre d'entier que l'on veut
     * @return liste des entiers données.
     * Si l'utilisateur a rentrée une erreur, ca sera 0 a la place de sa valeur.
     * Previens a chaque etape sur la console si ok ou erreur.
     */
    static int[] demanderUnEntier(int max){
        int[] reponse = new int[max];
        String test = "";
        for (int i = 0; i < max ; i++) {
            try{
                Scanner keyb = new Scanner(System.in);
                System.out.print("Donne l'entier  numero " + (i+1) + " : ");
                reponse[i] = keyb.nextInt();
                test = "ok";
            } catch (InputMismatchException e){
                reponse[i] = 0;
                test = "erreur";
            } finally {
                System.out.println(test);
            }
        }
        return reponse;
    }
   
}