package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	
	public String realizarLogin(){
		if (usuario.getUsuario().equals("admin") && usuario.getSenha().equals("123")) {
			return "/index.xhtml?faces-redirect=true";
		} else {
			//Mostrar Mensagem
		}
		
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
