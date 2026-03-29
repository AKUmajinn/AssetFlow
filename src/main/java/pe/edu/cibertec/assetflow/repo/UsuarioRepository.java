package pe.edu.cibertec.assetflow.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.assetflow.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { }