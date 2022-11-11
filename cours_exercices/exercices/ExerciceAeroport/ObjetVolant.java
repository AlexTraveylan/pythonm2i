/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.ExerciceAeroport;

/**
 *
 * @author tdema
 */
abstract class ObjetVolant {
    
    static int compteur = 0;
    
    protected String identifiant;
    private boolean etat = true;
    
    public ObjetVolant() {
        this.etat = true;
        compteur ++;
    } 

    public String getIdentifiant() {
        return identifiant;
    }
    
    public boolean prepareVole() {
        return !this.etat;
    }
    
    public void decolle() {
        System.out.println("L'objet " + this.identifiant + " decolle");
    }
    
    public void vole() {
        System.out.println("L'objet " + this.identifiant + " vole");
    }

    public void atterrit() {
        this.etat = false;
        System.out.println("L'objet " + this.identifiant + " atterit");
    }
        
    public void repare() {
        this.etat = true;
        System.out.println("L'objet " + this.identifiant + " repare");
    }


   
    
}
