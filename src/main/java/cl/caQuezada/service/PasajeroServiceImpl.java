package cl.caQuezada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.caQuezada.model.Pasajero;
import cl.caQuezada.repository.PasajeroRepository;

@Service
public class PasajeroServiceImpl implements PasajeroService {
	
	@Autowired
	private PasajeroRepository pasajeroRepository;

	@Override
	public void save(Pasajero pasajero) {
		pasajeroRepository.save(pasajero);
	}

	@Override
	public List<Pasajero> findAll() {
		return pasajeroRepository.findAll();
	}

}
