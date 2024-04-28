import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main (String [] args) {

        // Llamada al metod para cargar la biblioteca con los libros default
        Biblioteca.precargarLibros();

        // Creación del scanner
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion!= 6) {
            System.out.println("Elija una opcion del menu");
            System.out.println("1. Agregar libros a la biblioteca");
            System.out.println("2. Prestar libros");
            System.out.println("3. Devolver libros");
            System.out.println("4. Mostrar libros de la biblioteca");
            System.out.println("5. Eliminar libros de la biblioteca");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del libro");
                    int codigoAgregar = scanner.nextInt();

                    System.out.println("Ingrese el nombre del libro");
                    String nombreAgregar = scanner.nextLine();

                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de ejemplares");
                    int cantAgregarEjem = scanner.nextInt();

                    System.out.println("Ingrese la ubicación para poner el libro");
                    String ubiAgr = scanner.nextLine();
                    scanner.nextLine();
                    Biblioteca.agregarlibros(codigoAgregar, nombreAgregar, cantAgregarEjem, 0, ubiAgr);
                    break;
                case 2:

                    System.out.println("Ingrese el codigo del libro que quiere tomar prestado");
                    int codigoPrestar = scanner.nextInt();

                    Biblioteca.prestarLibros(codigoPrestar);
                    break;

                case 3:

                    System.out.println("Ingrese el codigo del libro que quiere devolver");
                    int codigoDevolver = scanner.nextInt();

                    Biblioteca.devolverLibros(codigoDevolver);
                    break;
                case 4:


                    Biblioteca.recorrerBiblioteca();
                    break;
                case 5:

                    System.out.println("Ingrese el codigo del libro que quiere eliminar");
                    int codigoEliminar = scanner.nextInt();
                    Biblioteca.eliminarLibro(codigoEliminar);
                    break;

                default:
                    System.out.println("Opcion no valida");


            }
        }
    }

    }





