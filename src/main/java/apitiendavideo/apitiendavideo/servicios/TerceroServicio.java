package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Tercero;
import apitiendavideo.apitiendavideo.repositorios.TerceroRepositorio;

@Service
public class TerceroServicio implements ITerceroServicio{
    
    @Autowired
    private TerceroRepositorio repositorio;

    @Override
    public List<Tercero> listar() {
        return repositorio.findAll();
    }

    @Override
    public Tercero obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Tercero> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }
    
}
