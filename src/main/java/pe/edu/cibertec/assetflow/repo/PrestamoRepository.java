package pe.edu.cibertec.assetflow.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.assetflow.model.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> { }