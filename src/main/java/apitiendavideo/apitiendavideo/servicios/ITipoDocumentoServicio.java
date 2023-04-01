package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.TipoDocumento;

public interface ITipoDocumentoServicio {
    
    public List<TipoDocumento> listar();

    public TipoDocumento obtener(Long id);

    public List<TipoDocumento> buscar(String nombre);

    public TipoDocumento guardar(TipoDocumento tipo);

    public TipoDocumento eliminar(Long id);
}
