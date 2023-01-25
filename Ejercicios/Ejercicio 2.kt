fun main(args: Array<String>) {
    var numeros = IntArray(5)
    for (i in numeros.indices){
        numeros[i] = (0..90).random()
    }
    println("El array completo es: ")
    for (n in numeros.indices){
        print("${numeros[n]}, ")
    }
    println()
    val mayor = numeros.max()
    val menor = numeros.min()
    print("El número mayor es: $mayor")
    println()
    print("El número menor es: $menor")
}