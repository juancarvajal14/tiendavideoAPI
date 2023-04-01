package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.stereotype.Repository;
import apitiendavideo.apitiendavideo.modelos.Empresa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {

    @Query("SELECT e FROM Empresa e WHERE e.nombre like '%' || ?1 || '%'")
    List<Empresa> buscar(String nombre);

    @Query("SELECT e FROM Empresa e order by id ASC")
    List<Empresa> listar();

}

