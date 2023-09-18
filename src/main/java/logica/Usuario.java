
package logica;
import javax.persistence.*;
@Entity
@Table(name = "usuario") // El nombre de la tabla en tu base de datos
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contraseña")
    private String contraseña;
    private RolUsuario rol;
    private int adminId;
    private int clienteId;

    
    public Usuario() {
    }

    public enum RolUsuario {
        USUARIO_ADMINISTRADOR, USUARIO_NORMAL
    }
    
    public Usuario(long id, String nombre, String contraseña, RolUsuario rol, int adminId, int clienteId) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
        this.adminId = adminId;
        this.clienteId = clienteId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", contraseña=" + contraseña + ", rol=" + rol
                + ", adminId=" + adminId + ", clienteId=" + clienteId + "]";
    }


   
}

