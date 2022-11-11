/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Creer un autre tableau ayant un element de plus que le premier initialiser a 0.
* 3. Afficher les elements du premier tableau.
* 4. Afficher les elements du 2eme tableau.
* 5. Copier les valeurs du premier tableau dans le second et inserer une valeur aribitraire a la 3eme position.
* 6. Afficher le tableau apres l'operation d'insertion.
*/

package cours_exercices.exercices.tableaux;

// Classe principale
public class ExTableaux {
    public static void main(String[] args) {
        // Afficher les elements du tableau original
        int[] fibonacci8 = { 1, 1, 2, 3, 5, 8, 13, 21 };

        System.out.println("Affichage de la premiere liste de taille " + fibonacci8.length + " : ");
        afficherList(fibonacci8);

        // Afficher les elements du nouveau tableau
        int[] tableauDe0 = new int[9];

        System.out.println("\nAffichage de la deuxième liste de taille " + tableauDe0.length + " : ");
        afficherList(tableauDe0);

        // Copie des elements du premier tableau
        // et insertion d'un element a la 3eme position

        int randomNumber = (int) (Math.random() * 1000);
        System.out.println("\nvaleur random : " + randomNumber);

        for (int i = 0; i < fibonacci8.length + 1; i++) {
            if (i < 2) {
                tableauDe0[i] = fibonacci8[i];
            } else if (i == 2) {
                tableauDe0[i] = randomNumber;
            } else {
                tableauDe0[i] = fibonacci8[i - 1];
            }
        }

        // Afficher le tableau apres l'operation d'insertion
        System.out.println("\nAffichage de la troisième liste de taille " + tableauDe0.length + " :");
        afficherList(tableauDe0);

        // Messaged de fin

        exosupp();

    }

    private static void afficherList(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    // 1. Ecrire dans un tableau de char à deux dimensions les valeurs
    // suivantes : {{'B','A','Y'}{'R','A','O'}{'A','V','U'}{'V','A','P'}{'O','
    // ','I'}}
    // * 2. Passer tous les caractères du deuxième tableau en minuscules
    // * 3. Afficher les éléments en itérant par la première dimension, puis la
    // deuxième

    private static void exosupp() {
        char[][] characters = { { 'B', 'J', 'Y' }, { 'R', 'A', 'O' }, { 'A', 'V', 'U' }, { 'V', 'A', 'P' },
                { 'O', ' ', 'I' } };

        char[][] resultat = new char[characters.length][3];

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < 3; j++) {
                resultat[i][j] = Character.toLowerCase(characters[i][j]);
            }
        }
        System.out.println("\n");
        for (char[] row : resultat) {
            for (char i : row) {
                System.out.print(i + " ");
            }
        }

        char[][] resultat2 = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                resultat2[i][j] = Character.toLowerCase(characters[j][i]);
            }
        }

        System.out.println("\n");
        for (char[] row : resultat2) {
            System.out.print(" ");
            for (char i : row) {
                System.out.print(i);
            }
        }
    }

}