fun main(parametro: Array<String>) {
    val caracteres = Array(10, {' '})
    for(i in caracteres.indices){
        print("Ingrese un caracter: ")
        caracteres[i] = readLine()!![0]
    }
    for(n in caracteres.size - 1 downTo 0){
        print(caracteres[n])
    }
}
