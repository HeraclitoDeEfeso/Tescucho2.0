# Tescucho V2.0 - CISTAS

## Instrucciones para la Compilación

Al compartir este repositorio de la aplicación móvil TESCUCHO, nuestro objetivo es el de invitar a actualizarla, agregarle nuevas características o proponer cambios, a todos los desarrolladores que así lo deseen.

Para ello proveemos de las siguientes instrucciones de compilación del código fuente.

## Mediante Android Studio (Recomendada)

> **Nota:** En principio es posible compilar la aplicación sin un entorno de desarrollo integrado (IDE). La misma reduce algunos de los requisitos del sistema pero exige un usuario experto. En el futuro es posible que se agregue la opción a estas instrucciones.  

Las siguientes instrucciones están pensadas y han sido verificadas reiteradamente con éxito para el sistema operativo Windows 10 de 64 bits.

### Kit de desarrollo para el lenguaje Java (JDK).

Tanto nuestra aplicación como el Android Studio y Gradle, la herramienta elegida por Google para el control de dependencias, precisan del kit de desarrollo para el lenguaje Java (JDK). La compilación de la aplicación ha sido comprobada a partir de la versión "1.8" del JDK. De todas formas, el instalador del Android Studio también empaqueta una versión del JDK.

Es **necesario** tener definida la variable de entorno `JAVA_HOME` apuntando al directorio de instalación del JDK y agregada la ruta del directorio `bin\` a la variable de entorno `PATH`.

> **Nota:** A partir de julio de 2021, [Android Studio soporta JDK 11](https://developer.android.com/studio/releases/gradle-plugin?utm_source=android-studio-2020-3-1&utm_medium=studio-assistant-stable#7-0-0), por lo que exige actualizar la extensión de Gradle para Android a su versión 7. Futuros cambios a este repositorio pueden adoptar dicha configuración como recomendada, extendiendo consecuentemente estas notas.   

### Android Studio

Antes de instalar el [Android Studio](https://developer.android.com/studio) es necesario verificar sus requerimientos, siendo los más importantes:
-  _"64-bit Microsoft® Windows® 8/10"_. Recomendamos usar Windows 10.
-  _"x86_64 CPU architecture; 2nd generation Intel Core or newer"_. Esto significa que la arquitectura soportada es de 64 bits a partir de un Core Duo.
-  _"AMD CPU with support for a Windows Hypervisor"_. Necesario solamente si va a utilizarse el emulador de dispositivos móviles (No recomendado).  
-  _"8 GB RAM or more"_. Sin la simulación, bastan con 3GB de memoria RAM tanto para un funcionamiento fluido y como para la compilación.
-  _"8 GB of available disk space minimum"_. Sin la simulación, el espacio mínimo de disco utilizado, incluyendo nuestra aplicación, rondará los 4 GB.

La aplicación ha sido compilada exitosamente con la versión _"Artic Fox 2020.3.1"_ del Android Studio. El proceso de instalación es prolongado y necesita de una conexión a Internet para la actualización de ciertos componentes, en particular, la extensión de Gradle para Android. De todas formas, es posible detener la instalación y retomarla más tarde sin problemas.

Es posible que aunque el proceso de instalación del Android Studio no se detenga, se informen de errores o advertencias. Esto es especialmente cierto con respecto a los módulos de virtualización asistida por hardware. De todas formas, es común que dichos módulos y servicios ya se encuentren instalados en su sistema (por ejemplo si utiliza el _Windows Subsystem for Linux_), y en realidad son sólo necesarios si utiliza la simulación de dispositivos (no recomendada). 

### Clonar nuestro repositorio

Para compilar la aplicación se debe primero descargar su código fuente. Esto es posible realizarlo de diversas formas:
-  Si sólo se pretende compilar localmente la aplicación para su prueba, basta con clonar [este mismo repositorio](https://github.com/CISTAS/Tescucho2.0) ya sea por la interfaz de usuario de Android Studio o por línea de comando:

   `git clone https://github.com/CISTAS/Tescucho2.0.git`

-  Si se desea colaborar con el desarrollo, recomendamos realizar primero una copia o _fork_ en su propia cuenta de [GitHub](https://github.com/) desde la cual copiar el código fuente a su máquina por línea de comandos, y solicitar después la inclusión o _merge_ de los cambios.

Por razones históricas y por ser de nuestro interés el proveer un código listo para compilar, en el repositorio existen muchos archivos de configuración que en general no es necesario distribuir entre distintas instalaciones. Por lo que recomendamos a aquellos desarrolladores que quieran colaborar con la aplicación, el que incluyan en el directorio raíz de su proyecto un archivo `.gitignore` como el siguiente:

```
.idea/
.gradle/
build/
app/build/
aars/build/
models/build/
*.iml
local.properties
.DS_Store
.gitignore
```

Luego es posible indicarle al índice de archivos del control de versiones, que deje de administrar los cambios de éstos, ubicándonos en la misma carpeta del `.gitignore` y corriendo en la línea de comandos:

`for /F "usebackq tokens=*" %A in (".gitignore") do git update-index --skip-worktree %A`

### Sincronizar Gradle

Una vez copiado el código fuente de nuestro repositorio, se debe indicar que se acepta al mismo como confiable en el entorno de desarrollo de Android Studio. Luego se iniciará automáticamente la sincronización de la extensión de Gradle para Andriod. Este proceso puede demorar tiempo, ya que se descargarán todas las librerías y dependencias de la aplicación.

Es posible que surjan algunos inconvenientes durante la sincronización, especialmente por no haber configurado correctamente la ruta al kit de desarrollo de java (JDK), que debe ser la misma tanto para el Android Studio como para Gradle. No existe inconveniente en definir dicha ruta igual al `JAVA_HOME` desde la interfaz de Android Studio (el que proveerá de dicha opción) y luego cerrar el entorno de desarrollo y volver a reiniciarlo. La sincronización podrá ser retomada sin inconvenientes.

### Compilar e instalar la aplicación

Una vez sincronizadas las dependencias de nuestra aplicación con la extensión de Gradle para Android, podremos compilarla mediante el menú `Build > Build APK(s)`.

Luego de unos minutos, el entorno de desarrollo de Android Studio nos indicará que el proceso ha finalizado sin errores o, en su defecto, de los problemas encontrados. En caso de éxito se nos indicará la opción de abrir el navegador de archivos del sistema en la carpeta a donde ha sido copiada la aplicación.

El método recomendado para probarla, es el de instalarla directamente en un dispositivo, utilizando un cable USB: 
-  Conectar el móvil a la computadora de escritorio.
-  De ser necesario, dar permisos en el móvil para acceder a sus archivos.
-  Copiar la aplicación a la carpeta `Download` del dispositivo.
-  Abrir la carpeta `Download` en el móvil y seleccionar el archivo `.apk`
-  Aceptar la advertencia de instalación de una aplicación no firmada.

La aplicación está diseñada para ejecutarse en dispositivos que tengan al menos la versión de Android 5.0 o _"Lollipop"_ (nivel de API 21).

---

2021 - Equipo de desarrollo de [CISTAS - UNTREF](http://cistas.untref.edu.ar).