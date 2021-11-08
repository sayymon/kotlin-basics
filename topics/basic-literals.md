#Theory: Basic literals

Regardless of their complexity, all programs essentially perform operations on numbers, strings, and other values. These values are called literals i.e. in the most basic sense or meaning of the symbol. Before we start writing our first programs, let's learn the basic literals in Kotlin: integer numbers, characters, and strings. You can meet these literals everywhere in everyday life.

Independentemente de sua complexidade, todos os programas essencialmente executam operações em números, strings e outros valores. Esses valores são chamados de literais, ou seja, no sentido ou significado mais básico do símbolo. Antes de começar a escrever nossos primeiros programas, vamos aprender os literais básicos em Kotlin: números inteiros, caracteres e strings. Você pode encontrar esses literais em qualquer lugar na vida cotidiana.

##Integer numbers

We use integer numbers to count things in the real world. We will also often use integer numbers in Kotlin.

Usamos números inteiros para contar coisas no mundo real. Também usaremos frequentemente números inteiros em Kotlin.

Here are several examples of valid integer number literals separated by commas: 0, 1, 2, 10, 11, 100.

Aqui estão vários exemplos de literais de número inteiro válidos separados por vírgulas: 0, 1, 2, 10, 11, 100.

If an integer value contains a lot of digits, we can add underscores to divide the digits into blocks to make this number more readable: for example, 1_000_000 is much easier to read than 1000000.

Se um valor inteiro contém muitos dígitos, podemos adicionar sublinhados para dividir os dígitos em blocos para tornar este número mais legível: por exemplo, 1_000_000 é muito mais fácil de ler do que 1000000.

You can add as many underscores as you would like: 1__000_000, 1_2_3. Remember, underscores can’t appear at the start or at the end of the number. If you write _10 or 100_ , you get an error.

Você pode adicionar quantos sublinhados desejar: 1__000_000, 1_2_3. Lembre-se de que os sublinhados não podem aparecer no início ou no final do número. Se você escrever _10 ou 100_, receberá um erro.

##Characters
A single character can represent a digit, a letter, or another symbol. To write a single character, we wrap a symbol in single quotes as follows: 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2', '9'. Character literals can represent alphabet letters, digits from '0' to '9', whitespaces (' '), or some other symbols (e.g., '$').

Um único caractere pode representar um dígito, uma letra ou outro símbolo. Para escrever um único caractere, colocamos um símbolo entre aspas simples da seguinte maneira: 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2 ',' 9 '. Literais de caracteres podem representar letras do alfabeto, dígitos de '0' a '9', espaços em branco ('') ou alguns outros símbolos (por exemplo, '$').

Do not confuse characters representing numbers (e.g., '9') and numbers themselves (e.g., 9).

Não confunda os caracteres que representam números (por exemplo, '9') e os próprios números (por exemplo, 9).

A character cannot include two or more digits or letters because it represents a single symbol. The following two examples are incorrect: 'abc', '543' because these literals have too many characters.

Um caractere não pode incluir dois ou mais dígitos ou letras porque representa um único símbolo. Os dois exemplos a seguir estão incorretos: 'abc', '543' porque esses literais têm muitos caracteres.

Strings

Strings represent text information, such as the text of an advertisement, the address of a web page, or the login to a website. A string is a sequence of any individual characters.

Strings representam informações de texto, como o texto de um anúncio, o endereço de uma página da web ou o login em um site. Uma string é uma sequência de quaisquer caracteres individuais.

To write strings, we wrap characters in double quotes instead of single ones. Here are some valid examples: "text", "I want to learn Kotlin", "123456", "e-mail@gmail.com". So, strings can include letters, digits, whitespaces, and other characters.

Para escrever strings, colocamos os caracteres entre aspas duplas em vez de simples. Aqui estão alguns exemplos válidos: "texto", "Eu quero aprender Kotlin", "123456", "e-mail@gmail.com". Portanto, as strings podem incluir letras, dígitos, espaços em branco e outros caracteres.

A string can also contain just one single character, like "A". Do not confuse it with the character 'A', which is not a string.

Uma string também pode conter apenas um único caractere, como "A". Não o confunda com o caractere 'A', que não é uma string.