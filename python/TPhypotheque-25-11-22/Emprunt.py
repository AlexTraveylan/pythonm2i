

class Emprunt:
    def __init__(self, montantEmprunt=100000, tauxInteretAnnuel=0.05, nombreAnnee=5):
        self.montantEmprunt = montantEmprunt
        self.tauxInteretAnnuel = tauxInteretAnnuel
        self.nombreAnnee = nombreAnnee
        self.MOISPASSE = 0
        self.TOTAL = montantEmprunt
        self.TAUXINTERETMENSUEL = tauxInteretAnnuel/1200
        self.NOMBREMOIS = nombreAnnee*12

    # def paiementMensuel(self):
    #     return (self.TOTAL * ((self.TAUXINTERETMENSUEL * ((1 + self.TAUXINTERETMENSUEL) ** self.NOMBREMOIS))) / (((1 + self.TAUXINTERETMENSUEL) ** self.NOMBREMOIS) - 1))

    # def payerUnMois(self):
    #     self.montantEmprunt -= self.paiementMensuel()
    #     self.MOISPASSE += 1

    def soldeRestant(self, moisDejaPayes):
        return self.TOTAL * ((((1 + self.TAUXINTERETMENSUEL)**self.NOMBREMOIS) - ((1 + self.TAUXINTERETMENSUEL)**moisDejaPayes)) / (((1 + self.TAUXINTERETMENSUEL)**self.NOMBREMOIS) - 1))

    def calendrier(self):
        print("\n -------------------------------------------------------------------------------------------- \n                              Calendrier de Paiement : \n -------------------------------------------------------------------------------------------- \n")
        l = []
        while self.MOISPASSE < self.NOMBREMOIS:
            self.MOISPASSE += 1
            l.append(
                f" Mois n°{self.MOISPASSE} : {self.soldeRestant(self.MOISPASSE):.2f}€")

        decal = len(l) // 3
        i = 0
        while i < decal:
            print(f"{l[i]}         {l[i+decal]}         {l[i+decal*2]}")
            i += 1
