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

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ExCollection {
    public static void main(String args[]) {
        // Creer un ArrayList vide
        ArrayList<String> list = new ArrayList<>();

        // Ajouter des elements a l'ArrayList
        list.add("1er element ajoute");
        list.add("2eme element ajoute");
        list.add("3eme element ajoute");

        // Insertion d'un element au debut de la liste
        list.add(0, "valeur insere au debut");

        // Afficher la taille de la liste
        System.out.println("La taille de la liste est : " + list.size());

        // Afficher l'ArrayList
        afficherList(list);

        // Modification d'un element de la liste
        list.set(2, "L'element de l'index 2 a ete remplace");

        // Parcour de la liste
        afficherList(list);

        // Supprimer des elements de l'ArrayList
        list.remove(2);

        // Afficher l'ArrayList
        afficherList(list);

        // Parcour avec la methode ForEach() et une lambda
        System.out.println("\n ======== \n Resultat du ForEach : ");
        list.forEach((str) -> {
            System.out.print(str + " je rajoute un truc -- ");
        });

        // bonus test sur stream
        List<Integer> listTailles = list
                .stream()
                .map(str -> str.length())
                .collect(toList());
        System.out.println("\n\n test : ");
        for (int i : listTailles) {
            System.out.print(i + " -- ");
        }

    }

    static void afficherList(ArrayList<String> list) {
        System.out.println("\n\nImpression de la liste : ");
        for (String elm : list) {
            System.out.print(elm + " -- ");
        }

    }
}
