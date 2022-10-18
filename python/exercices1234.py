# Exercice 1 : variables, types et concaténation
#
# Programme à réaliser:
# Demandez à l'utilisateur de saisir son nom et prénom.
#
# Affichez une phrase contenant le nom et prénom de l'utilisateur.
# Indice:maVariable= input("Message")print("text" + variable)

def exercice1():
    nom = input("Donne ton nom : ")
    nom = str(nom)
    prenom = input("donne ton prénom : ")
    prenom = str(prenom)
    return f'Bonjour {nom} {prenom}'

# Exercice 2 : opérateurs de comparaison
# Programme à réaliser
# En fonction de l'âge saisit par l'utilisateur,
# affichez l'un des 3 messages suivants :"Vous êtes majeur"
# "Vous êtes majeur et vous avez exactement 18 ans"
# "Vous êtes mineur"


def exercice2():
    age = input("Quel âge as-tu ? ")
    try:
        age = int(age)
        test = False
    except:
        exercice2()
    if age < 18:
        return "Vous êtes mineur"
    elif age == 18:
        return "vous êtes majeur et vous avez exactement 18 ans"
    else:
        return "Vous êtes majeur"


# Exercice 3 : opérateurs mathématiquesProgramme à réaliser1.
#  Demandez à l'utilisateur de saisir 2 nombres entiers :
#  2. Affichez le résultat de l'addition de ces 2 nombres
#  3. Affichez le résultat de la soustraction de ces 2 nombres
#  4. Affichez le résultat de la multiplication de ces 2 nombres
#  5. Affichez le résultat de la division de ces 2 nombres
#  6. Uniquement pour ce dernier point (numéro 5), lorsque le dénominateur
#  (deuxième nombre saisi par l'utilisateur) est égale à 0, n'effectuez pas l'opération, affichez le message suivant "Division par 0 impossible"

def exercice3():
    nombre1 = input("Nombre 1 : ")
    nombre2 = input("Nombre 2 : ")

    try:
        nombre1 = int(nombre1)
        nombre2 = int(nombre2)
    except:
        exercice3()

    if nombre2 == 0:
        division = "Division par 0 impossible"
    else:
        division = nombre1 / nombre2

    calculs = {
        'l\'addition': nombre1 + nombre2,
        'la soustraction': nombre1 - nombre2,
        'la multiplication': nombre1 * nombre2,
        'la division': division,
    }
    resultat = ""
    for calcul in calculs:
        resultat += f'Le resultat de {calcul} est {calculs[calcul]}\n'

    return resultat

# Exercice 4 : opérateurs logiques
# Programme à réaliser
# 1. Demandez à l'utilisateur de saisir un nombre compris entre 0 et 100.
# 2. Affichez à l'utilisateur l'un des messages suivants :
# "Nombre compris entre 0 et 50"
# "Nombre compris entre 51 et 75"
# "Nombre supérieur à 75 ou inférieur à 0"


def exercice4():

    test = True
    while test:
        nombre = input("Donner un nombre entre 0 et 100: ")
        try:
            nombre = int(nombre)
            if nombre >= 0 or nombre <= 100:
                test = False
        except:
            pass

    if nombre >= 0 and nombre <= 50:
        return "Nombre compris entre 0 et 50"
    elif nombre > 50 and nombre <= 75:
        return "Nombre compris entre 51 et 75"
    else:
        return "Nombre supérieur à 75"
