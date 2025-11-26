inventario = [
    [101, 15.50, 45],
    [102, 5.00, 120],
    [103, 30.99, 15],
    [104, 8.75, 70],
    [105, 22.00, 30]
    ]

# buscar por id
ID_Producto = input("Introduce un ID de producto: ")

if ID_Producto == False:
    print("Error: El ID debe ser numérico.")
else:
    idBuscado = int(ID_Producto)
    encontrado = False
    for fila in inventario:
        if fila[0] == idBuscado:
            print("precio:", fila[1])
            print("stock:", fila[2])
            encontrado = True
            break

    if encontrado == False:
        print("ID no encontrado.")

# producto mas caro
maxPrecio = inventario[0][1]
idMasCaro = inventario[0][0]

for fila in inventario:
    precio = fila[1]
    if precio > maxPrecio:
        maxPrecio = precio
        idMasCaro = fila[0]

print ("El producto mas caro es: ",idMasCaro)