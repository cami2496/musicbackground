package dao;

import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import model.Usuario;

@Repository
public class UsuarioDAO {

	@SuppressWarnings("deprecation")
	public  void crearUsuario(Usuario usuario) {
		MongoClient mongo = crearConexion();
		
		DB db = mongo.getDB("database");
        DBCollection table = db.getCollection("musicbackground");
 
        BasicDBObject document = new BasicDBObject();
        document.put("id", usuario.getId());
        document.put("nombre", usuario.getNombre());
        document.put("primerApellido", usuario.getPrimerApellido());
        document.put("segundoApellido", usuario.getSegundoApellido());
        document.put("telefono", usuario.getTelefono());
        document.put("correo", usuario.getCorreo());
        document.put("fechaNacimiento", usuario.getFechaNacimiento());
        document.put("nombreUsuario", usuario.getNombreUsuario());
        document.put("clave", usuario.getClave());
        document.put("tipoMusica", usuario.getTipoMusica());
 
        table.insert(document);
    }
	
	 private static MongoClient crearConexion() {
	        MongoClient mongo = null;
	        try {
	            mongo = new MongoClient("localhost", 27017);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return mongo;
	   }
	 
	
	
}
