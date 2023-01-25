fun main(parametro: Array<String>) {
    val vector = IntArray(10)
    for(i in vector.indices){
        vector[i] = (0..100).random()
    }
    var par = ""
    var impar = ""
    for(n in vector){
        if(n%2 == 0){
            par += n.toString() + " "

        }else{
            impar += n.toString() + " "
        }

    }
    println("Números pares: $par\nNúmeros impares: $impar")
}
