#What is a data type?
All of us know that a number and a piece of text are pretty different. How do we know this? Well, you can perform arithmetic operations (such as multiplication) on numbers but not on texts. Kotlin also knows it. That's why every variable has a type that determines what possible operations you can perform on this variable and which values you can store in it.

Todos nós sabemos que um número e um pedaço de texto são muito diferentes. Como nós sabemos disso? Bem, você pode realizar operações aritméticas (como multiplicação) em números, mas não em textos. 
Kotlin também sabe disso. É por isso que cada variável tem um tipo que determina quais operações possíveis você pode executar nesta variável e quais valores você pode armazenar nela.

##Variable types

A variable's type is set when the variable is declared:

O tipo de uma variável é definido quando a variável é declarada:

```
val text = "Hello, I am studying Kotlin now."
val n = 1
```
In this case, Kotlin knows that text is a string and n is a number. Kotlin determines the types of both variables automatically. This mechanism is called type inference.

Nesse caso, Kotlin sabe que o texto é uma string e n é um número. O Kotlin determina os tipos de ambas as variáveis automaticamente. Esse mecanismo é chamado de inferência de tipo.

Please, take a look at the following piece of code. This is how we declare a variable with type inference:

Por favor, dê uma olhada no seguinte trecho de código. É assim que declaramos uma variável com inferência de tipo:

```
val/var identifier = initialization
```
You can also specify the type of a variable when declaring it:

Você também pode especificar o tipo de uma variável ao declará-la:

```
val/var identifier: Type = initialization
```
Note, the type name always starts with an uppercase letter.
Let's declare the same variables as in the previous example and specify their types:

Observe que o nome do tipo sempre começa com uma letra maiúscula.
Vamos declarar as mesmas variáveis do exemplo anterior e especificar seus tipos:

```
val text: String = "Hello, I am studying Kotlin now."
val n: Int = 1
```
The Int type means that the variable stores an integer number (0, 1, 2, ..., 100_000_000, ...). The String type means that the variable stores a string ("Hello", "John Smith"). Further, you will learn more about these and other data types.

O tipo Int significa que a variável armazena um número inteiro (0, 1, 2, ..., 100_000_000, ...). O tipo String significa que a variável armazena uma string ("Hello", "John Smith"). Além disso, você aprenderá mais sobre esses e outros tipos de dados.

You will see that people use both these forms of variable declaration in practice. When you use type inference, you make your code more concise and readable, but in some cases, it may be better to specify the type. For example, if we need to declare a variable and initialize it later, type inference won't work at all.

Você verá que as pessoas usam essas duas formas de declaração de variável na prática. Ao usar a inferência de tipo, você torna seu código mais conciso e legível, mas, em alguns casos, pode ser melhor especificar o tipo. Por exemplo, se precisarmos declarar uma variável e inicializá-la mais tarde, a inferência de tipo não funcionará de todo.

```
val greeting // error
greeting = "hello"
```
The example above is incorrect because Kotlin cannot infer the type of the variable when it is merely declared, while every variable must have a type. On the contrary, the example below does work because the type is specified by the programmer:

O exemplo acima está incorreto porque Kotlin não pode inferir o tipo da variável quando ela é meramente declarada, enquanto cada variável deve ter um tipo. Pelo contrário, o exemplo abaixo funciona porque o tipo é especificado pelo programador:
```
val greeting: String // ok
greeting = "hello"
```


##Type mismatch

One of the most important functions of data types is to protect you from assigning an unsuitable value to a variable. Take a look at an example of code that doesn't work:

Uma das funções mais importantes dos tipos de dados é protegê-lo da atribuição de um valor inadequado a uma variável. Dê uma olhada em um exemplo de código que não funciona:
```
val n: Int = "abc" // Type mismatch: inferred type is String but Int was expected
```
So, if you see a type mismatch error, it means you've assigned something unsuitable to a variable. The same problem occurs when you try to assign an unsuitable value to a mutable variable declared with type inference.

```
var age = 30 // the type is inferred as Int
age = "31 years old" // Type mismatch
```

##The classification of basic types

In this topic, we will learn about the classification and properties of basic types in Kotlin. You may know some of them. Basic types can be separated into several groups according to their meaning. The types from the same group operate similarly, but they have different sizes and, as a consequence, represent different ranges of values.

Propriedades dos tipos básicos em Kotlin. Você pode conhecer alguns deles. Os tipos básicos podem ser separados em vários grupos de acordo com seu significado. Os tipos de um mesmo grupo operam de forma semelhante, mas têm tamanhos diferentes e, como consequência, representam diferentes intervalos de valores.

###Numbers
Kotlin provides several types for integers and fractional numbers.

