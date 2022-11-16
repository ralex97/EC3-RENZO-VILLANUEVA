package ec3.renzo.villanueva.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec3.renzo.villanueva.idat.models.UsuarioCliente;
import ec3.renzo.villanueva.idat.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

  @Autowired
  private UsuarioClienteRepository repository;

  @Override
  public void guardar(UsuarioCliente usuarioCliente) {
    repository.save(usuarioCliente);
  }

  @Override
  public void actualizar(UsuarioCliente usuarioCliente) {
    repository.saveAndFlush(usuarioCliente);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }

  @Override
  public List<UsuarioCliente> listar() {
    return repository.findAll();
  }

  @Override
  public UsuarioCliente obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }

}
