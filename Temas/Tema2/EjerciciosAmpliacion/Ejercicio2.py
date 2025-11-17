# Ejercicio 2 Metodos de adicion e insercion

tareasPendientes=["Compar leche", "llamar al medico"]

# Agregar tareea "Estudiar python" al final con append
tareasPendientes.append("Estudir python")

# Agregar tarea al principio con insert
tareasPendientes.insert(0, "Revisar el email")

#Agregar las subtareas al final con el extend
tareasPendientes.extend(["Pagar factura", "Enviar informe"])

# mostrar la lista final
print("La lista final es: ", tareasPendientes)