# Proyecto: Biblioteca Genérica

## Descripción
Este proyecto simula una biblioteca genérica que puede manejar elementos como libros, revistas, o cualquier otro tipo de material con identificadores genéricos. Se implementan clases genéricas para manejar elementos con diferentes tipos de identificadores.

## Definición de Clases Genéricas

1. **Clase `Elemento<T>`**
   - Es una clase genérica que representa cualquier elemento en la biblioteca (libros, revistas, etc.).
   - **Atributos:**
     - `T id`: Identificador genérico del elemento.
     - `String titulo`: Título del elemento.
     - `String autor`: Autor o creador del elemento.

   - **Métodos principales:**
     - `getId()` y `setId(T id)`: Para obtener o establecer el identificador genérico.
     - `toString()`: Representación en texto del elemento.

2. **Clase `Biblioteca<T>`**
   - Representa una colección genérica de elementos.
   - **Atributos:**
     - `List<Elemento<T>> catalogo`: Lista de elementos con identificadores genéricos.
   - **Métodos principales:**
     - `agregarElemento(Elemento<T> elemento)`: Agrega un elemento al catálogo.
     - `listarElementos()`: Muestra todos los elementos en el catálogo.
     - `buscarPorId(T id)`: Busca un elemento por su identificador genérico.

## Ejecución
Al ejecutar el programa:
1. Se crea una biblioteca con identificadores numéricos (`Integer`).
2. Se agregan elementos al catálogo.
3. Se listan los elementos disponibles.
4. Se busca un elemento específico por su identificador y se muestra si fue encontrado o no.

## Interpretación
El uso de genéricos permite que el proyecto sea altamente reutilizable. Por ejemplo:
- Si se desea manejar identificadores en formato de texto (e.g., "L001" para libros y "R002" para revistas), solo es necesario cambiar el tipo genérico en la instancia de `Biblioteca`.

## Ejemplo de Salida
```plaintext
Catálogo de la biblioteca:
Elemento{id=1, titulo='Cien años de soledad', autor='Gabriel García Márquez'}
Elemento{id=2, titulo='Don Quijote de la Mancha', autor='Miguel de Cervantes'}
Elemento{id=3, titulo='El Principito', autor='Antoine de Saint-Exupéry'}
Elemento encontrado: Elemento{id=2, titulo='Don Quijote de la Mancha', autor='Miguel de Cervantes'}
