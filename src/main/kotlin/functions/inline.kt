package functions

//sempre que usar uma funcao inline é preciso passar uma funcao como param
inline fun transaction(funcao:()->Unit){
    println("iniciando transacao...")
    try {
        funcao()
    } finally {
        println("encerrando transacao")
    }
}

fun main() {
    transaction {
        println("executando query 1")
        println("executando query 2")
        println("executando query 3")
    }
}