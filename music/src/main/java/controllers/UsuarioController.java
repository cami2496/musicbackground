package controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import business.UsuarioBusiness;
import model.Usuario;

@RestController
@RequestMapping(value = "/")
@CrossOrigin("http://localhost:4200")
public class UsuarioController {

	public static final String USUARIO = "/usuario";
	 
 	@Autowired
    private UsuarioBusiness usuarioBusiness; 

    @PostMapping(USUARIO)
    public @ResponseBody Usuario crearUsuario(@RequestBody Usuario usuario){
    	return usuarioBusiness.crearUsuario(usuario);
    }
    
    @GetMapping(USUARIO)
    public String prueba(HttpServletResponse resp){
        return "HOLA";
    }
    
}
