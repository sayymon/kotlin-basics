#Introduction to logging

Introdução ao log

Imagine you are investigating a robbery and are trying to figure out what happened. You have witnesses whose testimonies are very vague, but there is no evidence. It will be very difficult to unravel such a mess. If only there were recordings from surveillance cameras to restore the chronology of the events...

Imagine que você está investigando um assalto e tentando descobrir o que aconteceu. Você tem testemunhas cujos depoimentos são muito vagos, mas não há provas. Será muito difícil desfazer essa bagunça. Se ao menos houvesse gravações de câmeras de vigilância para restaurar a cronologia dos eventos ...

So now, let's say you are investigating a bug, but what 'surveillance cameras' do you have in that case? Obviously, we need records of everything that happened with the program before the incident. Also, it would be nice to know during which operation it happened. All such records are usually kept in the log. So what is a log?

Agora, digamos que você esteja investigando um bug, mas quais 'câmeras de vigilância' você tem nesse caso? Obviamente, precisamos de registros de tudo o que aconteceu com o programa antes do incidente. Além disso, seria bom saber durante qual operação isso aconteceu. Todos esses registros geralmente são mantidos no log. Então, o que é um log?

#Log

Logging refers to the act of recording during the execution of an application. Logs are records that give us information about the events in a software application. This record could be a message that is enough to understand the event that happened, it may include a timestamp, a description, and a severity level. These events could be user-generated or system-generated. We use either a log file or, sometimes, a standard output to make these records.

O registro se refere ao ato de gravar durante a execução de um aplicativo. Logs são registros que nos fornecem informações sobre os eventos em um aplicativo de software. Este registro pode ser uma mensagem suficiente para entender o evento ocorrido, pode incluir um carimbo de data / hora, uma descrição e um nível de gravidade. Esses eventos podem ser gerados pelo usuário ou gerados pelo sistema. Usamos um arquivo de log ou, às vezes, uma saída padrão para fazer esses registros.

We need logging for several reasons. Firstly, it will save a lot of time when we are troubleshooting our application at a late stage. If the program, for example, broke or something went wrong in it, then we can find the exact moment at which the error occurred in the log. This makes the debugging process a lot easier. Secondly, it is also possible to trace who used the program with the log. If it is, say, a site, one can find out who sent the requests. Also, logs help to monitor the operation of a particular system, which makes verification and reporting a whole lot easier. This way, we are always aware of how our programs work and how well they perform.

Precisamos de registro por vários motivos. Em primeiro lugar, economizará muito tempo quando estivermos resolvendo problemas em nosso aplicativo em um estágio posterior. Se o programa, por exemplo, quebrou ou algo deu errado nele, podemos encontrar no log o momento exato em que o erro ocorreu. Isso torna o processo de depuração muito mais fácil. Em segundo lugar, também é possível rastrear quem usou o programa com o log. Se for, digamos, um site, pode-se descobrir quem enviou as solicitações. Além disso, os logs ajudam a monitorar a operação de um sistema específico, o que torna a verificação e o relatório muito mais fáceis. Dessa forma, estamos sempre cientes de como nossos programas funcionam e quão bem eles atuam.

There are several things to consider when logging: when we log? what we log? how we log? Let’s find out the answers to these questions.

Há várias coisas a se considerar ao registrar: quando registramos? o que nós registramos? como podemos logar? Vamos descobrir as respostas para essas perguntas.

When, What, and How

Quando, o que e como

As we've mentioned above, there are several common reasons to generate logs:
Como nós mencionamos acima, existem varias razões comuns para geração de logs:

troubleshooting -> Solução de problemas
auditing -> Auditoria
profiling -> aprumando, endireitando, comparando, cotejando, alinhando
statistics -> estatisticas

What we log usually depends on the application. In any case, we should be able to understand the execution path of a program through the logs. It is important to avoid excessive logging as it is costly. For example, there's no need to log the start and the end of every method, their arguments, since they are easy to track. Logs are meant to cover server issues, database issues, networking issues, errors from unanticipated user inputs, states of dynamically created objects, configuration values.

O que nós usualmente logamos depende da aplicação, Em todo caso, devemos ser capazes de entender o caminho da execução de um programa por meio dos logs. Isto é importante para evitar logs excessivos pois é caro. Por exemplo, não há necessidade para logar o começo e o fim de todo o método, seus argumentos, uma vez que são faceis de rastrear. Logs visão cobrir problemas de servidor, banco de dados, redes, erros erros de entradas imprevistas do usuário, estados de objetos criados dinamicamente, valores de configuração  

Providing contextual information in your log messages is very important as well. Often, the success or the failure of a program depends on the user inputs. So, you need to put them in your log messages if necessary. For example, when authenticating a user, log the username that is inputted. Context is also important when your program runs in a concurrent environment. In such a case the thread name can be added to the log message.

Fornecer informações contextuais em suas mensagens de log tambem é muito importante. Muitas vezes, o sucesso ou a falha de um programa depende das entradas do usuario. Portanto, você precisa colocá-los em suas mensagens de log, se necessário. Por exemplo, ao autenticar um usuário, registre o nome de usuário inserido. O contexto também é importante quando seu programa é executado em um ambiente concorrente. Nesse caso, o nome do thread pode ser adicionado à mensagem de log.

Log levels -> Niveis de Logs

We said earlier that a lot of important information can be added to the log file. But what kind of information is it? There are different types that correspond to the accepted logging levels: Debug, Info, Warn, Error, Fatal (from the least critical level to the most critical one).

