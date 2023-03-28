package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import apitiendavideo.apitiendavideo.modelos.Tecnologia;

@Repository
public interface TecnologiaRepositorio extends JpaRepository <Tecnologia, Long>{
    
    @Query("SELECT t FROM Tecnologia t WHERE t.nombre like '%' || ?1 || '%'")
    List<Tecnologia> buscar(String nombre);

    @Query("SELECT t FROM Tecnologia t order by id ASC")
    List<Tecnologia> listar();
}
