package ec3.renzo.villanueva.idat.services;

import java.util.List;

import ec3.renzo.villanueva.idat.models.UsuarioCliente;

public interface UsuarioClienteService {
  
  void guardar(UsuarioCliente usuarioCliente);
  void actualizar(UsuarioCliente usuarioCliente);
  void eliminar(Integer id);
  List<UsuarioCliente> listar();
  UsuarioCliente obtener(Integer id);
}
