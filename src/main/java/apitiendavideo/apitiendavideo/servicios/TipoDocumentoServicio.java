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
        return repositorio.listar();
    }

    @Override
    public TipoDocumento obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<TipoDocumento> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public TipoDocumento guardar(TipoDocumento tipo) {
        return repositorio.save(tipo);
    }

    @Override
    public TipoDocumento eliminar(Long id) {
        repositorio.deleteById(id);
        return null;  
    }
}
