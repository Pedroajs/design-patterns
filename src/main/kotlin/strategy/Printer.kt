package strategy

class Printer {
    lateinit var printingStrategy : PrintingStrategy

    fun print(text: String){
        return println(text)
    }
}