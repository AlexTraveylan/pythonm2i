
class Console:
    def __init__(self, montantEmprunt=100000, tauxInteretAnnuel=5, nombreAnnees=5):
        self.montantEmprunt = montantEmprunt
        self.tauxInteretAnnuel = tauxInteretAnnuel
        self.nombreAnnees = nombreAnnees

    def verifMontantEmprunt(self, montant):
        try:
            if 1 < montant < 1000000:
                self.montantEmprunt = montant
                return True
            else:
                return False
        except:
            return False

    def verifTauxInteret(self, tx):
        try:
            if 0.1 < tx < 10:
                self.tauxInteretAnnuel = tx
                return True
            else:
                return False
        except:
            return False

    def verifNombreAnnees(self, nbAn):
        try:
            if 1 < int(nbAn) < 30:
                self.nombreAnnees = nbAn
                return True
            else:
                return False
        except:
            return False
