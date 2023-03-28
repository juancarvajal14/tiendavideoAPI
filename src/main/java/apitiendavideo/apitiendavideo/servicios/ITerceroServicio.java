package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Tercero;

public interface ITerceroServicio {
    
    public List<Tercero> listar();

    public Tercero obtener(Long id);

    public List<Tercero> buscar(String nombre);

    public Tercero guardar(Tercero tercero);

    public Tercero eliminar(Long id);

}
