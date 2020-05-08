package edu.eci.cvds.samples.persistencia;

import java.sql.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.EstadoIniciativa;
import edu.eci.cvds.samples.entities.Iniciativa;

public interface DAOIniciativa {

	public void insertIniciativa(int id, int usuario, String nombre, EstadoIniciativa estado, int votos, Date fecha, String descripcion);

	public void cambiarIniciativa(EstadoIniciativa estado, int id);

	public DAOIniciativa claveIniciativa(String clave);

	public List<Iniciativa> selectIniciativa();

	public List<Iniciativa> ordenDeIniciativa(String columnaSeleccionada);


}
