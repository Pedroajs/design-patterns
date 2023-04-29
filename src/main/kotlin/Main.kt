import factoryPattern.Animal
import factoryPattern.AnimalFactory
import factoryPattern.TipoAnimalEnum

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val meuAnimal: Animal? = AnimalFactory.criarAnimal(TipoAnimalEnum.GATO)
    meuAnimal?.emitirSom()
}