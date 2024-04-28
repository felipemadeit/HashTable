public class Libro {

    // Atributos de la clase
    private int codigo;
    private String nombre;
    private int cantidadEjemplares;
    private int cantidadPrestados;
    private String ubicacion;

    // Constructores

    public Libro(int codigo, String nombre, int cantidadEjemplares, int cantidadPrestados, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadPrestados = cantidadPrestados;
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    // Metodo toString

    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", cantidadEjemplares=" + cantidadEjemplares +
                ", cantidadPrestados=" + cantidadPrestados +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
