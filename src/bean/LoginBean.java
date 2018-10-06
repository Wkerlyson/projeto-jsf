package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Usuario;
import util.FacesUtil;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	
	public String realizarLogin(){
		if (usuario.getUsuario().equals("admin") && usuario.getSenha().equals("123")) {
			return "/usuarios.xhtml?faces-redirect=true";
		} else {
			FacesUtil.msgErro("Login Incorreto");
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
