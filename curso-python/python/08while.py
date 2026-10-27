i=0
#While contador del 1 al 5
while i < 5:
    print(i)
    i += 1

#Dias de la semana:
while i < 7:
    if i == 0:
        print("Dia de la semana: Lunes")
    elif i == 1:
        print("Dia de la semana: Martes")
    elif i == 2:
        print("Dia de la semana: Miercoles")
    elif i == 3:
        print("Dia de la semana: Jueves")
    elif i == 4:
        print("Dia de la semana: Viernes")
    elif i == 5:
        print("Dia de la semana: Sabado")
    elif i == 6:
        print("Dia de la semana: Domingo")
    i += 1

    contador = 1
while contador <= 15:
    print("Contando de 1 - 15 --> " , contador)
    if contador == 10:
        print("*** ENCONTRAMOS EL NUMERO 10 ***")
        break
    contador += 1