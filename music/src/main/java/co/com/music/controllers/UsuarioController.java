package co.com.music.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.music.business.UsuarioBusiness;
import co.com.music.model.Usuario;

@RestController
@RequestMapping(value = "/")
public class UsuarioController {

	 
 	@Autowired
    private UsuarioBusiness usuarioBusiness; 

    @PostMapping("/usuario")
    public @ResponseBody Usuario crearUsuario(@RequestBody Usuario usuario){
    	return usuarioBusiness.crearUsuario(usuario);
    }
    
    @PostMapping("/iniciar")
    public @ResponseBody Usuario existeUsuario(@RequestBody Usuario usuario){
    	return usuarioBusiness.existeUsuaio(usuario);
    }
    
}
