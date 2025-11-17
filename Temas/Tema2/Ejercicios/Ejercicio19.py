# Ejercicio 19: Comparacion de arrays
lista_a = [10, 20, 30]
lista_b = [10, 20, 30]
lista_c = [30, 20, 10] # Mismos elementos, orden diferente
lista_d = [10, 20]     # Longitud diferente

print(f"A == B: {lista_a == lista_b}") # True
print(f"A == C: {lista_a == lista_c}") # False (el orden importa)
print(f"A == D: {lista_a == lista_d}") # False (la longitud importa)

#TODO: Algoritmo que dice si dos arrays son iguales
def iguales(lista1, lista2):
    # primero hay que comprobar si tienen la misma longitud
    if len(lista1) != len(lista2):
        return False
    else:
    #segundo hay que comparar el elemento por elemento
        for i in range(len(lista1)):
            if lista1[i] != lista2[i]:
                return False
    
    # tercecro si no hay diferencias
    return True
    
    #TODO: retorna un valor boleano
    
#True (iguales)
print(f"A == B: {iguales(lista_a, lista_b)}")

#False (orden diferente)
print(f"A == C: {iguales(lista_a, lista_c)}")

#False (longitud diferente)
print(f"A == D: {iguales(lista_a, lista_d)}")

#mismo contenido pero en distinto orden
print(f"C == B: {iguales(lista_c, lista_b)}")