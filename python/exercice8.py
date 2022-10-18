from fonction import createRandomList


class Eleve:
    def __init__(self, nom: str, prenom: str, notes=[]):
        self.nom = nom
        self.prenom = prenom
        self.notes = notes

    def moyenne(self) -> float:
        """ Retourne la moyenne des notes d'un eleves

        return
        ------
            float:
                moyenne des notes
        """
        return sum(self.notes)/len(self.notes)


class Classe:
    def __init__(self, nom: str, listeEleves: list[Eleve]):
        self.nom = nom
        self.listeEleves = listeEleves

    def moyenne(self) -> float:
        """Retourne la moyenne des notes de la classe
        parameters
        ----------
            list[] contenant les objets de type Eleve de la Classe

        return
        ------
            float:
                moyenne des notes de tous les élèves de la classe
        """
        # La fonction map applique a chaque eleve sa methode moyenne() pour donner une liste des moyennes des eleves de la classe.
        listeMoyenne = list(map(lambda x: x.moyenne(), self.listeEleves))
        print(f'La liste des moyennes de la classe : {listeMoyenne}')
        return sum(listeMoyenne)/len(listeMoyenne)


# Tests des classes ! ci dessous.

eleve1 = Eleve("eleve1", "eleve1", createRandomList(5))
print(f'La moyenne de {eleve1.nom} {eleve1.prenom} est : {eleve1.moyenne()}')
eleve2 = Eleve("eleve2", "eleve2", createRandomList(5))
print(f'La moyenne de {eleve2.nom} {eleve2.prenom} est : {eleve3.moyenne()}')
eleve3 = Eleve("eleve3", "eleve3", createRandomList(5))
print(f'La moyenne de {eleve3.nom} {eleve3.prenom} est : {eleve2.moyenne()}')
eleve4 = Eleve("eleve4", "eleve4", createRandomList(5))
print(f'La moyenne de {eleve4.nom} {eleve4.prenom} est : {eleve4.moyenne()}')
eleve5 = Eleve("eleve5", "eleve5", createRandomList(5))
print(f'La moyenne de {eleve5.nom} {eleve5.prenom} est : {eleve5.moyenne()}')
eleve6 = Eleve("eleve6", "eleve6", createRandomList(5))
print(f'La moyenne de {eleve6.nom} {eleve6.prenom} est : {eleve6.moyenne()}')
eleve7 = Eleve("eleve7", "eleve7", createRandomList(5))
print(f'La moyenne de {eleve7.nom} {eleve7.prenom} est : {eleve7.moyenne()}')
eleve8 = Eleve("eleve8", "eleve8", createRandomList(5))
print(f'La moyenne de {eleve8.nom} {eleve8.prenom} est : {eleve8.moyenne()}')
eleve9 = Eleve("eleve9", "eleve9", createRandomList(5))
print(f'La moyenne de {eleve9.nom} {eleve9.prenom} est : {eleve9.moyenne()}')

eleves = []
eleves.append(eleve1)
eleves.append(eleve2)
eleves.append(eleve3)
eleves.append(eleve4)
eleves.append(eleve5)
eleves.append(eleve6)
eleves.append(eleve7)
eleves.append(eleve8)
eleves.append(eleve9)


classe = Classe("CM1 de Madame Curvier", eleves)
print(f"creation de la classe {classe.nom} ... de {len(eleves)} élèves")
print(classe.moyenne())

#/Fin des tests