/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.ExerciceAeroport;

/**
 *
 * @author tdema
 */
public interface IEnveloppe {
    
    public enum EnumEtatEnv {
        GONFLE, DEGONFLE;
    }
    
    
    public void gonfle();
    public void degonfle();
    
}
