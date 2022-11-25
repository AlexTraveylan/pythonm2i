from Console import *


class InputController:
    def __init__(self, console: Console):
        self.console = console

    def inputMontantEmprunt(self):
        try:
            montant = float(
                input("Donner le montant du prêt (entre 1 et 1000000 €): "))
        except:
            return self.inputMontantEmprunt()

        if (self.console.verifMontantEmprunt(montant)):
            return montant
        else:
            return self.inputMontantEmprunt()

    def inputTauxAnnuel(self):
        try:
            tx = float(input("Donner le taux annuel (entre 0.1 et 10 %) : "))
        except:
            return self.inputTauxAnnuel()

        if (self.console.verifTauxInteret(tx)):
            return tx
        else:
            return self.inputTauxAnnuel()

    def inputNombreAnnees(self):
        try:
            nbAn = int(input("Durée du prêt (entre 1 et 30 ans) : "))
        except:
            return self.inputNombreAnnees()

        if (self.console.verifNombreAnnees(nbAn)):
            return nbAn
        else:
            return self.inputNombreAnnees()
