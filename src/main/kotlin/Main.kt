fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    println("Hello, Kotlin!")

    val mainInstance = Main("Classe Teste")

    println(mainInstance.nome)
}

class Main(var nome : String) {


}