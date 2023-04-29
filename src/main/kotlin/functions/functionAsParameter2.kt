package functions

fun <E> filtrar(lista: List<E>, filtro:(E)-> Boolean):List<E>{
    val listaFiltrada = ArrayList<E>()
    for (e in lista){
        if(filtro(e)) listaFiltrada.add(e)
    }
    return listaFiltrada
}

fun comTresLetras(nome: String)= nome.length == 3
fun main() {
    val lista = listOf("Ana", "Pedro", "Bia")
    println(filtrar(lista, ::comTresLetras))
}