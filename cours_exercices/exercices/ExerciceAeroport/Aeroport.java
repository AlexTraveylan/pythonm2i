/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.ExerciceAeroport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tdema
 */
public class Aeroport {
    private List<ObjetVolant> objetsVolants = new ArrayList<>();

    public void ajoute(ObjetVolant objetVolant) {
        this.objetsVolants.add(objetVolant);
    }

    private void demarre() {
        if (this.objetsVolants.isEmpty()) {
            return;
        }

        while (true) {
            for (ObjetVolant objetVolant : this.objetsVolants) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("Erreur grave");
                    return;
                }
                if (!objetVolant.prepareVole()) {
                    objetVolant.decolle();
                    objetVolant.vole();
                    objetVolant.atterrit();
                } else {
                    objetVolant.repare();
                }
            }
        }

    }

    public static void main(String args[]) {
        Aeroport charlesDeGaulle = new Aeroport();
        // Ajouter ici des avions
        // ObjetVolant objetVolant = new ....
        // charlesDeGaulle.ajoute(..);
        charlesDeGaulle.ajoute(new Montgolfiere());
        charlesDeGaulle.ajoute(new Dirigeable());
        charlesDeGaulle.demarre();
    }
}
