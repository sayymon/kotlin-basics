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