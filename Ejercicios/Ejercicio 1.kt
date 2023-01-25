fun main(args: Array<String>) {
    println("¿Cuántos números desea ingresar?")
    val cantidad = readln().toInt()
    var numeros = IntArray(cantidad)
    for (i in numeros.indices){
        println("Introduzca un número: ")
        numeros[i] = readln().toInt()
    }
    for (n in numeros){
        print("$n, ")
    }
}