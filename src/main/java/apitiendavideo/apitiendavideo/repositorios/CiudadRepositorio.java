package apitiendavideo.apitiendavideo.repositorios;
 

import org.springframework.stereotype.Repository;
import apitiendavideo.apitiendavideo.modelos.Ciudad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Long> {

    @Query("SELECT c FROM Ciudad c WHERE c.ciudad like '%' || ?1 || '%'")
    List<Ciudad> buscar(String nombre);

}
