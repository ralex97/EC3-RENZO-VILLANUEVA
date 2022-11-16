package ec3.renzo.villanueva.idat.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {

  @Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		super.configure(resources);
	}

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/hospital/v1/**").permitAll()
      .antMatchers("/cliente/v1/**").permitAll()
      .antMatchers("/usuariocliente/v1/**").permitAll()
      .and()
      .exceptionHandling()
      .accessDeniedHandler(new OAuth2AccessDeniedHandler());
  }
}
