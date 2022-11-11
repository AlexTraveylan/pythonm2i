/**
 * Exercice Interface
 * 
 * Ecrire une interface nommee IFigureGeometrique
 * cette interface doit avoir la declaration de 2 methodes :
 * getAire() et getPerimetre()
 * 
 * Ecrire les classes Carre, Cercle, Rectangle et TriangleRectangle implementant l'interface
 * 
 * Ecrire une classe principale appelant
 */

package cours_exercices.exercices.interfaces;

// Interface FigureGeometrique

// Classe Rectangle
// Proprietes

// Constructeur

// Getters

// Setters

// Implementation des methodes de l'interface

class Rectangle implements IFigureGeometrique {

    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getAire() {
        return this.largeur * this.longueur;
    }

    @Override
    public double getPerimetre() {
        return (2 * this.largeur) + (2 * this.longueur);
    }

}

// Classe Carre

// proprietes

// Constructeur

// Getter

// Setter

// Implementation des methodes de l'interface
class Carre extends Rectangle {

    public Carre(double cote) {
        super(cote, cote);
    }

}

// Classe Cercle
// Propriete

// Constructeur

// Getter

// Setter

// Implementation des methodes de l'interface

class Cercle implements IFigureGeometrique {

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getAire() {
        return (Math.PI * this.rayon * this.rayon);
    }

    @Override
    public double getPerimetre() {
        return (2 * this.rayon * Math.PI);
    }

}

// Classe TriangleRectangle
// Proprietes

// Constructeur

// Getters

// Setters

// Implementation des methodes de l'interface

// Methode de la classe

class TriangleRectangle extends Rectangle {

    public TriangleRectangle(double longeur, double largeur) {
        super(longeur, largeur);
    }

    @Override
    public double getAire() {
        return super.getAire() / 2;
    }

    @Override
    public double getPerimetre() {
        double tempCote3 = Math.sqrt((this.largeur * this.largeur) + (this.longueur * this.longueur));
        return super.getPerimetre() / 2 + tempCote3;
    }
}

// Classe principale
public class ExInterfaces {
    public static void main(String... args) {

        Carre carre = new Carre(5);
        System.out.println("Périmetre : " + carre.getPerimetre() + " m");
        System.out.println("Aire : " + carre.getAire() + " m2");
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Périmetre : " + rectangle.getPerimetre() + " m");
        System.out.println("Aire : " + rectangle.getAire() + " m2");
        Cercle cercle = new Cercle(5);
        System.out.println("Périmetre : " + cercle.getPerimetre() + " m");
        System.out.println("Aire : " + cercle.getAire() + " m2");
        TriangleRectangle triangleRectangle = new TriangleRectangle(3, 4);
        System.out.println("Périmetre : " + triangleRectangle.getPerimetre() + " m");
        System.out.println("Aire : " + triangleRectangle.getAire() + " m2");

    }
}