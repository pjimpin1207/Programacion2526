alumnos = ["Pablo", "David", "Alvaro", "Adrian"]

print("Lista inicial de alumnos:", alumnos)

# Pedir un nuevo alumno
nuevo_alumno = input("Introduce un nuevo alumno: ")

# Insertar el nuevo alumno entre el segundo y el tercero
alumnos.insert(2, nuevo_alumno)

# Mostrar el resultado
print("Lista final de alumnos:", alumnos)
