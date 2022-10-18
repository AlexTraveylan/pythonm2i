from fonction import createRandomList

# Exercice 7 : fonctions, boucles, tableaux,
# opérateurs d'incrémentation
# Utilisez obligatoirement une fonction
# Utilisez obligatoirement un tableau
# Contexte
# Calculer la moyenne des notes saisies.
# Programme à réaliser
# Saisissez les notes un par un, lorsque l'utilisateur saisit la note
# 1, la saisie des notes prend fin et votre
# programme affiche le nombre total de notes ( ie nombre d'étudiant) et la moyenne de la classe.


def exercice7():

    try:
        tailleListe = int(input("Entrer la taille de la liste des notes : "))
    except:
        return exercice7()

    listeNotes = createRandomList(tailleListe)

    moyenne = sum(listeNotes)/len(listeNotes)

    return f'La liste des notes est : \n {listeNotes} \n La moyenne est : {moyenne}'
