package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import api.entity.Usuario;
import spring.UsuarioRepository;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @PostMapping("/procesar_login")
    public String iniciarSesion(String nombreUsuario, String contrasena, Model model, RedirectAttributes redirectAttributes) {
        // Verificar las credenciales en la base de datos
        Usuario usuario = usuarioRepository.findByNombreUsuarioAndContrasena(nombreUsuario, contrasena);

        if (usuario != null) {
            // Las credenciales son válidas, puedes redirigir al usuario a la página de inicio
            return "redirect:/inicio";
        } else {
            // Las credenciales no son válidas, muestra un mensaje de error
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }
}
