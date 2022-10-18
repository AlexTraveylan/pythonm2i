from exercices1234 import *
from exercices56 import *
from exercice9 import exercice9
from exercice7 import exercice7


def main():
    test = True
    while test:
        print("Taper 'exit' pour quitter le programme.")
        numeroExercice = input(
            "Choisir le numero de l'exercice (entre 1, 2, 3, 4, 5, 6, 7, 9) : ")
        match numeroExercice:
            case "exit":
                print('\n')
                print("Fermeture du programme")
                test = False
            case "1":
                print(exercice1())
                print('\n')
            case "2":
                print(exercice2())
                print('\n')
            case "3":
                print(exercice3())
                print('\n')
            case "4":
                print(exercice4())
                print('\n')
            case "5":
                print(exercice5())
                print('\n')
            case "6":
                print(exercice6())
                print('\n')
            case "7":
                print(exercice7())
                print('\n')
            case "9":
                print(exercice9())
                print('\n')
            case _:
                print("Commande incorrecte")
                print('\n')


main()
