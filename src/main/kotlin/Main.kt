fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    println("Hello, Kotlin!")

    val mainInstance = Main("Classe Teste")

    println(mainInstance.nome)

    println(mainInstance.integerLongNumber())

    println("Exemplo Carácter ${mainInstance.caracterExemplo}")

    println(mainInstance.stringExemplo)
}

class Main(var nome : String) {

    val caracterExemplo = 'T'

    val stringExemplo = "String de Exemplo"

    /**
     * Forma de Simplificar e melhorar a leitura de numero inteiros longos
     */
    fun integerLongNumber(): Int {
        return 1_000_000
    }
}