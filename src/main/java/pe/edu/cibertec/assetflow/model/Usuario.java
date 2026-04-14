package pe.edu.cibertec.assetflow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tb_usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(nullable = false, length = 100)
    private String apellido;
    
    @Column(unique = true, nullable = false, length = 8)
    private String dni;
    
    @Column(unique = true, nullable = false, length = 150)
    private String email;
    
    @Column(length = 15)
    private String telefono;
    
    @Column(length = 50)
    private String rol;
    
    @Column(length = 20)
    private String estado;


    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private List<Prestamo> prestamos;
}