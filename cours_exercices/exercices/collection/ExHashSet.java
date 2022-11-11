/**
/**
 * Exercice Collections
 *
 * Creer une liste vide
 * Ajouter des elements de type String a cette liste
 * Inserer un element au debut de la liste
 * Afficher le nombre d'element contenu dans la liste
 * Afficher la liste
 * Modifier un element par une autre valeur
 * Parcourir la liste et afficher ses elements un par un
 * Supprimer un element de la liste et reafficher la liste
 */
package cours_exercices.exercices.collection;

// Classe principale

import java.util.HashSet;
import java.util.Set;


public class ExHashSet {

    public static void main(String args[]) {
        // Creer un HashSet
        Set<String> hashset = new HashSet<>();

        // Ajouter des elements dont des doublons
        hashset.add("coucou");
        hashset.add("coucou2");
        hashset.add("coucoudoublon");
        hashset.add("coucou3");
        hashset.add("coucoudoublon");
        hashset.add("coucoudoublon");
        hashset.add("coucou4");
        
        // Afficher la taille du set
        System.out.println("taille du hashset : (J'ai ajouté 7 elements, donc 3 identiques)");
        System.out.println(hashset.size());
        //Affichage du set (parcours de chaque élément)
        System.out.println("\nParcours de chaque élement : ");
        for (String elm : hashset) {
            System.out.print(elm + " -- ");
        }
        // Suppression d'un élément
        hashset.removeIf((e) -> e.equals("coucou") );     
        System.out.println("\n\nParcours de chaque élement : ");
        for (String elm : hashset) {
            System.out.print(elm + " -- ");
        }
       
        // Parcours avec la methode ForEach() et une lambda
        System.out.println("\n\nTest du for each : ");
        hashset.forEach(str -> System.out.print(str + " 123  -- " ));
        

    }

   

}