package apitiendavideo.apitiendavideo.controladores;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import apitiendavideo.apitiendavideo.modelos.Pais;
//import apitiendavideo.apitiendavideo.repositorios.*;
import apitiendavideo.apitiendavideo.servicios.IPaisServicio;

@RestController
@RequestMapping("/paises")

public class PaisControlador {
    @Autowired
    private IPaisServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Pais> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Pais crear(@RequestBody Pais pais) {
        return servicio.guardar(pais);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Pais actualizar(@RequestBody Pais pais) {
        if (servicio.obtener(pais.getId()) != null) {
            return servicio.guardar(pais);
        }
        else{
            return null;
        }
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public Pais eliminar(@PathVariable("id")Long id) {
        return servicio.eliminar(id);
        
    }

}
