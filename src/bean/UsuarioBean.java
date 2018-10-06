package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Usuario;
import util.FacesUtil;

@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios = new ArrayList<>();
	
	public void adicionarUsuario(){
		usuarios.add(usuario);
		usuario = new Usuario();
		FacesUtil.msgInfo("Usuário Adicionado");
	}
	
	
	public void mostrarSelecionado(Usuario user){
		usuario.setNome(user.getNome());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
