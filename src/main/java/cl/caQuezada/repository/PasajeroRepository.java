package cl.caQuezada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.caQuezada.model.Pasajero;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {

}
