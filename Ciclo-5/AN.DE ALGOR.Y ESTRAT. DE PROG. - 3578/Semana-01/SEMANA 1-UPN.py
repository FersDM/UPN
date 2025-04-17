#Tipos de datos y Operadores
#Operacion 1
from pprint import pprint
from time import perf_counter

print(1 + 1)
print(8 - 1)
print( 4* 5)
print(10/5)
print(12/3)

print()
# ----------------------------------------------
#Division
print(11/4)
print(10.0/4.0)

print()
# ----------------------------------------------
#Divicion con redondeo
print (5 // 3)
print(5.0 // 3.0)
print(-5 // 3)
print(-5.0 //3.0)

print()
# ----------------------------------------------
#Operacion 2
print(7 % 3)#Residuo
print(3**2)#Exponente

print()
# ----------------------------------------------
#Jerarquias de signos
print((1+3)*2)

# ----------------------------------------------

print()
#Valores Lógicos (Boolean)
print(True and False) #V y F = F
print(True or False) #V o F = V


print(False == 0) # 0 es False
print(True == 1) # 1 es True
# ----------------------------------------------

print()
#Negacion
print(not True)
print(not False)

# ----------------------------------------------

print()
#Operaciones en cadena
print("Esto es una cadena en mi primera semana")

#Operaciones concadena
print("Amo a Python")
print('Amo ' 'a Python')
print("Python " * 3)


#indexacion posicion del caracter en una cadena
print("Me gusta Python"[0])

#len devuelve la cantidad de caracteres en una cadena
print(len("Me gusta Python"))
# ----------------------------------------------

print()
#Forma de salida de los datos parte II
#Variable
x = "Manzana"
y = "Limon"
#formato : representa la manera de operar con cadenas para ejercer
#una mejor presentación y gestion de los datos
#s significa string(cadena)
z = "me gustan las frutas como son %s y %s" %(x,y)
print(z)
print()
#Forma de salida de los datos parte II
print("{} y {}".format("Manzana", "Limon"))
print("{1} y {0}".format("Manzana", "Limon")) #Orden cambia con {n°}
print("{x} y {y}".format(x="Manzana",y="Limon"))

print()
#
a = 17
print(a)
# ----------------------------------------------

#visualizando el tipo de dato de la varariable
a = True
print(type(a))
# ----------------------------------------------

#Nota Python es sencitivo es decir distinge las mayusculas de las minusculas
B = 18
print(type(B))

igv = 0.18
print(type(igv))
# ----------------------------------------------

print()
e = 10
e = e + 5 # Contador (Incremento) 1
print(e)
# ----------------------------------------------

print()
e = 10
e += 5 # Contador (Incremento) 2
print(e)

# ----------------------------------------------

print()
a = "Amo"
b = "Python"
c = a + " " + b
print(c)
print(c[-2:])
print(c[-3:-1])
print(c[0:5:2])# desde la posicion 0 hasta la posicion 5 - 1, avanzando de 2 en 2
print(c[0:3]) # desde la posicion 0 hasta la posicion 3 - 1
print(c[4:]) # mostrando solo la palabra python de la variable c
print(c[0:])

# ----------------------------------------------

print()
#Estructuras de control
#1. Condicionales
#2. Repetitivas
#3. Control
#Nota en el uso de las condicionales
#1- Simples | Dobles | Multiples

# ----------------------------------------------


#Condicional simple
# print("Ingrese un numero entero: ")
# a = int(input("Ingrese un numero entero: "))
# if(a%2) == 0:
#     print("El número ingresado es: ",a)
#     print("El número es PAR!")
# else: print("El número es IMPAR!!")
# print("Programa Finalizado")
# print()
# #Forma compacta de una condicional
# print("Es Par" if int(input("Ingrese numero entero: "))%2==0 else "Es Impar")
#       #Valor si condicion verdadera if condicion else valor si condicion falsa


# ----------------------------------------------


# b = "18"
# # print(b)
# print(type(b))
#
# print()
# #Condicional Multiple
# print()
# n = int(input("Ingrese numero entero: "))
# if(n%2)==0:
#     if(n>0) and (n<10):
#         print(n ** 2)
#     elif(n >= 10):
#         print(n*2)
#     else:
#      print("Fuera del rango")
# else:
#     if (n>0):
#         print(n**0.5)
#     else:
#         print("Fuera del rango")


# ----------------------------------------------
#Repetitivas

#For
#Sintaxis
#For<nombre de la varialbe> in <secuencia>
#factorial
# from re import I
# n = int(input("Ingrese un numero: "))
# f = 1
# for i in range(2, n + 1):
#     f*=i
#     print(f)
# print("El factorial de {} es {}".format(n,f))
#
#
# for n in range(10,15,2): #es el valor de inicio, 15 es el valor final, es el salto
#     print(n)

#----------------------------------------------


#crear un bucle que permita mostrar:

# p = input("Ingresa la palabra: ")
# n = len(p)
# for i in range(n):
#     for j in range (i,n):
#         print(p[j], end="")
#     print("")

# ----------------------------------------------
#While
#Sintaxis
#while <condicion booleana>:
#<codigo>

# s = 0
# while True:
#     n = input("Ingrese valor a sumar o cadena vacia para terminar: ")
#     if(len(n)==0):
#         break #break es una manera de salir del bucle arbitrariamente
#     v = float(n)
#     s += v
# print("La suma de los valores ingresados es: ",s)
#

# ----------------------------------------------
#Funciones
#creacion de funciondes definidas por el usuario
# def potencia(base,exponente):
#     a = base ** exponente
#     return a
# #ejecutando la funcion potencia
# b = int(input("Agrega la base: "))
# e = int(input("Agrega el exponente: "))
# r = potencia(b,e)
# print("El resultado es ",r)
#
# def sumar(a,b,c=0,d=0,e=0):
#     return a+b+c+d+e
# print(sumar(7,5))
# print(sumar(7,5,10))
# print(sumar(7,5,10,20,10))
# #*args -> se encarga de recibir una cantidad de variables de parametros
#
# def sumar_terminos(*args):
#     s = 0
#     print("Se recibieron {} parametros: ".format(len(args)))
#     for v in args:
#         s+=v
#     return s
# print(sumar_terminos(7,6,8,9))


# *********************************************************************************
#TAREA
#Crear una funcion que permita recibir una lista de parametros variables
#con parametros inespecíficos, que sume solo los parametros que son positivos
#si_positivo = True
#ejemplo
#sumarNumerosPositivos(7,6,-3) -> debera salir 10
#sumarNumerosPositivos(7,6,-3,si_positivo=True) - debera salir 13
#PARA LA SIGUIENTE SEMANA
# *********************************************************************************


def formatear(**kwargs):
    #recibe los parametros titulo | base | exponente
    print("*" * 4, kwargs["titulo"], "*" * 4)
    print(kwargs["base"],"Elevado a una potencia", kwargs["exponente"],"es :")
    print(kwargs["base"] ** kwargs["exponente"])

formatear(titulo="Semana 1 - UPN", base=4, exponente=2)


























