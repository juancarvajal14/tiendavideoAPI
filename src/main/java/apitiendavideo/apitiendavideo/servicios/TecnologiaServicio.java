package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Tecnologia;
import apitiendavideo.apitiendavideo.repositorios.TecnologiaRepositorio;

@Service
public class TecnologiaServicio implements ITecnologiaServicio {

    @Autowired
    private TecnologiaRepositorio repositorio;

    @Override
    public List<Tecnologia> listar() {
        return repositorio.findAll();
    }

    @Override
    public Tecnologia obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Tecnologia> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }
}
