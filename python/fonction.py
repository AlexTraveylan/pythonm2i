import random

random.randint(5, 15)


def createRandomArray(tailleListe: int):
    """Créer une liste de nombres aléatoires (tous différents)

    Paramètre
    ---------
    tailleListe : int
        taille de la liste à créer, max 100

    Retour
    ------
    array
        Un tableau de taille : tailleListe, remplis de nombres aléatoires
    """
    if tailleListe < 0 or tailleListe > 100:
        tailleListe = 100
    if not type(tailleListe) == int:
        tailleListe = 100

    resultat = []
    i = 0
    while i < tailleListe:
        test = True
        while test:
            nombre = random.randint(1, 100)
            if nombre not in resultat:
                resultat.append(nombre)
                test = False
                i += 1
    return resultat


resultat = createRandomArray(15)
print(resultat)
