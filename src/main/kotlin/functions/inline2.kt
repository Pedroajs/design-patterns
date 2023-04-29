package functions

//sempre que usar uma funcao inline é preciso passar uma funcao como param
inline fun <T> executarComLog(nomeDaFuncao: String, funcao:()-> T): T {
    println("Entrando no método $nomeDaFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeDaFuncao finalizado")
    }
}

fun somar2(a: Int, b: Int) = a + b

fun main() {
    val resultad = executarComLog("somar"){
        somar2(3, 4)
    }

    println(resultad)
}