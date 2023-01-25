fun main(args: Array<String>) {
    var contador = 0
    var negativos = IntArray(10)
    do{
        println("Introduzca un número negativo: ")
        var numero = readln().toInt()
        if (numero > 0){
            println("Número no permitido.")
        }else{
            negativos[contador] = numero
            contador += 1
        }
        when {
            contador == 10 -> break
        }
    } while(true)
    println(negativos.contentToString())
}