fun menu(productos: MutableMap<String, Float>){
    println("****************")
    println("Menú de opciones")
    println("****************")
    println()
    do{
        println("Elija las siguientes opciones:\n1.Mostrar lista.\n2.Crear nueva lista.\n3.Actualizar lista.\n4.Borrar.\n5.Salir.")
        var eleccion = readln().toInt()
        when (eleccion){
            1 -> mostrar(productos)
            2 -> crear(productos)
            3 -> modificar(productos)
            4 -> borrar(productos)
            5 -> {
                println()
                println("¿Desea realizar una compra?")
                var eleccion = readln()
                if ( eleccion.uppercase() == "S"){
                    compraProducto(productos)
                }else{
                    break
                }
            }

        }
    }while(eleccion in 1..4)
}
fun mostrar(productos: MutableMap<String, Float>) {
    println()
    println("*****************")
    println("Lista de almacén.")
    println("*****************")
    for ((clave, valor) in productos) {
        println("$clave : $valor€")
    }
    println()
}
fun crear(productos: MutableMap<String, Float>){
    for (i in 1..4){
        println("Ingrese el producto: ")
        var producto = readln()
        println("Ingrese el precio: ")
        var precio = readln().toFloat()
        productos[producto] = precio
    }
    mostrar(productos)
}
fun modificar(productos: MutableMap<String, Float>){
    println("Ingrese el producto: ")
    var producto = readln()
    if (producto !in productos){
        println("El producto no se encuentra en la lista.")
    }else{
        println("Ingrese el precio nuevo.")
        var precio = readln().toFloat()
        productos[producto] = precio
    }
    mostrar(productos)
}
fun borrar(productos: MutableMap<String, Float>){
    println("Ingrese el producto: ")
    var producto = readln()
    productos.remove(producto)
    mostrar(productos)
}
fun compraProducto(productos: MutableMap<String, Float>) {
    var compra = mutableMapOf<String, Float>()
    var contador = 0
    var suma = 0.0
    do {
        println("Elije un producto de la lista: ")
        for ((clave, valor) in productos) {
            println("$clave : $valor€")
        }
        var producto = readln()
        while (producto !in productos){
            println("No disponemos de este producto")
        }
        if (producto in productos){
            println("¿Qué cantidad desea comprar?")
            var cantidad = readln().toInt()
            for ((clave, valor) in productos){
                if (producto == clave){
                    compra[clave] = valor * cantidad
                }
            }

        }
        contador++
    } while(contador < 3)
    println()
    println("Le mostramos su compra: ")
    for ((clave,valor) in compra){
        suma += valor
        println("$clave = $valor€")
    }
    println()
    println("Total de la compra realizada: $suma€")
}
fun main(args: Array<String>) {
    var productos = mutableMapOf<String, Float>()
    menu(productos)
}