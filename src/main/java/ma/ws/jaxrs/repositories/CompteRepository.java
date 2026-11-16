package ma.ws.jaxrs.repositories;


import ma.ws.jaxrs.entitites.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}