package ec3.renzo.villanueva.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec3.renzo.villanueva.idat.models.Cliente;
import ec3.renzo.villanueva.idat.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  private ClienteRepository repository;

  @Override
  public void guardar(Cliente cliente) {
    repository.save(cliente);
  }

  @Override
  public void actualizar(Cliente cliente) {
    repository.saveAndFlush(cliente);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }

  @Override
  public List<Cliente> listar() {
    return repository.findAll();
  }

  @Override
  public Cliente obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }
}
