# Documentación

<p>
En este documento se presenta la investigación que se solicito y se dara a conocer a detalle cada parte. Lo que se solicito fue lo siguiente:
</p>

- Variables
- Constantes
- Opiconales
- Manejo de nulos

## Datos a conciderar

- El **compain object** es un objeto declarado dentro de una clase que permite definir miembros que pertenecerán a la clase y no a instancias de la misma.

- El signo **"?"** se usa para indicar que una variable o tipo puede contener un valor nulo. Esto convierte el tipo en un tipo nullable.

- El signo **"$"** se utiliza para la interpolación de cadenas de texto, una característica que permite insertar variables y expresiones directamente dentro de una cadena de texto para poder imprimirla.

- La sintaxix **${constant.PI}** es una interpolación de cadena que permite insertar el valor de una propiedad o función dentro de una cadena de texto.

- Se utilizo funciones para poder completar el codigo, es por esto que no se coloca en lo que fue solicita, aún así se explicara.


## Variables
<p>
Actúa como un contenedor simbólico para almacenar y manipular información donde se puede almacenar un valor. Una variable tiene un nombre único y puede contener diferentes tipos de datos, como números, texto o estructuras más complejas, este valor puede cambiar durante la ejecución del programa, de ahí el término variable. 

Los tipos de variables son:
</p>

- **Enteros (Integer):** Representan números enteros, positivos o negativos, sin decimales. 

- Flotantes (Floating Point): Representan números con decimales.

- Cadenas de caracteres (String): Representan texto o secuencias de caracteres. 

- Booleanos: Representan valores lógicos verdadero o falso.

- Arreglos (Arrays): Colecciones de variables del mismo tipo almacenadas en secuencia.

- Objetos: Instancias de clases que pueden contener múltiples variables y métodos.

- Punteros (Pointers): Variables que almacenan direcciones de memoria de otros objetos 	o variables.

### Ejemplo

	( Variable 1)
	var age: Int? = 15

	( Variable 2)
	 val count: Int = 10
	 
	 ( Variable 3)
	 var name: String = "Camilo"


### Explicación del codigo 
<p>
Como se han mencionado anteriormente hay varios tipos de variables. En el codigo se a implementado los tipos **String** e **Int**. Se utilizan las palabras reservadas `VAL`( es decir nunca cambia ) y `VAR` ( puede cambiar ) para poder crear las variables que se encuentran en el codigo. 
</p>

## Constantes

<P>
Las constantes solo pueden ser miembros de nivel superior o miembros de un companion object. Esto quiere decir que no deben ser locales ni estar en clases normales. Esto se debe a que las constantes const se resuelven en tiempo de compilación y su valor se reemplaza directamente en el lugar donde se usa, en lugar de acceder a través de una referencia.
</P>

### Ejemplo
	class constant {
    	companion object {
        	const val PI = 3.14159
	 }
	}

### Explicación del codigo 
<p>
 Se creo la clasellamada **constant** dentro de esta se encuentra un** companion object** , esto quiere decir que se crea un objeto y en este va estar la constante; cuando esta se vaya a utilizar se llama por fuera de la clase y la constante que se trabaja es `PI `
</p>

## Opcionales
<p>
Se refieren a la capacidad de una variable de almacenar un valor nulo (null). Esto es especialmente útil para prevenir errores de referencia nula (también conocidos como "NullPointerExceptions"). 

Se manejan principalmente a través del uso de tipos que pueden contener un valor nulo. A continuación se presentan 3 tipos que son principales:
</p>

- Tipos de Datos con Valor Nullable (?): Son los tipos de datos normales no pueden contener valores nulos, a menos que se especifique explícitamente. Para permitir que una variable pueda ser nula, se añade un signo de interrogación (?) al final del tipo de dato.
- Operador de llamada segura (?.) : Permite llamar a propiedades o métodos de un tipo nullable solo si no es nulo.

- Operador Elvis (?:) : Proporciona un valor predeterminado en caso de que una expresión nullable resulte ser nula.

### Ejemplo
	var age: Int? = 15

### Explicación del codigo
<p>La variable `age` ha sido declarada como un entero opcional , es decir que esta definida para que puede contener valores enteros **(Int)** o ser **nula** .  El tipo de dato `Int?` con el signo de interrogación** (?) ** indica esta capacidad de aceptar null. Se inicializa con el valor 15. 
</p>

## Manejo de nulos
<p>Se refieren a las diversas técnicas y herramientas que proporciona el lenguaje para trabajar de manera segura con valores que pueden ser nulos. Estas herramientas están diseñadas para prevenir errores comunes relacionados con los valores nulos, como el famoso NullPointerException 
</p>

### Ejemplo
	var age: Int? = 15
	if (age != null) {
        println("El valor de edad es $age")
    } else {
        println("El valor de edad es null")
    }

### Explicación del codigo
<p>Se trabaja con el condicional IF para realizar el manejo del nulo que se tiene en el codigo. En este IF se realizara la verificacion de que la variable es nula o no, esto mostrando los siguientes mensjaes:
</p>

- Si no es nulo `age`, imprimir : "El valor de edad es $age"
- Si es nulo, imprimir: "El valor de edad es null"

## Funciones

<p> Es un bloque de código diseñado para realizar una tarea específica. Sirve para organizar el código de manera modular y reutilizable, lo que promueve la claridad y la eficiencia en el desarrollo de software.
</p>

### Ejemplo
	Ejemplo 1:
	fun saludar(name: String, greeting: String = "Hola") {
    	println("$greeting $name")
	}
	
	Ejemplos 2: 
	fun main() {
    val count: Int = 10
    println("El valor guardado en la variable count = $count.")

    var name: String = "Camilo"
    name = "Dooshik"
    println("El nombre guardado en la variable name es = $name")

    if (age != null) {
        println("El valor de edad es $age")
    } else {
        println("El valor de edad es null")
    }

    saludar("Eric")
    saludar("Juliana", "Hi")
    saludar("Yeison")
    saludar("Jake", "Que tal")

    println("El valor de PI es: ${constant.PI}")
    
	}

### Explicación del codigo
<p>Se trabajan 2 funciones, las cuales son **saludar** y **main**</p>

- En la funcion **main**  se ejecuta todo el programa. En este se coloca:

1.  `val` count y su print correspondiente.

2.  `var` name : Muestra que tipo de dato es y que datos se ingresa. Aparte, se ingresa otro dato a la misma variable y se va a mostrar el ultimo dato que se ingrese a esta.

3. Se muestra el manejo de nulos con el condicional **IF**.

4. Para la funcion **saludar** se ingresan los datos *name y greeting*. Si solo se ingresa un dato en la variable *name* y no en la *greeting* , por defecto mostrarar el dato que se coloco en el parametro de este, es decir **"Hola"**; pero si se ingresa tanto* name* y *greeting* se imprimira el greeting que se ingreso más no el que esta por defecto.

5. Se imprimira la constante que se coloco , osea `PI`. Esta sintaxis ${constant.PI} quiere decir que esta llamando la constante que esta dentro de la clase ** constant**

-  En la funcion **saludar**  se encuentran dos parametros de tipo String, los cuales son `name` y `greeting`. El parametro de "greeting" viene con un dato por defecto , el cual es *"Hola"*, en cambio el otro parametro "name" solo tiene el tipo de dato. Dentro de esta funcion se imprimira el "greeting" y  el "name" que se inserten en la funcion main














