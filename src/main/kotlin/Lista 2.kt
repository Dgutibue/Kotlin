fun main(args: Array<String>) {
    var bonoLoto = mutableListOf<Int>()
    var contador = 0
    do{
        println("Escriba un número: ")
        var numero = readln().toInt()
        if (numero in bonoLoto){
            println("El número ya está en la lista.")
        }else{
            bonoLoto.add(numero)
            contador++
        }
        when {
            contador == 5 -> break
        }
    }while (true)
    for ((indice, valor) in bonoLoto.withIndex()){
        println("Posición $indice: $valor")
    }
}