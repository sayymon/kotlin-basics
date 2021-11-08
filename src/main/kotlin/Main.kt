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

    mainInstance.stringExemplo = "String Exemplo Alterada"

    println(mainInstance.stringExemplo)

    mainInstance.exemploVariaveisImutaveis()
}

class Main(var nome : String) {

    /**
     * val representa uma constante
     */
    val caracterExemplo = 'T'

    /**
     * Representa uma variavel mutavel
     */
    var stringExemplo = "String de Exemplo"

    /**
     * Forma de Simplificar e melhorar a leitura de numero inteiros longos
     */
    fun integerLongNumber(): Int {
        return 1_000_000
    }

    fun exemploVariaveisImutaveis() {
        val ten = 10
        val greeting = "Hello"
        val firstLetter = 'A'

        println(ten) // prints 10
        println(greeting) // prints Hello
        println(firstLetter) // prints A

        var number = 10
        println(number)
        number = 11 // ok
        /*
            No entanto, há uma restrição para variáveis mutáveis (aquelas declaradas com a palavra-chave var).
            Ao reatribuir seus valores, você só pode usar novos valores do mesmo tipo que o inicial.
            Portanto, o trecho de código abaixo não está correto:

            number = "twelve"  an error here!
         */
        println(number)
    }


}