package pe.edu.cibertec.assetflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.assetflow.model.Prestamo;
import pe.edu.cibertec.assetflow.model.Equipo;
import pe.edu.cibertec.assetflow.repo.PrestamoRepository;
import pe.edu.cibertec.assetflow.repo.EquipoRepository;
import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepo;

    @Autowired
    private EquipoRepository equipoRepo;

    public List<Prestamo> listarPrestamos() {
        return prestamoRepo.findAll();
    }

}