fun main(parametro: Array<String>) {
    var numeros = IntArray(3)
    try{
        for(i in numeros.indices){
            while (true){
                print("Ingrese un número: ")
                var numero = readln().toInt()
                print("Elija la posición deseada: ")
                var posicion = readln().toInt()
                if(numero > 0 && numeros[posicion] == 0){
                    numeros[posicion] = numero
                    break
                }
                else println("Error. Inténtelo de nuevo.")

            }
        }
        for(n in numeros){
            println(n)}
    }
    catch(e: Exception){
        print("Error. Posición errónea")

    }
}