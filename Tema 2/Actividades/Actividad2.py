#Actividad 2

# for
numeros = [3, 2, 6, 8, 9]
suma = 0
elemento = 0

for elemento in numeros:
    suma = suma + elemento
    
print("La suma de los números con for es:", suma)

#for iin range
numeros = [3, 7, 2, 8, 5]
suma2 = 0

for i in range(len(numeros)):
    suma2 += numeros[i]

print("La suma de for in range es:", suma)

# While
suma3 = 0
i = 0
while i < len(numeros):
    suma3 = suma3 + numeros[i]
    i = i + 1
print("La suma con while es: ", suma3)