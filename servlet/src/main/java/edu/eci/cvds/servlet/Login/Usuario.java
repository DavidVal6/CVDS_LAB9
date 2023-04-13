package edu.eci.cvds.servlet.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
    @Id
    @Column(name = "USER")
    private String id;
    @Column(name = "PASSWORD")
    private  String password;

    public Usuario(){}

    public Usuario(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getId(), usuario.getId()) && Objects.equals(getPassword(), usuario.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPassword());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Usuario.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
