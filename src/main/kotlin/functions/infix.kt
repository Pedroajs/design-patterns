package functions


data class Produto(val name: String, val preco: Double)

infix fun Produto.maiorQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(){
    val p1 = Produto("ipad", 1399.00)
    val p2 = Produto("iphone", 1099.00)

    println(p1 maiorQue p2)

}