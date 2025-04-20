# 🧪 CasoEstudioIzy - Automatización con Serenity BDD

Este proyecto implementa una prueba automatizada de registro y publicación de un post en el sitio **IzyAcademy**, utilizando el patrón **Screenplay** con **Serenity BDD** y **Cucumber**. Fue desarrollado como caso de estudio para mi portafolio profesional de QA Automation.

## 🚀 Características

- Automatización de pruebas en sitio real (ambiente de pruebas)
- Uso de Serenity BDD con Screenplay Pattern
- Manejo de DataTable con modelos personalizados
- Validación del título luego de la publicación
- Separación de responsabilidades en tareas, interacciones, preguntas y modelos

## 🧰 Tecnologías usadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![Serenity BDD](https://img.shields.io/badge/Serenity_BDD-00aaff?style=flat)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=flat&logo=cucumber&logoColor=white)
![Firefox](https://img.shields.io/badge/Firefox-FF7139?style=flat&logo=firefox&logoColor=white)

## ▶️ Cómo ejecutar las pruebas

1. Clona el repositorio  
   `git clone https://github.com/XoluQA/CasoEstudioIzy.git`

2. Ingresa al proyecto  
   `cd CasoEstudioIzy`

3. Ejecuta las pruebas con Gradle  
   `./gradlew clean test` (Linux/macOS)  
   `gradlew.bat clean test` (Windows)

> Asegúrate de tener Java 11 instalado y configurado correctamente en tu sistema.

## 📂 Estructura del proyecto
📁 src ┣ 📁 main ┃ ┗ 📁 java ┃ ┗ com.co.izy → modelos, interacciones y tareas ┣ 📁 test ┃ ┣ 📁 java ┃ ┃ ┗ stepsdefinitions → definición de pasos de Cucumber ┃ ┃ ┗ runners → clase Runner ┃ ┗ 📁 resources ┃ ┗ 📁 features → archivo .feature con el escenario automatizado


## ✍️ Autor

Desarrollado por **XoluQA**  
[GitHub Profile](https://github.com/XoluQA)


