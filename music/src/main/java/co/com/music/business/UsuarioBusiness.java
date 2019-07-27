package co.com.music.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.music.dao.UsuarioDAO;
import co.com.music.exception.musicException;
import co.com.music.model.Usuario;

@Service
public class UsuarioBusiness {

	@Autowired
	private UsuarioDAO usuarioDAO;

	public Usuario crearUsuario(Usuario usuario) {

		validarUsuarioClave(usuario);
		if (usuarioDAO.buscarUsuario(usuario)) {
			usuarioDAO.crearUsuario(usuario);
		}else {
			throw new musicException("El nombre y clave del usuario ya existen en la base de datos por favor ingrese otros");
		}
		return usuario;
	}

	public void validarUsuarioClave(Usuario usuario) {
		if(usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty() ||
				usuario.getClave() == null || usuario.getClave().isEmpty()) {
			throw new musicException("El nombre y clave del usuario son obligatorias");
		}
	}
	
	public Usuario existeUsuaio(Usuario usuario) {
		
		if (usuarioDAO.buscarUsuario(usuario)) {
			return usuario;
		}else {
			throw new musicException("El nombre y clave del usuario ya existen en la base de datos por favor ingrese otros");
		}
	}
}
