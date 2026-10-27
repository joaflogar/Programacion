#DICCIONARIO DE MIS DATOS
listaDatos = {
    "nombre": "Joaquin",
    "edad": 18,
    "ocupacion": "Ingeniero de software"
}
#Mostrar los datos del diccionario
print(listaDatos["nombre"])
print(listaDatos["edad"])
print(listaDatos["ocupacion"])



print(f"{'Producto':<12}{'Cant.':>6}{'Precio':>10}{'Subtotal':>12}")
print("-" * 40)
productos = [("Arroz", 5, 3.5), ("Aceite", 2, 9.9), ("Leche", 12, 4.25)]
total = 0
for nombre, cant, precio in productos:
    sub = cant * precio
    total = total + sub
#SALIDA DEL PROGRAMA
print(f"{nombre:<12}{cant:>6}{precio:>10.2f}{sub:>12,.2f}")
print("-" * 40)
print(f"{'TOTAL':<28}{total:>12,.2f}")