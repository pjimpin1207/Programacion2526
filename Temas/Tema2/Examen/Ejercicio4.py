import re

def validarC(codigo):
    patron = r"^[A-Z]{2}-[a-z]{2}[0-9]{3}$"
    if re.search(patron, codigo):
        return True
    else:
        return False
    


codigos = ["AB-xy123", "A B-xy123", "ZX-aBc555", "XY-ab99"]
for codigo in codigos:
    print(codigo, "=", validarC(codigo))