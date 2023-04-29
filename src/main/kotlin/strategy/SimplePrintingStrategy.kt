package strategy

class SimplePrintingStrategy : PrintingStrategy {
    override fun execute(text: String) {
        println("Using simple strategy to print: $text")
    }
}