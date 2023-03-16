package apitiendavideo.apitiendavideo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Titulo;

@Repository
public interface TituloRepositorio extends JpaRepository<Titulo, Long>{

    @Query("SELECT ti FROM Titulo ti WHERE ti.nombre like '%' || ?1 || '%'")
    List<Titulo> buscar(String nombre);
    
}
