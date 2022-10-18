import random


def createRandomList(tailleListe: int) -> list:
    """Créer une liste de nombres aléatoires (tous différents)

    Paramètre
    ---------
    tailleListe : int
        taille de la liste à créer, max 100

    Retour
    ------
    list
        Une liste de taille : tailleListe, remplis de nombres aléatoires entre 1 et 100 tous différents
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
