package ec3.renzo.villanueva.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3.renzo.villanueva.idat.models.UsuarioCliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente,Integer> {
  
  UsuarioCliente findByUsuario(String usuario);
}
