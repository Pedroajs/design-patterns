package strategy

class ComplexPrintingStrategy : PrintingStrategy {
    override fun execute(text: String) {
        println("Using complex strategy to print: $text")
    }
}