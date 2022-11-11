/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.ExerciceAeroport;

/**
 *
 * @author tdema
 */
public class Test {
    public static void main(String args[]) {
        Montgolfiere obj = new Montgolfiere();
        System.out.println(obj.getIdentifiant());
        System.out.println(obj.prepareVole());
        obj.decolle();
        obj.vole();
        obj.atterrit();
        System.out.println(obj.prepareVole());
        System.out.println(obj.getEtatEnveloppe());
        obj.gonfle();
        System.out.println(obj.getEtatEnveloppe());
        
    }
}
