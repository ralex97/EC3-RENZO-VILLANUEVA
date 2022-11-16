package ec3.renzo.villanueva.idat.services;

import java.util.List;

import ec3.renzo.villanueva.idat.models.Cliente;

public interface ClienteService {
  
  void guardar(Cliente cliente);
  void actualizar(Cliente cliente);
  void eliminar(Integer id);
  List<Cliente> listar();
  Cliente obtener(Integer id);
}
