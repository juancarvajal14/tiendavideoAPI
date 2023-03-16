package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.TipoDocumento;
import apitiendavideo.apitiendavideo.repositorios.TipoDocumentoRepositorio;

@Service
public class TipoDocumentoServicio implements ITipoDocumentoServicio{
    
    @Autowired
    private TipoDocumentoRepositorio repositorio;

    @Override
    public List<TipoDocumento> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoDocumento obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<TipoDocumento> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }
}
