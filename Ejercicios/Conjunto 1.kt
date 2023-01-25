fun main(args: Array<String>) {
    var bonoLoto = mutableSetOf<Int>()
    var contador = 0
    do {
        println("Introduzca un número: ")
        var numero = readln().toInt()
        if (bonoLoto.contains(numero)){
            println("Este número ya está en la lista.")
        }else{
            bonoLoto.add(numero)
            contador++
        }

    }while(contador <= 5)
    for (n in bonoLoto){
        println(n)
    }
}