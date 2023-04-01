package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.modelos.Titulo;
import apitiendavideo.apitiendavideo.servicios.ITituloServicio;

@RestController
@RequestMapping("/titulos")
public class TituloControlador {

    @Autowired
    private ITituloServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Titulo> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Titulo obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Titulo> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Titulo crear(@RequestBody Titulo titulo) {
        return servicio.guardar(titulo);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Titulo actualizar(@RequestBody Titulo titulo) {
        if (servicio.obtener(titulo.getId()) != null) {
            return servicio.guardar(titulo);
        }
        else{
            return null;
        }
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public Titulo eliminar(@PathVariable("id")Long id) {
        return servicio.eliminar(id);
        
    }
    
}
