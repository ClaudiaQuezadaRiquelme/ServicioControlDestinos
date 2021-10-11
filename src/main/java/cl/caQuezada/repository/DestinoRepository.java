package cl.caQuezada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.caQuezada.model.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}
