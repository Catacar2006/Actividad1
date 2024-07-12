//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class constant {
    companion object {
        const val PI = 3.14159
    }
}

var age: Int? = 55

fun saludar(name: String, greeting: String = "Hola") {
    println("$greeting $name")
}

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