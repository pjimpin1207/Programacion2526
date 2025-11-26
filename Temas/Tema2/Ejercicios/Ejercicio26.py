producto = "Espresso Doble"
precio_unitario = 3.50

cantidad = 3
tasa_iva = 0.16

cliente_nombre = "Ana María López"
id_transaccion = "CAF-2025-472"


subtotal = precio_unitario * cantidad
iva = subtotal * tasa_iva
total = subtotal + iva


print("\nRECIBO DE COMPRA")

print(f"Cliente: {cliente_nombre}")
print(f"ID Transacción: {id_transaccion}")

print("\nDetalles del Producto")
print(f"Producto: {producto}")
print(f"Precio unitario: ${precio_unitario:.2f}")
print(f"Cantidad: {cantidad}")
print(f"Subtotal: ${subtotal:.2f}")
print(f"IVA (16%): ${iva:.2f}")
print("-----------------------------")
print(f"TOTAL A PAGAR: ${total:.2f}")