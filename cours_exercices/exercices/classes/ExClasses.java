/**
 * Exercices Classes
 * 
 * Creer une classe Voiture ayant les proprietes suivantes :
 * un identifiant, la marque, le modele, la couleur, la vitesse maximum
 * et comme methodes : demarrer, rouler, stopper et arreter
 * mettre de message si la voiture est deja demarrer etc ...
 * puis dans la classe principale, declarer des objets de la classe Voiture
 * et faite les demarrer puis rouler, etc ...
 * Faire une methode infos qui donnera les informations sur l'objet et son etat.
 */

package cours_exercices.exercices.classes;

// Classe voiture

import java.util.Scanner;
import java.util.ArrayList;

class Voiture {
    
    static int compteur = 0;
    // Proprietes
    private final int identifiant;
    private final String marque;
    private final String modele;
    private final String couleur;
    private final int vitesseMax;
    private boolean roule;
    private boolean demarre;
    
    
    // Constructeurs
    Voiture(String marque, String modele, String couleur) {
        this.identifiant = ++compteur;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.vitesseMax = 50 + (int)(Math.random() * 200);
        this.roule = false;
        this.demarre = false;
        System.out.println("Construction de la voiture n°" + compteur + " ...");
        
    }
    
     
    // Methodes de la classe
    void infos() {
        System.out.println("________________________________");
        System.out.println("| Identifiant : " + this.identifiant);
        System.out.println("| Marque : " + this.marque);
        System.out.println("| Modele : " + this.modele);
        System.out.println("| Couleur : " + this.couleur);
        System.out.println("| Vitesse Maximale : " + this.vitesseMax);
        if (this.demarre) {
            System.out.println("| Le moteur est allumé");
        } else {
            System.out.println("| Le moteur est arreté");
        }
        if (this.roule) {
            System.out.println("| La voiture roule");
        } else {
            System.out.println("| La voiture ne roule pas");
        }
        System.out.println("________________________________");
}
    
    void demarrer() {
        if (!this.demarre) {
        System.out.println("La voiture " + this.identifiant + " demarre.. VROUUM");
        this.demarre = true;
        } else {
            System.out.println("La voiture est déjà en route !");
        }
    }
    
    void rouler() {
        if (!this.demarre) {
            System.out.println("Il faut d'abord demarrer la voiture !");
        } else {
            if (this.roule) {
                System.out.println("La voiture " + this.identifiant + " roule déjà.");
            } else {
                System.out.println("La voiture " + this.identifiant + " roule, vitesse maximale : " + this.vitesseMax);
                this.roule = true;
        }
        }
    }
    
    void stop() {
        if (this.demarre) {
            System.out.println("La voiture s'arrete ...");
            this.demarre = false;
            this.roule = false;
            
        } else {
            System.out.println("La voiture est deja arreté");
        }
        
    }
    // Getters
    

    public int getIdentifiant() {
        return identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public boolean isRoule() {
        return roule;
    }

    public boolean isDemarre() {
        return demarre;
    }
    
    // Setters

    public void setRoule(boolean roule) {
        this.roule = roule;
    }

    public void setDemarre(boolean demarre) {
        this.demarre = demarre;
    }   
    
    
    
}
   
    

    
    
    
    

// Classe principale
public class ExClasses {
    public static void main(String[] args) {
       // Definitions des onjets
       
       // Utilisation des objets
       boolean sortie = true;
       Scanner keyb = new Scanner(System.in);
       Voiture voiture1 = new Voiture("Fiat", "500", "rouge");
       Voiture voiture2 = new Voiture("Tesla", "Serie S", "blanche");
       Voiture voiture3 = new Voiture("BMW", "Aucune idee", "noir");
       
       //Creation d'une liste pour creer d'autres voitures
       ArrayList<Voiture> listeVoiture = new ArrayList<Voiture>();
       listeVoiture.add(voiture1);
       listeVoiture.add(voiture2);
       listeVoiture.add(voiture3);
       int choix;
       Voiture voiture = listeVoiture.get(0);
       String tempMarque, tempModele, tempCouleur; 
      
       
       while (sortie) {
       System.out.println("\n===========================================");
       System.out.println("Liste des commandes : info, add, change, dem, roul, stop, exit");
       System.out.print("Entrer une commande : ");
       String commands = keyb.next();
       switch (commands) {
           case "change":
               System.out.print("Choisir un voiture (entier entre 1 et " + listeVoiture.size() + ") : ");
               choix = keyb.nextInt()-1;
               if (choix <= listeVoiture.size()){
                   voiture = listeVoiture.get(choix);
               } else {
                   System.out.println("Cette voiture n'existe pas.");
               }
               break;
           case "add" :
               System.out.println("Processus de creation d'une voiture lancé ...");
               System.out.print("Choisir la marque de votre voiture : ");
               tempMarque = keyb.next();
               System.out.print("Choisir maintenant le modele de votre voiture : ");
               tempModele = keyb.next();
               System.out.print("Et pour finir, la couleur de votre voiture : ");
               tempCouleur = keyb.next();
               listeVoiture.add(new Voiture(tempMarque, tempModele, tempCouleur));
               break;
           case "info" :
               voiture.infos();
               break;
           case "dem" :
               voiture.demarrer();
               break;
           case "roul" :
               voiture.rouler();
               break;
           case "stop" :
               voiture.stop();
               break;
           case "exit":
               sortie = false;
               break;
           default :
               System.out.println("Cette commande n'est pas reconnue");
                
        }
       }
       keyb.close();
    }
}