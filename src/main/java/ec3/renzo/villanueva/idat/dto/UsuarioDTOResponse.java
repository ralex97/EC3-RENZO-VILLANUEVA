package ec3.renzo.villanueva.idat.dto;

public class UsuarioDTOResponse {
  
  private String token;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UsuarioDTOResponse(String token) {
    super();
    this.token = token;
  }

  public UsuarioDTOResponse() {
    super();
  }
}
