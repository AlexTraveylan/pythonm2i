# Exercice 5 : structures itératives
# Programme à réaliser
# 1. Demandez à l'utilisateur de saisir un nombre compris entre 0 et 10
# Affichez à l'utilisateur le " Votre nombre est [nombre saisi]"
# uniquement lorsque le nombre est compris en 0 et 10
# Affichez le message "Saisissez un nombre compris en 0 et 10" tant que
# le nombre n'est pas compris entre 0 et 10

def exercice5():
    nombre = -1

    while nombre <= 0 or nombre > 10:
        try:
            nombre = float(
                input("Donner un nombre entier compris entre 0 et 10 : "))
        except:
            pass

    return f"Le nombre choisi est {nombre}"

# Exercice 6 : structures itératives
# Programme à réaliser
# Demandez à l'utilisateur de saisir un nombre inférieur à 100
# Forcez l'utilisateur à saisir un nombre inférieur à 100
# Affichez tous les nombres à partir du nombre saisi jusqu'à 100
# Exemple du résultat attendu
# L'utilisateur saisit 95 Le programme doit afficher "95 96 97 98 99 100"


def exercice6():

    nombre = -1
    while nombre < 0 or nombre > 100 or not type(nombre) == int:
        try:
            nombre = int(
                input("Donner un nombre entier compris entre 0 et 100 : "))
        except:
            pass

    result = ""
    for elm in range(nombre, 101):
        result += f'{elm} '

    return result[:-1]
