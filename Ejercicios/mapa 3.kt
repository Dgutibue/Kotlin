fun main(args: Array<String>) {
    var empleado = sortedMapOf<Int, String>()
    var empleado1 = linkedMapOf<Int, String>()
    for (i in 1..5){
        println("Escribe el DNI: ")
        var dni = readln().toInt()
        println("Escribe el nombre: ")
        var nombre = readln()
        empleado[dni] = nombre
        empleado1[dni] = nombre
    }
    println(empleado)
    println(empleado1)
}