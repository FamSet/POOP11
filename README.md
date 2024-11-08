# POOP11 - Documentación del Código

Este proyecto implementa una aplicación en Java para la manipulación de archivos y el manejo de una lista de estudiantes. Utiliza conceptos de manejo de archivos y colecciones en Java.

## Índice
1. [Descripción General](#descripción-general)
2. [Clases](#clases)
   - [POOP11](#poop11)
   - [Alumno](#alumno)
3. [Ejecución del Programa](#ejecución-del-programa)

## Descripción General

Este proyecto permite realizar operaciones de escritura y lectura en archivos de texto, además de crear y manejar objetos `Alumno`, los cuales representan estudiantes con información como nombre, apellido, número de cuenta, edad y semestre. La aplicación permite leer texto ingresado por el usuario, escribirlo en un archivo, leer su contenido y manejar una lista de estudiantes que se almacena en un archivo independiente.

## Clases

### POOP11

La clase `POOP11` es la clase principal del proyecto y contiene el método `main`. Su objetivo es gestionar las operaciones de archivo y manipulación de datos de estudiantes.

#### Funcionalidades

- **Creación y verificación de archivos**: Crea un archivo llamado `archivo.txt` y verifica si ya existe en el sistema.
- **Escritura en archivos de texto**: Lee texto ingresado por el usuario y lo escribe en `archivo.txt`, añadiendo además varias líneas y un progreso simulado.
- **Lectura de archivos de texto**: Lee y muestra el contenido de `archivo.txt` en la consola.
- **Uso de `StringTokenizer`**: Utiliza `StringTokenizer` para dividir una cadena de texto de ejemplo en tokens separados por comas.
- **Creación de objetos `Alumno`**: Crea instancias de `Alumno` y las agrega a un `ArrayList`.
- **Almacenamiento en archivo**: Guarda la lista de alumnos en un archivo llamado `alumnos.txt`, donde cada línea representa un alumno.

### Alumno

La clase `Alumno` representa a un estudiante con atributos como nombre, apellidos, número de cuenta, edad y semestre. Proporciona métodos para acceder y modificar estos atributos, además de un método `toString()` para obtener una representación en cadena del objeto, que es usada para guardar la información en el archivo `alumnos.txt`.

#### Atributos

- `String nombre`: Nombre del alumno.
- `String apPat`: Apellido paterno del alumno.
- `String apMat`: Apellido materno del alumno.
- `int numCuenta`: Número de cuenta del alumno.
- `int edad`: Edad del alumno.
- `int semestre`: Semestre actual del alumno.

#### Métodos

- **Constructores**
  - `Alumno()`: Constructor vacío.
  - `Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre)`: Inicializa el objeto `Alumno` con valores específicos.
- **Getters y Setters**: Métodos para obtener y modificar cada atributo.
- **`estudiar()`**: Simula una acción del alumno, imprimiendo en consola "Estoy estudiando".
- **`toString()`**: Retorna una cadena con la información del alumno, formateada para ser guardada en un archivo CSV.

## Ejecución del Programa

El programa realiza las siguientes acciones:

1. **Creación de archivos**: Genera `archivo.txt` y verifica si ya existe.
2. **Entrada y salida de datos en archivos**: Solicita al usuario ingresar texto y lo guarda en `archivo.txt`, luego muestra su contenido en la consola.
3. **Manejo de lista de estudiantes**: Crea cinco objetos `Alumno`, los agrega a un `ArrayList` y almacena la lista en `alumnos.txt`.
4. **Lectura y escritura en consola**: Lee el contenido de `archivo.txt` y muestra en consola la lista de alumnos.

### Ejemplo de Salida

```plaintext
############### FileWriter ###############
Escribe texto para el archivo: 
Bienvenido al sistema de estudiantes
Bienvenido al sistema de estudiantes
############### FileReader ###############
El texto del archivo es:
Bienvenido al sistema de estudiantes
Esta es la segunda Linea
Linea 0
...
############### Clase alumno ###############
Alumno(nombre=Alan, apPat=Hernandez, apMat=Flores, numCuenta=321302740, edad=19, semestre=3)
...
```

### Requisitos

Este proyecto solo requiere la biblioteca estándar de Java y se ejecuta desde la línea de comandos.
