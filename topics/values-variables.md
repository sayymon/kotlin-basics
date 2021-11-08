Values and variables

What is a variable?

A variable is a storage for a value, which can be a string, a number, or something else. Every variable has a name (or an identifier) to distinguish it from other variables. You can access a value by the name of the variable.

Uma variável é um armazenamento para um valor, que pode ser uma string, um número ou outra coisa. Cada variável tem um nome (ou um identificador) para distingui-la de outras variáveis. Você pode acessar um valor pelo nome da variável.

Variables are one of the most often used elements in programs; therefore, it is important to understand how to use them.

Variáveis são um dos elementos mais usados em programas; portanto, é importante entender como usá-los.

##Declaring variables
Before you can start using a variable, you must declare it. To declare a variable, Kotlin provides two keywords:

* val (for value) declares an immutable variable (just a named value or a constant), which cannot be changed after it has been initialized (this is actually not entirely true, we will discuss this issue in more detail later);
* var (for variable) declares a mutable variable, which can be changed (as many times as needed).

When you declare a variable, you must add its name after one of these two keywords. Be careful: the name of a variable cannot start with a digit. Usually, it starts with a letter. You should choose meaningful and readable names for variables to make your code easy to understand.

Ao declarar uma variável, você deve adicionar seu nome após uma dessas duas palavras-chave. Cuidado: o nome de uma variável não pode começar com um dígito. Normalmente, começa com uma letra. Você deve escolher nomes significativos e legíveis para variáveis para tornar seu código fácil de entender.

To assign a certain value to a variable, we should use the assignment operator =.

Para atribuir um certo valor a uma variável, devemos usar o operador de atribuição =.

Let's declare an immutable variable named language and initialize it with the string "Kotlin".
```
val language = "Kotlin"
```
Now we can access this string by the variable's name. Let's print it!
Agora podemos acessar essa string pelo nome da variável. Vamos imprimir!
```
println(language) // prints "Kotlin" without quotes
```
This variable cannot be modified after it has been initialized because it was declared as val.

Esta variável não pode ser modificada após ter sido inicializada porque foi declarada como val.

Names are case-sensitive: language is not the same as Language.
Now, let's declare a mutable variable named dayOfWeek and print its value before and after changing it.

Os nomes diferenciam maiúsculas de minúsculas: o idioma não é o mesmo que o idioma.
Agora, vamos declarar uma variável mutável chamada dayOfWeek e imprimir seu valor antes e depois de alterá-lo.

```
var dayOfWeek = "Monday"
println(dayOfWeek) // prints Monday

dayOfWeek = "Tuesday"
println(dayOfWeek) // prints Tuesday
```
In the example above, we declared a variable named dayOfWeek and initialized it with the value "Monday". Then we accessed the value by the variable name and printed it. After that, we changed the variable's value to "Tuesday" and printed this new value.

No exemplo acima, declaramos uma variável chamada dayOfWeek e a inicializamos com o valor "Monday". Em seguida, acessamos o valor pelo nome da variável e o imprimimos. Depois disso, alteramos o valor da variável para "terça-feira" e imprimimos esse novo valor.

You do not need to declare a variable again to change its value. Just assign a new value to it using the = operator.
It is also possible to declare and initialize a variable with the value of another variable:

No exemplo acima, declaramos uma variável chamada dayOfWeek e a inicializamos com o valor "Monday". Em seguida, acessamos o valor pelo nome da variável e o imprimimos. Depois disso, alteramos o valor da variável para "terça-feira" e imprimimos esse novo valor.

```
val cost = 3
val costOfCoffee = cost
println(costOfCoffee) // prints 3
```

##Storing different types of values -> Armazenamento de diferentes tipos de valores

We've already mentioned that variables can store different types of values: strings, numbers, characters, and other data types, which we will encounter later.

Já mencionamos que as variáveis podem armazenar diferentes tipos de valores: strings, números, caracteres e outros tipos de dados, que encontraremos mais tarde.

Let's declare three immutable variables to store a number, a string, and a character and then print their values.

Vamos declarar três variáveis imutáveis para armazenar um número, uma string e um caractere e depois imprimir seus valores.

```
val ten = 10
val greeting = "Hello"
val firstLetter = 'A'

println(ten) // prints 10
println(greeting) // prints Hello
println(firstLetter) // prints A
```

There is one restriction for mutable variables (the ones declared with the keyword var), though. When reassigning their values, you can only use new values of the same type as the initial one. So, the piece of code below is not correct:
```
var number = 10
number = 11 // ok
number = "twelve" // an error here!
```
Please remember this restriction!


##Conclusion
Now you know, there are two keywords that are used to declare variables. Actually, in many cases, it is better to use immutable variables (those declared with the keyword val). Before using var, you should make sure that val is not suitable in that case. If it really isn't, use var. Although, keep in mind that the more mutable variables in your code, the harder it is to read. Remember, immutable variables help write more readable code. So, please, use val whenever possible! You can easily replace it with var when you absolutely have to.

Agora você sabe, existem duas palavras-chave usadas para declarar variáveis. Na verdade, em muitos casos, é melhor usar variáveis imutáveis (aquelas declaradas com a palavra-chave val). Antes de usar var, você deve se certificar de que val não é adequado nesse caso. Se realmente não for, use var. Porém, tenha em mente que quanto mais variáveis mutáveis em seu código, mais difícil será de ler. Lembre-se de que as variáveis imutáveis ajudam a escrever um código mais legível. Então, por favor, use val sempre que possível! Você pode substituí-lo facilmente por var quando for absolutamente necessário.