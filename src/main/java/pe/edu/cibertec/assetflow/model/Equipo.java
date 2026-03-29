package pe.edu.cibertec.assetflow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tb_equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo_inventario", unique = true, nullable = false, length = 50)
    private String codigoInventario;
    
    @Column(name = "numero_serie", length = 100)
    private String numeroSerie;
    
    @Column(length = 50)
    private String tipo;
    
    @Column(length = 100)
    private String marca;
    
    @Column(length = 100)
    private String modelo;
    
    @Column(length = 20)
    private String estado; 
    
    @Column(length = 255)
    private String observaciones;

    @JsonIgnore
    @OneToMany(mappedBy = "equipo")
    private List<Prestamo> prestamos;
}