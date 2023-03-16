package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Titulo;

public interface ITituloServicio {
    
    public List<Titulo> listar();

    public Titulo obtener(Long id);

    public List<Titulo> buscar(String nombre);

}
