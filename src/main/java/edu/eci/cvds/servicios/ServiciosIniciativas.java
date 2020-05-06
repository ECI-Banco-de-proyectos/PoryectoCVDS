package edu.eci.cvds.servicios;

import java.sql.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.persistencia.DAOIniciativa;

public interface ServiciosIniciativas {

	public DAOIniciativa buscarIniciativas(String clave);

	public List<Usuario> consultarUsuariosPorContraseña(String contraseña);
	
	public Usuario consultarUsuarioPorId(int id); 
	
	public List<Usuario> consultarUsuarios();
	
	public void insertarUsuario(String contraseña, String nombre, TipoRol rol);
	
	public void actualizarPerfil(int id, TipoRol tipoRol);

	public void actualizarIniciativa(EstadoIniciativa estado, int id);
	
	public void insertarIniciativa(int id, int usuario, String nombre, EstadoIniciativa estado, int votos, Date fecha, String descripcion);
	
	public List<Iniciativa> consultarIniciativas();
	
	public List<Iniciativa> consultarIniciativasPalabraClave(String word);

	public List<Iniciativa> ordenandoIniciativas(String columnaSeleccionada);

	public void insertarReacciones (int idIni,String nombre, String comentario, Date fecha);
	
	public void actualizarIniciativasVotos (int id, int voto);

	public List<AreaIniciativa> selectAreaIniciativa();
	
}
