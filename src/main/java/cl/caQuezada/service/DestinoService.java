package cl.caQuezada.service;

import java.util.List;

import cl.caQuezada.model.Destino;

public interface DestinoService {

	void save(Destino direccion);
	List<Destino> findAll();
}
