fun inicio(){
    val mensaje = "Bienvenido a la aplicación."
    for(i in mensaje.indices){
        print("*")
    }
    println()
    print(mensaje)
    println()
    for(i in mensaje.indices){
        print("*")
    }
    var vector = cargar()
    menu(vector)
}
fun menu(vector: IntArray){
    println()
    println("****************")
    println("Menú de opciones")
    println("****************")
    println()
    println()
    println("Elija la opción deseada:\n1.Mostrar el vector\n2.Mostrar el vector en orden inverso\n3.Buscar el número menor\n4.Buscar el número mayor\n5.Comprobar si existe un número en el vector\n6.Cambiar el valor almacenado en una posición\n7.Sustituir todas las apariciones de un número por otro\n8.Intercambiar los valores de 2 posiciones\n9.Ordenar el vector de menor a mayor\n0.Salir")
    var eleccion = readln().toInt()
    when(eleccion){
        1 -> mostrarVector(vector)
        2 -> mostrarVectorReves(vector)
        3 -> menor(vector)
        4 -> mayor(vector)
        5 -> comprobar(vector)
        6 -> cambiar(vector)
        7 -> modificar(vector)
        8 -> intercambio(vector)
        9 -> ordenar(vector)
        0 -> despedida()
        else -> if (eleccion >= 10 || eleccion < 0){
            println("Error. Ingrese un número que esté en el menú.")
            menu(vector)
        }

    }
}
fun mostrarVector(vector: IntArray){
    for(i in vector.indices){
        println("El ${i + 1}º número es: ${vector[i]}")
    }
    menu(vector)
}

fun mostrarVector2(vector: IntArray){
    for(i in vector.indices){
        println("El ${i + 1}º número es: ${vector[i]}")
    }
}

fun mostrarVectorReves(vector: IntArray){
    for(i in vector.size -1 downTo 0){
        println("El ${i + 1}º número es: ${vector[i]}")
    }
    menu(vector)
}

fun cargar():IntArray{
    var vector = IntArray(50)
    for(i in vector.indices){
        vector[i] = (0..100).random()
    }
    return vector
}

fun mayor(vector: IntArray){
    var mayor = vector.max()
    for(i in vector.indices) {
        if (vector[i] == mayor) {
            println("El número menor es: $mayor, estando en la posición ${i + 1}")
        }
    }
    menu(vector)
}

fun menor(vector: IntArray){
    var menor = vector.min()
    for(i in vector.indices){
        if (vector[i] == menor){
            println("El número menor es: $menor, estando en la posición ${i + 1}")
        }
    }
    menu(vector)
}

fun comprobar(vector: IntArray){
    print("Ingrese el número a comprobar: ")
    val numero = readln().toInt()
    for(i in vector.indices){
        if (vector[i] == numero) println("El número $numero está en la posición $i")
    }
    if (numero !in vector) println("El número $numero no está en la lista.")
    menu(vector)
}
fun cambiar(vector: IntArray){
    println("Introduzca el número e indique en qué posición:\nNúmero: ")
    val numero = readln().toInt()
    print("Posición: ")
    val posicion = readln().toInt()
    println("La posición antes de ser modificada: ${vector[posicion]}")
    vector[posicion] = numero
    println("La posición modificada es: ${vector[posicion]}")
    menu(vector)
}
fun modificar(vector: IntArray){
    println("Ingrese el número que desea modificar: ")
    val numero = readln().toInt()
    println("Ingrese el número que desea introducir")
    val numero2 = readln().toInt()
    for(i in vector.indices){
        if (numero == vector[i]){
            vector[i] = numero2
            println("Se ha cambiado en la posición $i por el número ${vector[i]}")
        }

    }
    mostrarVector2(vector)
    menu(vector)
}
fun intercambio(vector: IntArray){
    mostrarVector2(vector)
    do{
        print("Indique los números a cambiar y sus posiciones:\nNúmero1: ")
        val numero1 = readln().toInt()
        print("Posición1: ")
        val posicion1 = readln().toInt()
        print("Número2: ")
        val numero2 = readln().toInt()
        print("Posición2: ")
        val posicion2 = readln().toInt()
        val nIntercambio = numero2
        if(numero1 != vector[posicion1] || numero2 != vector[posicion2]){
            println("El número no coincide con la posición indicada.")
        }else{
            vector[posicion2] = numero1
            vector[posicion1] = nIntercambio
            mostrarVector2(vector)
            break
        }
    }while(true)
    menu(vector)
}
fun ordenar(vector: IntArray){
    val orden = vector.sorted()
    for(i in orden){
        print("$i, ")
    }
    menu(vector)
}
fun main(parametro: Array<String>) {
    inicio()
}

fun despedida(){
    val mensaje = "Muchas gracias por utilizar la aplicación."
    for(i in mensaje.indices){
        print("*")
    }
    println()
    print(mensaje)
    println()
    for(i in mensaje.indices){
        print("*")
    }
}