package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import apitiendavideo.apitiendavideo.modelos.Region;
import apitiendavideo.apitiendavideo.servicios.IRegionServicio;

@RestController
@RequestMapping("/regiones")
public class RegionControlador {
    
    @Autowired
    private IRegionServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Region> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Region obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Region> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Region crear(@RequestBody Region region) {
        return servicio.guardar(region);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Region actualizar(@RequestBody Region region) {
        if (servicio.obtener(region.getId()) != null) {
            return servicio.guardar(region);
        }
        else{
            return null;
        }
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public Region eliminar(@PathVariable("id")Long id) {
        return servicio.eliminar(id);
        
    }
}
