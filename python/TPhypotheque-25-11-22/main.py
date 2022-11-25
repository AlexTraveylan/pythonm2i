from Emprunt import *
from InputController import *


controller = InputController(Console())
m = controller.inputMontantEmprunt()
tx = controller.inputTauxAnnuel()
nbA = controller.inputNombreAnnees()

emp = Emprunt(m, tx, nbA)

emp.calendrier()
