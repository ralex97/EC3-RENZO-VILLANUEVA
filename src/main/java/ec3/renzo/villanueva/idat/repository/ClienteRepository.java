package ec3.renzo.villanueva.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3.renzo.villanueva.idat.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
  
}
