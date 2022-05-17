
package Biblioteca;
/**
 * @author AAMC♡
 */
public class Libro {
    int id;
    String nombreLibro;
    String autor;
    String fechaPublicacion;

    public Libro() {
        
    }
    public Libro(int id, String nombreLibro, String autor, String fechaPublicacion) {
        this.id = id;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
}
