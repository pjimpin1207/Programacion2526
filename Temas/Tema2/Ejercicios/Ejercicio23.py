p = [
    [5.0, 10.5],
    [8.2, 15.0],
    [1.5, 3.0]
]

# inicializar suma
suma = 0
# recorrer la matriz
for fila in p:
    suma += fila[1]

print("Suma de los precios de minorista:", suma)
