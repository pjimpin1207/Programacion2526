# Ejercicio 17
# Necesitas imprimir un informe rápido de todas las tareas ordenadas alfabéticamente,
# pero sin que las mayúsculas afecten el orden (es decir, "comprar café" debe ir antes
# que "Llamar al cliente").
# tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café",
# "Actualizar reporte", "Planificar reunión"]


tareasDia = ["Revosar email", "llamar cliente", "comprar cafe", "actualizar reporte", "planificar reunion"]

# crear lista ordenada alfabeticamente sin distinguir mayusculas y minusculas
informeOrdenado= sorted(tareasDia, key=str.lower)

#imprimir lista ordeada temporal
print("Informe ordenado alfabeticament sin distinguir mayusculas:")
print (informeOrdenado)

# imprimir lista original
print ("lista original:")
print (tareasDia)