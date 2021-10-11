package cl.caQuezada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.caQuezada.model.Destino;
import cl.caQuezada.repository.DestinoRepository;

@Service
public class DestinoServiceImpl​ implements DestinoService {
	
	@Autowired
	private DestinoRepository destinoRepository;

	@Override
	public void save(Destino direccion) {
		destinoRepository.save(direccion);
	}

	@Override
	public List<Destino> findAll() {
		return destinoRepository.findAll();
	}

}
