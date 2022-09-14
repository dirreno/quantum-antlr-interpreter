# quantum-antlr-interpreter
Manual de usuario

Generación y lectura EBNF y diagramas:

DIrigirse a la página: https://www.bottlecaps.de/rr/ui

Nos dirigimos a la pestaña de editar gramática

Cargamos el archivo llamado “Proyecto_Q_LP.ebnf”

Generamos los diagramas en la pestaña correspondiente

También si asi se desea podemos descargar los diagramas

Instalación ANTLR4
Dirigirse al repositorio de github: “https://github.com/duhai-alshukaili/antlr4”, donde se descargará el repositorio completo en un archivo .zip, luego se envía la carpeta descomprimida a la unidad principal del equipo, por otro lado se ingresa a las variables de entorno(En Windows) donde se genera una variable que será utilizada más adelante.

Posterior a eso, se dirige a la linea de comandos, donde llega a la carpeta qué se agregó anteriormente, y se ejecuta el siguiente comando

		antlr4 Expr.g4

Luego,

		compile Expr*.java

Por último se escribe este comando

		grun Expr prog -gui

Acompañado de los parámetros correspondientes y necesarios. Y de esta manera podemos obtener nuestro árbol

Bibliografía

http://quegrande.org/apuntes/EI/1/Pro/teoria/08-09/notacion_bnf_mr_110-112.pdf
https://en.wikipedia.org/wiki/Context-free_grammar#Parsing
https://quantum-computing.ibm.com/
https://docirs.cl/Puertas_Circuitos_Cuanticos.asp
https://qiskit.org/documentation/
https://github.com/duhai-alshukaili/antlr4
John A. Smolin Jay M. Gambetta Andrew W. Cross, Lev S. Bishop. Open quantum assembly language, July 2017. URL  https://arxiv.org/abs/1707.03429.
