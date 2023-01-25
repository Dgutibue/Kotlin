fun main(args: Array<String>) {
    val nombres = listOf<String>("Alfonso", "Manolo", "Clara", "Rita", "Sergio")
    for (i in nombres){
        println(i)
    }
    for((indice, valor) in nombres.withIndex()){
        println("$indice , $valor")
    }
}