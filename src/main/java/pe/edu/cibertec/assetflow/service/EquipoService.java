package pe.edu.cibertec.assetflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.assetflow.model.Equipo;
import pe.edu.cibertec.assetflow.repo.EquipoRepository;
import java.util.List;

@Service
public class EquipoService {
    
    @Autowired
    private EquipoRepository repo;

    public List<Equipo> listarEquipos() {
        return repo.findAll();
    }

    public Equipo registrarEquipo(Equipo e) {
        return repo.save(e);
    }

    public Equipo buscarEquipoXId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminarEquipo(Integer id) {
        repo.deleteById(id);
    }
}