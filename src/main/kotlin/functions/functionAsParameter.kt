package functions

class Operations {
    fun somar(a: Int, b: Int) = a + b
}

fun somar(a: Int, b: Int) = a + b

fun calc(a: Int, b: Int, function: (Int, Int)-> Int) = function(a, b)

fun main() {
    println(calc(1, 1, Operations()::somar))
    println(calc(2, 2, ::somar))
}