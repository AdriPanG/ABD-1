package abd.p1.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import abd.p1.model.Contacto;
import abd.p1.model.Usuario;

public class DAOListaUsuarios {
	private SessionFactory sf;
	
	public DAOListaUsuarios(SessionFactory sf) {
		this.sf = sf;
	}

	public List<Usuario> getAllUsers() {
		Session sesion = this.sf.openSession();
		Query query = sesion.createQuery("From Usuario");
		List<Usuario> l = query.list();
		sesion.close();
		return l;
	}

	public List<Usuario> getAllUsersWithName(String name, Contacto contacto) {
		Session sesion = this.sf.openSession();
		Query query = sesion.createQuery("From Usuario As u WHERE u.nombre = :name AND (u.genero = :contacto OR :contacto2 = 2)");
		query.setString("name", name);
		query.setInteger("contacto", contacto.ordinal());
		query.setInteger("contacto2", contacto.ordinal());
		List<Usuario> l = query.list();
		sesion.close();
		return l;
	}

}
