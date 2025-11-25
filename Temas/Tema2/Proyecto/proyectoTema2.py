import re

#Colores ansi
ROJO = "\033[91m"
VERDE = "\033[92m"
COLORFINAL = "\033[0m"

# array para guardar el inventario
inventario = [
    [1, "Balon1", 25],
    [2, "Camiseta Cadiz2", 34],
    [3, "Calzonas3", 13],
    [4, "Medias4", 45],
    [5, "Botas5", 5]
]

# funcion para comprobar si es un numero entero
def esEntero(cadena):
    if len(cadena) == 0:
        return False

    for caracter in cadena:
        if caracter < "0" or caracter > "9":
            return False
    return True

# funcion para buscar por id
def buscarPorID():
    print("\nBuscar por ID")

    idEntrada = input("Introduzca el ID del producto: ")

    if esEntero(idEntrada) == False:
        print(ROJO + "Error: El ID debe ser un número entero." + COLORFINAL)
        return

    idBuscar = int(idEntrada)
    encontrado = False

    for fila in inventario:
        if fila[0] == idBuscar:
            print(f"Producto encontrado: Nombre = {fila[1]}, Stock = {fila[2]}")
            encontrado = True

    if encontrado == False:
        print(ROJO + "Error: Producto no encontrado." + COLORFINAL)

# funcion para comparar el stock
def comparar_stock():
    print("\nComparacion del stock")

    maxStock = inventario[0][2]
    minStock = inventario[0][2]
    nombreMax = inventario[0][1]
    nombreMin = inventario[0][1]

    for fila in inventario:
        stock = fila[2]

        if stock > maxStock:
            maxStock = stock
            nombreMax = fila[1]

        if stock < minStock:
            minStock = stock
            nombreMin = fila[1]

    print(f"Mayor stock: {nombreMax} ({maxStock} unidades)")
    print(f"Menor stock: {nombreMin} ({minStock} unidades)")

# validar regex
def validarNombreProd():
    print("\nValidacion de nombre del producto(Regex)")

    nombre = input("Introduce el nombre del nuevo producto: ")

    # Validar longitud
    if len(nombre) < 5 or len(nombre) > 20:
        print(ROJO + "Error: Introduce una longitud debe ser entre 5 y 20 caracteres." + COLORFINAL)
        return

    # Validar mayúscula inicial
    if re.match(r"^[A-Z]", nombre) == None:
        print(ROJO + "Error: El nombre debe empezar por una mayúscula." + COLORFINAL)
        return

    # Validar que para que contenga minimo un dígito
    if re.search(r"\d", nombre) == None:
        print(ROJO + "Error: El nombre debe contener al menos un dígito." + COLORFINAL)
        return

    # Regal
    patron = r"^[A-Z][A-Za-z0-9]{4,19}$"

    if re.match(patron, nombre):
        print(VERDE + f" Nombre válido: {nombre}" + COLORFINAL)
    else:
        print(ROJO + "Error: El formato no cumple con los requisitos minimos." + COLORFINAL)

# menu principal
def menu():
    while True:
        print("\nSISTEMA DE GESTIÓN DE PRODUCTOS")
        print("1. Buscar producto por ID")
        print("2. Comparar stock")
        print("3. Validar nombre de nuevo producto")
        print("4. Salir")

        opcion = input("Selecciona una opción: ")

        # Control de error
        if opcion == "1":
            buscarPorID()
        elif opcion == "2":
            comparar_stock()
        elif opcion == "3":
            validarNombreProd()
        elif opcion == "4":
            print("Saliendo del programa")
            break
        else:
            print(ROJO + "Error: Opción inválida." + COLORFINAL)

menu()