Dissemos anteriormente que muitas informações importantes podem ser adicionadas ao arquivo de log. Mas que tipo de informação é essa? Existem diferentes tipos que correspondem aos níveis de log aceitos: Debug, Info, Warn, Error, Fatal (do nível menos crítico ao mais crítico).

Let’s see what those log levels are for. -> Vamos ver para que servem esses níveis de log.

Debug logs are used to diagnose applications. Debugging messages inform us about what the program is doing at a certain step and what it gets as a result of these actions. For example, a message can contain information about the output of some function, so that we can see if it should be fixed.

Os logs de depuração são usados para diagnosticar aplicativos. As mensagens de depuração nos informam sobre o que o programa está fazendo em uma determinada etapa e o que obtém como resultado dessas ações. Por exemplo, uma mensagem pode conter informações sobre a saída de alguma função, para que possamos ver se ela deve ser corrigida.

* Info is used to log important information about an application. It is used to log service start, service stop, configurations, assumptions. For example, the information about the user who has just registered on the website.
* Info é usado para registrar informações importantes sobre um aplicativo. É usado para registrar o início do serviço, a parada do serviço, configurações, suposições. Por exemplo, as informações sobre o usuário que acabou de se cadastrar no site.

* Warn logs are considered to be the first level of application failure. They are usually applied to log repeated attempts to access a resource, missing secondary data, or switching from a primary server to a back-up server. For instance, there can be a message about a possible disconnection with the server. However, it does not affect the user at this point.
* Os logs de aviso são considerados o primeiro nível de falha do aplicativo. Eles geralmente são aplicados para registrar tentativas repetidas de acessar um recurso, dados secundários ausentes ou mudança de um servidor primário para um servidor de backup. Por exemplo, pode haver uma mensagem sobre uma possível desconexão com o servidor. No entanto, isso não afeta o usuário neste momento.

* Error log level is used for more critical problems. These kinds of issues usually affect the result of the operation but do not terminate the program. Errors are considered to be the second level of application failures. For example, there can be a message that a user could not log in because the database was temporarily unavailable.
* O nível de log de erros é usado para problemas mais críticos. Esses tipos de problemas geralmente afetam o resultado da operação, mas não encerram o programa. Os erros são considerados o segundo nível de falhas do aplicativo. Por exemplo, pode haver uma mensagem de que um usuário não conseguiu fazer login porque o banco de dados estava temporariamente indisponível.

* Fatal is the third level of application failures. It is used to indicate a much more serious error that causes the termination of the program. Such a message may say that the program totally failed and depending on the time and conditions of this failure the developers can find out how to fix the problem.
* Fatal é o terceiro nível de falhas do aplicativo. É usado para indicar um erro muito mais sério que causa o encerramento do programa. Essa mensagem pode dizer que o programa falhou totalmente e dependendo do tempo e das condições dessa falha, os desenvolvedores podem descobrir como consertar o problema.

Great, now we know what bugs are usually written into the log file. Now we need to display the log. But what should be displayed? In order to make the log readable and understandable, there is a special recording format. Let's find out more about it below.

Ótimo, agora sabemos quais bugs são geralmente gravados no arquivo de log. Agora precisamos exibir o log. Mas o que deve ser exibido? Para tornar o registro legível e compreensível, existe um formato de gravação especial. Vamos descobrir mais sobre isso abaixo.

Log Format -> Formato do Log

To investigate a bug, we need to know when it happened, how serious it was, and who came across it. Thus, the log format generally looks like this:

Para investigar um bug, precisamos saber quando ele aconteceu, quão sério era e quem o encontrou. Assim, o formato do registro geralmente se parece com este:

```
[date time][log level][message]
```
So, it starts with the date and time of when the error occurred. Then comes the log level, and the last thing is the message with the explanation of what exactly happened. More specifically, if we, for example, want to monitor who registers on our site, we need the corresponding logs with Info log level. Then every time a user sends data to the site, we will log a message about this event. For example, on February 2, 2021, a user with the nickname 'demo' registered on the site at 3 pm. Then the log will look like this:

Portanto, começa com a data e hora em que ocorreu o erro. Em seguida, vem o nível de log, e a última coisa é a mensagem com a explicação do que exatamente aconteceu. Mais especificamente, se quisermos, por exemplo, monitorar quem se registra em nosso site, precisamos dos respectivos logs com nível de log Info. Então, toda vez que um usuário enviar dados para o site, iremos registrar uma mensagem sobre este evento. Por exemplo, em 2 de fevereiro de 2021, um usuário com o apelido 'demo' se cadastrou no site às 15h. Então, o log ficará assim:
```
[2021-02-02 15:00:00] [INFO] User 'demo' has registered
```
And if some user named 'alex98' cannot log in because of some technical issues, we will receive an Error message:

E se algum usuário chamado 'alex98' não conseguir fazer login devido a alguns problemas técnicos, receberemos uma mensagem de erro:
```
[2021-02-02 01:00:10] [ERROR] User 'alex98' cannot log in because the database is temporarily unavailable
```
Thus, we will know that user 'alex98' failed to log in due to our database being temporarily unavailable. We have localized the problem and know exactly what we need to do: check the database and fix it.

Assim, saberemos que o usuário 'alex98' falhou ao efetuar o login devido ao nosso banco de dados estar temporariamente indisponível. Localizamos o problema e sabemos exatamente o que precisamos fazer: verificar o banco de dados e corrigi-lo.

