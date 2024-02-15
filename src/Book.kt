/**
 * Clase de datos que representa un libro.
 *
 * @property title El título del libro.
 * @property author El autor del libro.
 * @property publishYear El año de publicación del libro.
 */
data class Book(val title: String, val author: String, val publishYear: Int)
/**
 * Clase de datos que representa una revista.
 *
 * @property title El título de la revista.
 * @property issue El número de la edición de la revista.
 * @property year El año de publicación de la revista.
 */
data class Magazine(val title: String, val issue: Int, val year: Int)
/**
 * Clase de datos que representa un DVD.
 *
 * @property title El título del DVD.
 * @property principal El actor principal del DVD.
 * @property year El año de lanzamiento del DVD.
 */
data class DVD(val title: String, val principal: String, val year: Int)
