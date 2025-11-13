# Ejercicio 14 - Gestión de Inventario

# Inventario inicial
inventario = ["Manzanas", "Plátanos", "Naranjas", "Peras"]
print("Inventario inicial:", inventario)

# Adición con append() cuando llega la merrcancia
inventario.append("Uvas")
inventario.append("Kiwi")

# Unirlos con el extend()
melones = ["Melones"]
inventario.extend(melones)

# Insertar "Platanos frescos" en el sitio 1
inventario.insert(1, "Plátanos Frescos")
print("Tras introducir platanos frescos en la posicion 1:", inventario)

# Extraer el último producto con el pop
producto_vendido = inventario.pop(-1)
print("Producto vendido:", producto_vendido)

# Eliminar las peraas con el remove
inventario.remove("Peras")
print("Eliminar las peras:", inventario)

# Reporte de emergencia con slice
reporte_urgente = inventario[:4]
print("Reporte urgente:", reporte_urgente)

# Recorrido final con for
print("\nReporte Urgente:")
for i in range(len(reporte_urgente)):
    print("Índice", i, ":", reporte_urgente[i])