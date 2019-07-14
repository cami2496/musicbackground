package business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDAO;
import model.Usuario;

@Service
public class UsuarioBusiness {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public Usuario crearUsuario(Usuario vehiculo) {
		usuarioDAO.crearUsuario(vehiculo);
		return vehiculo;
	}
	
}
