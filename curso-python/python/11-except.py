
#Manejo de excepciones
try:   
    num = int(input("Ingrese un número: "))
    divisor = int(input("Ingrese un divisor: "))
    resultado = num / divisor
    print("El resultado de la división es:", resultado)
#Solo debe ingresar numeros enteros
except ValueError:
    print("Error: Debe ingresar un número válido.")
#No debe ingresar 0
except ZeroDivisionError:
    print("Error: El divisor no puede ser cero.")