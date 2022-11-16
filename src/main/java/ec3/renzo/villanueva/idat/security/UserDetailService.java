package ec3.renzo.villanueva.idat.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ec3.renzo.villanueva.idat.models.UsuarioCliente;
import ec3.renzo.villanueva.idat.repository.UsuarioClienteRepository;

@Service
public class UserDetailService implements UserDetailsService{
  
  @Autowired
  private UsuarioClienteRepository repository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UsuarioCliente user = repository.findByUsuario(username);
    if(user != null){
      List<GrantedAuthority> listGranted = new ArrayList<>();
      GrantedAuthority granted = new SimpleGrantedAuthority(user.getRol());
      listGranted.add(granted);

      return new User(
        user.getUsuario(),
        user.getPassword(),
        listGranted
      );
    }else {
      throw new UsernameNotFoundException("Usuario no existe " + username);
    }
  }

}
