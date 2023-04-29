import factoryPattern.Animal
import factoryPattern.AnimalFactory
import factoryPattern.TipoAnimalEnum
import strategy.ComplexPrintingStrategy
import strategy.Printer
import strategy.SimplePrintingStrategy

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
//
//    val meuAnimal: Animal? = AnimalFactory.criarAnimal(TipoAnimalEnum.GATO)
//    meuAnimal?.emitirSom()

    val printer = Printer()
    for(i in 0..10){
        if(i % 2 == 0) printer.printingStrategy = SimplePrintingStrategy()
        else printer.printingStrategy = ComplexPrintingStrategy()
        printer.print(i.toString())
    }
}