# Tescucho V2.0 - CISTAS

Al ser obligatorio el uso de barbijos o tapabocas como medida de prevención del contagio del Coronavirus (COVID-19), se crea una barrera en la comunicación especialmente para personas con sordera o hipoacusia. La posibilidad de leer los labios queda vedada y a su vez se produce una atenuación de las frecuencias de audio, que impiden la comprensión de la palabra hablada.

En ese contexto, el CISTAS desarrolló la aplicación móvil TESCUCHO, que tiene por objetivo la conversión de voz a texto para quienes atienden al público y reciban a personas con pérdida o disminución de su audición, realizando una rápida conversión de la señal sonora del habla en texto fácilmente legible a una distancia de 2 m. 

![Logo de la Aplicación Tescucho](https://github.com/CISTAS/Tescucho2.0/raw/master/app/src/main/res/drawable/tescucho_naranja.png)

TESCUCHO es una aplicación destinada a ser utilizada por toda la sociedad. No es de uso exclusivo para la comunidad sorda, ya que esta pensada con el objetivo de ser una herramienta que facilite la comunicación en sociedad de forma integral y diversa.

## Desarrollado por el equipo CISTAS - UNTREF 

Los invitamos a visitar nuestro [Sitio Web](http://cistas.untref.edu.ar).


## Comunidad Tescucho

Subimos a este repositorio el proyecto para Android Studio para invitar a desarrolladores que quieran actualizarlo, agregarle nuevas características o proponer cambios. Para ello es posible seguir las [Instrucciones de Compilación](https://github.com/CISTAS/Tescucho2.0/blob/master/COMPILING.md) y la documentación en el [Sitio de la Aplicación Tescucho](https://cistas.github.io/Tescucho2.0/).

## Especificaciones sobre el programa

* Como motor del reconocimiento de voz se utilizó Kaldi (https://github.com/kaldi-asr/kaldi), tomando como base el repositorio de VOSK (https://github.com/alphacep/vosk-api)

* Dentro de la carpeta [aars](https://github.com/CISTAS/Tescucho2.0/tree/master/aars) se encuentra el modelo de ASR Kaldi.

* Dentro de [models](https://github.com/CISTAS/Tescucho2.0/tree/master/models) se cambió el modelo original (inglés) por el finalmente usado (español) bajado del sitio web de AlphacepVosk (https://alphacephei.com/vosk/models)

* Dentro de app se encuentran los archivos fuente Java.

* Los recursos gráficos fueron desarrollados por Untref Media y liberados al dominio público con excepción de los iconos [icn_secuencial.xml](https://github.com/CISTAS/Tescucho2.0/blob/master/app/src/main/res/drawable/icn_secuencial.xml) y [icn_continuo.xml](https://github.com/CISTAS/Tescucho2.0/blob/master/app/src/main/res/drawable/icn_secuencial.xml) que son distribuidos con licencia [CC-BY 3.0](https://creativecommons.org/licenses/by/3.0/es/legalcode.es) por https://thenounproject.com/roywj/ y modificado por Untref Media.

