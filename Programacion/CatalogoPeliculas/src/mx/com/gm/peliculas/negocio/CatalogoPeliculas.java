package mx.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {
    
    void agregarPelicula(String nombrePelicula, String nombreRecurso);
    
    void listarPelicula(String nombreRecurso);
    
    void buscarPelicula(String nombreRecurso, String buscar);
    
    void iniciarRecurso(String nombreRecurso);
}
