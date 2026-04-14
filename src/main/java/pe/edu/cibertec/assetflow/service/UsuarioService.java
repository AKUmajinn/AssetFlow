package pe.edu.cibertec.assetflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.assetflow.model.Usuario;
import pe.edu.cibertec.assetflow.repo.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listarUsuarios() {
        return repo.findAll();
    }

    public Usuario guardarUsuario(Usuario u) {
        return repo.save(u);
    }

    public Usuario buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminarUsuario(Integer id) {
        repo.deleteById(id);
    }
}