package pe.edu.cibertec.assetflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.assetflow.model.Usuario;
import pe.edu.cibertec.assetflow.service.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200") 
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.listarUsuarios();
    }

    @PostMapping
    public Usuario registrar(@RequestBody Usuario u) {
        return service.guardarUsuario(u);
    }


    @PutMapping("/{id}")
    public Usuario editar(@PathVariable Integer id, @RequestBody Usuario u) {

        u.setId(id); 
        return service.guardarUsuario(u);
    }

    @GetMapping("/{id}")
    public Usuario buscarXId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminarUsuario(id);
    }
}