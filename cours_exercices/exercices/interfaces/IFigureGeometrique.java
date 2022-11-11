/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.interfaces;

/**
 *
 * @author tdema
 */
public interface IFigureGeometrique {
    
    default void methodeParDefaut() {
        System.out.println("Flemme");
    }
    
    double getAire();
    double getPerimetre();
    
    public static void insulter() {
            System.out.println("merdouille");
    }
    
}
