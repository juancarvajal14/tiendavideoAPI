package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.modelos.Tecnologia;
import apitiendavideo.apitiendavideo.servicios.ITecnologiaServicio;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiaControlador {
    
    @Autowired
    private ITecnologiaServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Tecnologia> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Tecnologia obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Tecnologia> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }
}
