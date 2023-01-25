/**
 *
 */
fun menu(lista: MutableList<Char>){
    do{
        println("Elija las siguientes opciones:\n1.Mostrar lista.\n2.Insertar caracter de posición.\n3.Actualizar un caracter.\n4.Borrar un caracter por posición.\n5.Borrar caracter por valor.\n6.Modificar todas las ocurrencias por otro.\n7.Salir.")
        var eleccion = readln().toInt()
        when (eleccion){
            1 -> mostrar(lista)
            2 -> insertar(lista)
            3 -> modificar(lista)
            4 -> borrarPosicion(lista)
            5 -> borrarValor(lista)
            6 -> modificarTodo(lista)
            7 -> break
        }
    }while(eleccion in 1..6)
}
fun mostrar(lista: MutableList<Char>){
    for (i in lista){
        println(i)
    }
}

fun insertar(lista: MutableList<Char>){
    println("Inserte la posición: ")
    var posicion = readln().toInt()
    println("Inserte un caracter: ")
    var caracter = readLine()!![0]
    lista.add(posicion, caracter)
    for ((indices, valor) in lista.withIndex()){
        println("Posición $indices: $valor")
    }
}

fun modificar(lista: MutableList<Char>){
    println("Inserte la posición: ")
    var posicion = readln().toInt()
    println("Inserte un caracter: ")
    var caracter = readLine()!![0]
    lista[posicion] = caracter
    for ((indices, valor) in lista.withIndex()){
        println("Posición $indices: $valor")
    }
}

fun borrarPosicion(lista: MutableList<Char>){
    println("Inserte la posición: ")
    var posicion = readln().toInt()
    lista.removeAt(posicion)
    for ((indices, valor) in lista.withIndex()){
        println("Posición $indices: $valor")
    }
}
fun borrarValor(lista: MutableList<Char>) {
    println("Inserte el valor a borrar: ")
    var valor = readLine()!![0]
    lista.remove(valor)
    for ((indices, valor) in lista.withIndex()) {
        println("Posición $indices: $valor")
    }
}
fun modificarTodo(lista: MutableList<Char>) {
    println("Inserte el caracter a cambiar: ")
    var carac = readLine()!![0]
    println("Inserte el nuevo caracter: ")
    var caracter = readLine()!![0]
    for(i in lista.indices){
        if (carac == lista[i]){
            lista[i] = caracter
        }
    }
    for ((indices, valor) in lista.withIndex()) {
        println("Posición $indices: $valor")
    }
}
fun main(args: Array<String>) {
    var lista = mutableListOf<Char>('a','b','a','d','e')
    menu(lista)
}