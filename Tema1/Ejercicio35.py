# Programa: Login con validación de contraseña

usuario = input("Introduce tu nombre de usuario: ")
contraseña = input("Introduce tu contraseña: ")

if len(contraseña) < 8:
    print("Error: la contraseña debe tener al menos 8 caracteres.")
else:
    print("Login correcto. ¡Bienvenido,", usuario + "!")