O Kotlin oferece vários tipos de números inteiros e fracionários.

Integer numbers (0, 1, 2, ...) are represented by the following four types: Long, Int, Short, Byte (from the largest to the smallest). These types have different sizes and may represent different ranges of values. The integer type range can be calculated as −(2n−1) to (2n−1)−1, where n is the number of bits. The range includes 0, that's why we subtract 1 from the upper bound.

Os números inteiros (0, 1, 2, ...) são representados pelos quatro tipos a seguir: Long, Int, Short, Byte (do maior para o menor). Esses tipos têm tamanhos diferentes e podem representar diferentes intervalos de valores. O intervalo do tipo inteiro pode ser calculado como - (2n − 1) a (2n − 1) −1, onde n é o número de bits. O intervalo inclui 0, é por isso que subtraímos 1 do limite superior.

```
Byte: 8 bits (1 byte), range varies from -128 to 127;
Short: 16 bits (2 bytes), range varies from -32768 to 32767;
Int: 32 bits (4 bytes), range varies from −(231) to (231)−1;
Long: 64 bits (8 bytes), range varies from −(263) to (263)−1.
The size cannot be changed. It does not depend on the operating system or hardware.
```

The most common integer types are Int and Long. Try to stick to Int in practice. If you need more freedom for your numbers, use Long:

```
val zero = 0 // Int
val one = 1  // Int
val oneMillion = 1_000_000  // Int

val twoMillion = 2_000_000L // Long because it is tagged with L
val bigNumber = 1_000_000_000_000_000 // Long, Kotlin automatically chooses it (Int is too small)
val ten: Long = 10 // Long because the type is specified

val shortNumber: Short = 15 // Short because the type is specified
val byteNumber: Byte = 15   // Byte because the type is specified
```

Floating-point types represent numbers with fractional parts. Kotlin has two such types: Double (64 bits) and Float (32 bits). These types can store only a limited number of decimal digits (~6-7 for Float and ~14-16 for Double). The Double type is more common in practice:

Os tipos de ponto flutuante representam números com partes fracionárias. O Kotlin tem dois tipos: Double (64 bits) e Float (32 bits). Esses tipos podem armazenar apenas um número limitado de dígitos decimais (~ 6-7 para Float e ~ 14-16 para Double). O tipo Double é mais comum na prática:

```
val pi = 3.1415  // Double
val e = 2.71828f // Float because it is tagged with f
val fraction: Float = 1.51 // Float because the type is specified
```
To display the maximum and minimum value of a numeric type (including Double and Float), you need to write the type name followed by a dot . and then either MIN_VALUE or MAX_VALUE:

Para exibir os valores máximo e mínimo de um tipo numérico (incluindo Double e Float), você precisa escrever o nome do tipo seguido por um ponto. e então MIN_VALUE ou MAX_VALUE:

```
println(Int.MIN_VALUE)  // -2147483648
println(Int.MAX_VALUE)  // 2147483647 -> 10 casas
println(Long.MIN_VALUE) // -9223372036854775808
println(Long.MAX_VALUE) // 9223372036854775807 -> 19 casas
```

It is also possible to get the size of an integer type in bytes or bits (1 byte = 8 bits):

Também é possível obter o tamanho de um tipo inteiro em bytes ou bits (1 byte = 8 bits):

```
println(Int.SIZE_BYTES) // 4
println(Int.SIZE_BITS)  // 32
```

###Characters

Kotlin has a Char type to represent various letter characters (uppercase and lowercase), digits, and other symbols. Each character is a letter character in single quotes. The size is similar to the Short type (2 bytes = 16 bits):

Kotlin tem um tipo Char para representar vários caracteres de letras (maiúsculas e minúsculas), dígitos e outros símbolos. Cada caractere é uma letra entre aspas simples. O tamanho é semelhante ao do tipo Short (2 bytes = 16 bits):

```
val lowerCaseLetter = 'a'
val upperCaseLetter = 'Q'
val number = '1'
val space = ' '
val dollar = '$'
```

Characters can represent symbols of many alphabets, including hieroglyphs and some special symbols, which we will consider later.

Os caracteres podem representar símbolos de muitos alfabetos, incluindo hieróglifos e alguns símbolos especiais, que consideraremos mais tarde.

###Booleans

Kotlin provides a type called Boolean. It can store only two values: true and false. It represents only one bit of information, but its size is not precisely defined.

Kotlin fornece um tipo chamado Boolean. Ele pode armazenar apenas dois valores: verdadeiro e falso. Ele representa apenas um bit de informação, mas seu tamanho não é definido com precisão.
```
val enabled = true
val bugFound = false
```

We will often use this type in conditionals.

Freqüentemente, usaremos esse tipo em condicionais.