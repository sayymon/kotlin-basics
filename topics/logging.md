#ntroduction to logging

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