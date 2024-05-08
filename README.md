# Caso-Final
### Valdés Esparza, Leonardo
### 05436592J
https://github.com/LValdes2003/Caso-Final

## Ejercicio 1

### En relación al estado de un objeto, para preservar el principio de encapsulación:
b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

### Los métodos de una clase no pueden devolver objetos:
b) Falso

###	¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?
b) Herencia

### 4)	El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
b) O(1)

### 5)	Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada: 
b)	Falso

## Ejercicio 2

### 2)	Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.
 - En una tabla Hash, cada valor tiene un "key" o una llave. En un árbol, cada nodo tiene dos "hijos" hasta llegar al final. Una tabla Hash requiere que se asignen las llaves a cada valor, pero es más eficiente. Un árbol es eficiente en grupos de datos que se repiten, por ejemplo en la compresión de texto.

### 3)	Explica las diferencias entre una pila y una cola. ¿ Cuándo conviene utilizar cada una de estas estructuras? ¿ Cuál es el orden de complejidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.
 - Como en la vida real, una pila y una cola son diferentes en sus métodos de meter y sacar objetos.
 - Una pila funciona con LIFO (Last in First out). El objeto que más recientemente entró es el primero a salir. Es como una pila de mantas. No se saca la manta debajo de todas primero.
 - Una cola funciona con FIFO (First in First out). El primer objeto a entrar es el primero a salir. Es como una cola para el banco. El primero a hacer cola es el primero a ser atendido.
 - Las dos estructuras tienen complejidad de O(1), porque siempre se sabe que valor es el primero o último a entrar.

### 4)	Explica el método de ordenación denominado inserción y describe las iteraciones sobre el siguiente conjunto de datos: 
### 50 20 84 13 22 16 89 85 
 - El método de inserción mira a cada valor, lo saca del conjunto y si es menor que el valor (o los valores) anterior, lo mete detrás de ese valor.
 - En el ejemplo de datos, primero saca el 20 y lo mete detrás del 50. luego saca el 13 y lo pone al principio detrás del 20. Luego el 22 se mueve detrás del 50, el 16 detrás del 20 y el 85 detrás del 89. Resultado: 13 16 20 22 50 84 85 89

### 5) Dadas dos funciones y su número de operaciones: 
### A	= 1024 n 
### B	= 16 n 3 
### Calcular a partir de qué tamaño de entrada n A es más eficiente que B. 
 - En n = 8, A y B son iguales. para n > 8, A es más eficiente.

## Ejercicio 3
<img width="292" alt="image" src="https://github.com/LValdes2003/Caso-Final/assets/145686477/ed32d7ee-22a0-4f47-8ad9-1cd70c5f5589">

### a)	¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programa como considere conveniente. Explique su solución de manera concisa. 
 - El código no compila porque la llamada con (1, -2) crea un bucle infinito.
 - El segundo entero no puede ser negativo, ya que se convierte en bucle infinito. Al principio del código agrego un if(b < 0) que tira una excepción para prevenir ese caso.

### b)	Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando. 
 - El código recibe dos enteros, y multiplica el primero por si mismo la cantidad de veces que indica el segundo.
 - Es recursividad directa de cola, donde el método llama a si mismo al final del método.

## Ejercicio 4 en Ejercicio4.java
### ¿Qué tipo de recursividad se está empleando? ¿Qué complejidad computacional tiene el algoritmo?
El tipo de recursividad es de cola, la complejidad de tiempo y espacio es O(log n) por cada dígito del número.

## Ejercicio 5 en UserAccount.java y Utils.java
