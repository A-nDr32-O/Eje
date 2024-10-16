# Codigos de git 

- **Git init** - El comando git init crea un nuevo repositorio de Git. Puede utilizarse para convertir un proyecto existente y sin versión en un repositorio de Git, o para inicializar un nuevo repositorio vacío.

- **Git clone** - git clone se utiliza principalmente para apuntar a un repositorio existente y clonar o copiar dicho repositorio en un nuevo directorio, en otra ubicación.

- **Git config** - El caso práctico más básico de git config es invocarlo con un nombre de configuración, que mostrará el valor definido con ese nombre. Los nombres de configuración son cadenas delimitadas por puntos que se componen de una "sección" y una "clave" en función de su jerarquía. Por ejemplo: user.email.

- **Git add .** - El comando git add añade un cambio del directorio de trabajo en el entorno de ensayo. De este modo, indica a Git que quieres incluir actualizaciones en un archivo concreto en la próxima confirmación.

- **Git commit** -m "first commit" - El comando git commit captura una instantánea de los cambios preparados en ese momento del proyecto.

- **Git diff** - La comparación con diff es una función mediante la cual se toman dos conjuntos de datos de entrada y se muestran los cambios entre estos.

- **Git stash** - El comando git stash almacena temporalmente (o guarda en un stash) los cambios que hayas efectuado en el código en el que estás trabajando para que puedas trabajar en otra cosa y, más tarde, regresar y volver a aplicar los cambios más tarde.

- **Git ignore** - git ve cada archivo de tu copia de trabajo de una de las siguientes maneras:

    1. Con seguimiento: Un archivo que se ha preparado o confirmado previamente.

    2. Sin seguimiento: Un archivo que no se ha preparado o confirmado.

    3. Ignorado: Un archivo que se le ha indicado explícitamente a Git que ignore.

- **Git status** - uestra el estado del directorio de trabajo y del área del entorno de ensayo. Permite ver los cambios que se han preparado, los que no y los archivos en los que Git no va a realizar el seguimiento.

- **Git tag** - Las etiquetas son referencias que apuntan a puntos concretos en el historial de Git. git tag suele emplearse para capturar un punto del historial que se utiliza para publicar una versión marcada.

- **Git blame** - A grandes rasgos, la función de git blame es visualizar los metadatos de autor adjuntos a líneas específicas confirmadas en un archivo.Esto sirve para explorar el historial del código específico y responder preguntas sobre qué código se ha añadido a un repositorio, cómo se ha añadido y por qué.

- **Git log** - El comando git log muestra las instantáneas confirmadas. Te permite ver el historial del proyecto, filtrarlo y buscar cambios concretos.

- **Git clean** - Git clean es, en cierta medida, un comando para deshacer. Git clean puede considerarse complementario de otros comandos como git reset y git checkout. Mientras que estos comandos operan en archivos agregados previamente al índice de seguimiento de Git, el comando git clean opera en archivos sin seguimiento.

- **Git revert** - Al comando git revert se le puede considerar un comando para "deshacer", pero lo cierto es que no lo es en el sentido tradicional. En lugar de eliminar la confirmación del historial del proyecto, resuelve cómo invertir los cambios introducidos por la confirmación y añade una nueva con el contenido inverso resultante.

- **Git reset** - El comando git reset es una herramienta compleja y versátil para deshacer cambios. Se invoca principalmente de tres formas distintas, que se corresponden con los argumentos de líneas de comandos --soft, --mixed y --hard. Cada uno de los tres argumentos se corresponde con los tres mecanismos de gestión de estados internos de Git: el árbol de confirmaciones (HEAD), el índice del entorno de ensayo y el directorio de trabajo.

- **Git rm** - El comando git rm se usa para eliminar archivos de un repositorio de Git. Se puede considerar que es lo contrario a lo que hace el comando git add.

- **Git push** -u origin master - Subir los archivos

- **Git fetch** - El comando git fetch descarga confirmaciones, archivos y referencias de un repositorio remoto a tu repositorio local.

- **Git push** - El comando git push se usa para cargar contenido del repositorio local a un repositorio remoto. El envío es la forma de transferir confirmaciones desde tu repositorio local a un repositorio remoto. 

- **Git pull** - El comando git pull se emplea para extraer y descargar contenido desde un repositorio remoto y actualizar al instante el repositorio local para reflejar ese contenido.

- **Git Checkout** - El comando git checkout te permite desplazarte entre las ramas creadas por git branch.

- **Git commit --amend** - es una manera práctica de modificar el commit más reciente. Te permite combinar los cambios preparados con el commit anterior en lugar de crear un commit nuevo. También puede usarse para editar el anterior mensaje del commit sin cambiar la instantánea.

- **Git rebase** - El motivo principal por el que llevar a cabo una fusión mediante cambio de base es para mantener un historial del proyecto lineal. Por ejemplo, piensa en una situación en la que la rama principal haya progresado desde que empezaste a trabajar en una rama de función. Quieres incorporar las últimas actualizaciones de la rama principal a tu rama de función, pero quieres mantener el historial de la rama limpio para que parezca que has estado trabajando a partir de la rama principal más reciente.

- **Git Reflog** - Git realiza el seguimiento de las actualizaciones en el extremo de las ramas a través de un mecanismo denominado registros de referencias o "reflogs". Muchos de los comandos de Git aceptan un parámetro para especificar una referencia o "ref", que es un puntero a una confirmación.

- **Git branch** - El comando git branch te permite crear, enumerar y eliminar ramas, así como cambiar su nombre.

- **Git remote** - Enumera las conexiones remotas que tienes con otros repositorios.



https://www.atlassian.com/es/git/tutorials/syncing