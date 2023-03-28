package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Region;
import apitiendavideo.apitiendavideo.repositorios.RegionRepositorio;

@Service
public class RegionServicio implements IRegionServicio{
    
    @Autowired
    private RegionRepositorio repositorio;

    @Override
    public List<Region> listar() {
        return repositorio.listar();
    }

    @Override
    public Region obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Region> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Region guardar(Region region) {
        return repositorio.save(region);
    }

    @Override
    public Region eliminar(Long id) {
        repositorio.deleteById(id);
        return null;  
    }
}
