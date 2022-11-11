/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.ExerciceAeroport;

/**
 *
 * @author tdema
 */
public class Montgolfiere extends ObjetVolant implements IEnveloppe {

    EnumEtatEnv etatEnveloppe;

    public EnumEtatEnv getEtatEnveloppe() {
        return etatEnveloppe;
    }
    
    public Montgolfiere() {
        super();
        this.identifiant = "MON" + compteur;
        this.etatEnveloppe = EnumEtatEnv.DEGONFLE;
    }
    
    @Override
    public void gonfle() {
        if (this.etatEnveloppe == EnumEtatEnv.DEGONFLE) {
            System.out.println("L'enveloppe se gonfle");
            this.etatEnveloppe = EnumEtatEnv.GONFLE; 
        }   else {
            System.out.println("L'enveloppe est deja degonflée");
        }
    }

    @Override
    public void degonfle() {
        if (this.etatEnveloppe == EnumEtatEnv.GONFLE){
            System.out.println("L'enveloppe se degonfle");
            this.etatEnveloppe = EnumEtatEnv.DEGONFLE;
        } else {
            System.out.println("L'enveloppe est deja gonflée");
        }
   
    }
    
    
}
