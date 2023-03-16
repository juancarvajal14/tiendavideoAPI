package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;
//import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Pais")
    private String nombre;
    @Column(name = "CodigoAlfa2")
    private String codigoAlfa2;
    @Column(name = "CodigoAlfa3")
    private String codigoAlfa3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }

    public String getCodigoAlfa3() {
        return codigoAlfa3;
    }

    public void setCodigoAlfa3(String codigoAlfa3) {
        this.codigoAlfa3 = codigoAlfa3;
    }

}