/**
 * Exercice Heritage
 * 
 * Definissez une classe Cercle. Les objets construits a partir de cette classe
 * seront des cercles de tailles variees. En plus de la methode constructeur
 * (qui utilisera donc un parametre rayon), vous definirez les methodes surface et perimetre
 * qui devront renvoyer la surface et le perimetre du cercle.
 * Definissez ensuite une classe Cylindre derivee de la precedente.
 * Le constructeur de cette nouvelle classe comportera les deux parametres rayon et hauteur.
 * Vous y ajouterez une methode volume qui devra renvoyer le volume du cylindre
 * (rappel : volume d'un cylindre = surface de section x hauteur).
 */

package cours_exercices.exercices.hertiage;

// Classe Cercle

import java.util.Scanner;

class Cercle {
    // Propriete
    static int compteur = 1;
    protected double rayon;
    
    // Constructeur
    
    public Cercle() {
        
    }
    
    public Cercle(double rayon) {
        this.rayon = rayon;
        System.out.println("Création d'un cercle n" + this.compteur++ + " de rayon " + this.rayon + " m ...");
    }
      
    // Getters
    public double getRayon() {
        return rayon;
    }
        
    // Setters
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Methodes
    public double surface() {
        return Math.PI * this.rayon * this.rayon;
    }
    
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }
    

}
// Classe Cylindre
class Cylindre extends Cercle {
    // Propriete
    double hauteur;

    // Constructeur
    public Cylindre(double rayon, double hauteur) {    
        this.rayon = rayon;
        this.hauteur = hauteur;
        System.out.println("Création d'un cylindre de rayon " + this.rayon + " m, et de hauteur " + this.hauteur + " m");
    }

    // Getters
    public double getHauteur() {
        return hauteur;
    }
    
    
    // Setters
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    
    // Methode
    @Override
    public double surface() {
        return super.surface()*2 + super.perimetre()*this.hauteur;
    }
    
    @Override
    public double perimetre() {
        throw new UnsupportedOperationException();
    }
    
    public double volume() {
        return super.surface() * this.hauteur;
    }

}

// Classe principale
public class ExHeritage {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        //Création du cercle
        System.out.println("Partie 1 : Création et calcul sur un cercle.");
        System.out.println("==============================================");
        System.out.print("Indiquer le rayon du cercle à creer : ");
        double tempRayon = keyb.nextDouble();
        Cercle cercle = new Cercle(tempRayon);
        
        //test des methodes du cercle
        System.out.print("\nLe cercle a une aire de : " + cercle.surface() + " m2");
        System.out.println("\nLe cercle a un périmètre de : " + cercle.perimetre() + " m");
        
        //Création du cylindre
        System.out.println("\nPartie 2 : Création et calculs sur un cylindre");
        System.out.println("================================================");
        System.out.print("Indiquer le rayon du cylindre à creer : ");
        tempRayon = keyb.nextDouble();
        System.out.print("Indiquer la hauteur du cylindre à creer : ");
        double tempHauteur = keyb.nextDouble();
        Cylindre cylindre = new Cylindre(tempRayon, tempHauteur);
        
        //test des methodes du cylindre
        try {
            System.out.println("\nLe cylindre a un périmètre de : " + cylindre.perimetre() + " m");
        } catch (Exception e) {
            System.out.println("\nLa methode périmètre ne fonctionne pas sur le cylindre");
        }
        System.out.println("\nLa surface du cylindre est : " + cylindre.surface() + " m2");
        System.out.println("Le volume du cylindre est : " + cylindre.volume() + " m3\n");
        
        
        
        keyb.close();
    }
}