# Ejercicio 20 

original = [1, 2, 3, 4, 5];

#copia con copy
copia1  = original.copy()

#copia con slicing
copia2 = original[:]

#copia manual
copia3 = []
for elemento in original:
    copia3.append(elemento)

#array original asignado en copia4
copia4 = original

# Mostrar las copias iniciales
print("\nCopias iniciales:")
print("Copia 1:", copia1)
print("Copia 2:", copia2)
print("Copia 3:", copia3)
print("Copia 4:", copia4)

# Modificar las copias
copia4.remove(5)
copia3.remove(1)


# Mostrar tras las eliminaciones
print("\nDespués de eliminar elementos:")
print("Original:", original)
print("Copia 1:", copia1)
print("Copia 2:", copia2)
print("Copia 3:", copia3)
print("Copia 4:", copia4)

#funcion iguales del otro ejercicio
def iguales(lista1, lista2):
    if len(lista1) != len(lista2):
        return False
    for i in range(len(lista1)):
        if lista1[i] != lista2[i]:
            return False
    return True

# Comparaciones entre arrays
print("\nComparaciones entre arrays:")
print("¿Original y Copia1 son iguales?", iguales(original, copia1))
print("¿Original y Copia2 son iguales?", iguales(original, copia2))
print("¿Original y Copia3 son iguales?", iguales(original, copia3))
print("¿Original y Copia4 son iguales?", iguales(original, copia4))