package apitiendavideo.apitiendavideo.servicios;

import java.util.List;
import apitiendavideo.apitiendavideo.modelos.Empresa;
import apitiendavideo.apitiendavideo.modelos.Titulo;

public interface IEmpresaServicio {
   
    public List<Empresa> listar();

    public Empresa obtener(Long id);

    public List<Empresa> buscar(String nombre);

    public List<Titulo> buscarTitulos(String nombre);

    public Empresa guardar(Empresa empresa);

    public boolean eliminar(Long id);

}
