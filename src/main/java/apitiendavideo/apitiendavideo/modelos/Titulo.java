package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "titulo")
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_titulo")
    @GenericGenerator(name = "secuencia_titulo", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "año")
    private int año;

    @Column(name = "protagonistas", length = 1000)
    private String protagonistas;

    @Column(name = "productor", length = 100)
    private String productor;

    @Column(name = "director", length = 100)
    private String director;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa empresa;

    @Column(name = "precio")
    private double precio;

    public Titulo() {
    }

    public Titulo(long id, String nombre, int año, String protagonistas, String productor, String director,
            Empresa empresa, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.protagonistas = protagonistas;
        this.productor = productor;
        this.director = director;
        this.empresa = empresa;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}