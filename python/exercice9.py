from fonction import *

# Programme à réaliser
# Saisissez les notes une par une, lorsque l'utilisateur saisit la note -1, la saisie des notes prend fin et votre programme trie toutes les notes de votre tableau puis les affiches. Pas le droit au tab.sort :diable_souriant:
# Indice
# n = len(tab)
# for i in range(n):
#     for j in range(0, n-i-1):

# MODIFICATION : listes de nombres aléatoires crée par la fonction createRandomList


def exercice9() -> str:
    message = "Vous n'avez pas entré un entier entre 1 et 100"

    try:
        tailleList = int(
            input("Donner la taille de la liste des notes (entier entre 1 et 100) : "))
    except:
        return message

    if tailleList < 1 or tailleList > 100:
        return message

    listeNombres = createRandomList(tailleList)
    print(
        f'Vous avez choisi une liste de taille {tailleList}.\n Voici cette liste : \n {listeNombres}')

    newlist = []
    while len(listeNombres) > 0:
        minValue = 100
        for nombre in listeNombres:
            if nombre < minValue:
                minValue = nombre
        newlist.append(minValue)
        listeNombres.remove(minValue)

    return f"La voila triée :\n {newlist}"
