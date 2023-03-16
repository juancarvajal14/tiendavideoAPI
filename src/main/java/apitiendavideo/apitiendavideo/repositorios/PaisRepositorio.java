package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apitiendavideo.apitiendavideo.modelos.Pais;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {

    @Query("SELECT p FROM Pais p WHERE p.nombre like '%' || ?1 || '%'")
    List<Pais> buscar(String nombre);

    @Query("SELECT p FROM Pais p order by id ASC")
    List<Pais> listar();

}