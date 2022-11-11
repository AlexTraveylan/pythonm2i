/**
 * Exercice Abstraction / Polymorphisme
 * 
 * Creer une classe abstraite ayant 3 methodes :
 * getCommentCaVa, getLangue et traduireCommentCaVa.
 * les deux premieres methodes sont abstraitent.
 * la derniere methode affichera "Eb .... on dit : ...." en utilisatnt les methodes abstraites.
 * 
 * Ecrire 3 classes de langues differentes qui surchargerons les methodes abstraites de la classe precedente.
 * Elles permettrons d'indiquer la langue et le texte dans la langue correspondante a la phrase 
 * comment ca va ?
 * 
 * Ecrire une classe principale qui creera une instance des 3 classes de langues
 * et qui applera la methode traduireCommentCaVa pour chaque langue et affichera par exemple :
 * En anglais on dit : "How are you ?"
 * 
 * Creer une objet de la classe langue via le polymorphisme et appeler la methode traductionCommentCaVa().
 */

package cours_exercices.exercices.abstraction;

// Classe abstraite

abstract class Langage {

    abstract String getCommentCaVa();

    abstract String getLangue();
  
    public void traduireCommentCaVa() {
        System.out.println("En " + getLangue() + " on dit : " + getCommentCaVa());
    }
  
}

// Classe Anglais
class Anglais extends Langage {
    
    @Override
    public String getCommentCaVa() {
        return "How are you ?";
    }
    
    @Override
    public String getLangue() {
        return "anglais";
    }
}

// Classe Italien
class Italien extends Langage {
    
    @Override
    public String getCommentCaVa() {
        return "Come va ?";
    }
    
    @Override
    public String getLangue() {
        return "italien";
    }
}

// Classe Espagnol
class Espagnol extends Langage {
    
    @Override
    public String getCommentCaVa() {
        return "¿ Cómo estás ?";
    }
    
    @Override
    public String getLangue() {
        return "espagnol";
    }
}



// Classe principale
public class ExAbstractionPolymorphisme {
    public static void main(String[] args) {
        
        System.out.println("Test des trois classes enfants : ");
        System.out.println("===========================");
        
        Anglais anglais = new Anglais();
        Italien italien = new Italien();
        Espagnol espagnol = new Espagnol();
        
        anglais.traduireCommentCaVa();
        italien.traduireCommentCaVa();
        espagnol.traduireCommentCaVa();
               
        // Polymorphisme
        
        System.out.println("\nTest du Polymorphisme : ");
        System.out.println("===========================");
        
        Langage anglaisPolymorphe = new Anglais();
        
        anglaisPolymorphe.traduireCommentCaVa();
      
    }
}