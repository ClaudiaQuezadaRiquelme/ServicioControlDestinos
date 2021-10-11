package cl.caQuezada.service;

import java.util.List;

import cl.caQuezada.model.Pasajero;

public interface PasajeroService {

	void save(Pasajero pasajero);
	List<Pasajero> findAll();
}
