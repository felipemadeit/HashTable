import javax.swing.border.LineBorder;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {

    //Objeto HashTable
    static Hashtable<Integer, Libro> biblioteca = new Hashtable<>();

    // Creación de scanner
    static Scanner scanner = new Scanner(System.in);

    // Metodo para precargar algunos libros
    public static void precargarLibros () {

        // Libros precargados a la biblioteca
        Libro precargadoUno = new Libro(2324, "Juego de tronos", 20, 0, "Estanteria ficcion");
        Libro precargadoDos = new Libro(3489, "La leccion de August", 7, 0, "Estanteria no-ficción");
        Libro precargadoTres = new Libro(5689, "It", 10, 0, "Estanteria terror");
        Libro precargadoCuatro  = new Libro(5678, "Ciudades de papel", 5, 0, "Estanteria romance juvenil");

        biblioteca.put(precargadoUno.getCodigo(), precargadoUno);
        biblioteca.put(precargadoDos.getCodigo(), precargadoDos);
        biblioteca.put(precargadoTres.getCodigo(), precargadoTres);
        biblioteca.put(precargadoCuatro.getCodigo(), precargadoCuatro);

    }

    // Metodo para mostrar biblioteca
    public static void recorrerBiblioteca () {

        if (!biblioteca.isEmpty()) {
            for(Map.Entry<Integer, Libro> p: biblioteca.entrySet()) {
                System.out.println();
                System.out.println("Codigo del libro: " + p.getKey());
                System.out.println("Nombre del libro: " + p.getValue().getNombre());
                System.out.println("Cantidad de ejemplares: " + p.getValue().getCantidadEjemplares());
                System.out.println("Cantidad de ejemplares prestados: " + p.getValue().getCantidadPrestados());
                System.out.println("Ubicación del libro: " + p.getValue().getUbicacion());
                System.out.println();
            }
        } else {
            System.out.println("La biblioteca esta vacia");
        }
    }

    // Metodo para agregar libros a la biblioteca
    public static void agregarlibros (int codigo, String titulo, int cantidadEjemplares, int cantidadPrestados, String ubicacion) {

       Libro libroAgregar = new Libro(codigo, titulo, cantidadEjemplares, cantidadPrestados, ubicacion);

       biblioteca.put(libroAgregar.getCodigo(), libroAgregar);

       recorrerBiblioteca();

    }

    // Metodo para prestar libros
    public static void prestarLibros (int codigoLibro) {

        if(biblioteca.containsKey(codigoLibro)) {
            Libro libro = biblioteca.get(codigoLibro);
            if (libro.getCantidadEjemplares() > 0) {
                int cantidadPrestados = libro.getCantidadPrestados();
                int cantidadEjemplares = libro.getCantidadEjemplares();
                libro.setCantidadEjemplares(cantidadEjemplares - 1);
                libro.setCantidadPrestados(cantidadPrestados + 1);
                System.out.println("Libro prestado correctamente");
            } else {
                System.out.println("No hay ejem0plares disponibles");
            }
        } else {
            System.out.println("El libro no esta disponible en la biblioteca");
        }

        recorrerBiblioteca();

        }


    // Metodo para devolver libro
    public static void devolverLibros (int codigoLibro) {

        if (biblioteca.containsKey(codigoLibro)) {
            Libro libro = biblioteca.get(codigoLibro);
            int cantidadPrestados = libro.getCantidadPrestados();
            int cantidadEjemplares = libro.getCantidadEjemplares();
            libro.setCantidadPrestados(cantidadPrestados-1);
            libro.setCantidadEjemplares(cantidadEjemplares+1);
            System.out.println("Libro devuelto correctamente");
        } else {
            System.out.println("El codigo ingresado no concuerda con ningun ejemplar de la biblioteca");
        }

        recorrerBiblioteca();

    }

    // Metodo para eliminar un libro
    public static void eliminarLibro (int codigo) {
        if (biblioteca.containsKey(codigo)) {
            biblioteca.remove(codigo);
            System.out.println("Libro eliminado correctamente");

        } else {
            System.out.println("El codigo ingresado no hace parte de la biblioteca");
        }

        recorrerBiblioteca();
    }

    }

