/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.fonctionLambda;

/**
 *
 * @author tdema
 */
public class Exlambda {
    public static void main(String[] args){
        //Définir dans un autre fichier, une interface fonctionnelle  OperationBinaire
        //annotée comme une interface fonctionnelle.
        
        OperationBinaire operation = (double arg1, double arg2) -> {return arg1 * arg2;};
        executeOperation(operation, 3.23,4.65);
        
        
        
    }
    
    public static void executeOperation(OperationBinaire operationBinaire, double arg1, double arg2){
        System.out.println(operationBinaire.execute(arg1, arg2));
    }
    
}
