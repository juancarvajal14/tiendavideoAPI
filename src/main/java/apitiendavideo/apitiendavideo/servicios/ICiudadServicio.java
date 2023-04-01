package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Ciudad;
import apitiendavideo.apitiendavideo.modelos.Tercero;

public interface ICiudadServicio {
    
    public List<Ciudad> listar();

    public Ciudad obtener(Long id);

    public List<Ciudad> buscar(String nombre);

    public List<Tercero> buscarClientes(String nombre);

    public Ciudad guardar(Ciudad nombre);

    public boolean eliminar(Long id);
}
