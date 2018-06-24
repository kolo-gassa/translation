package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings( "serial" )
public class Role implements Serializable {

    private Long             idRole;
    private String           nomRole;
    private Collection<User> users;

    public Role() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Role( String nomRole ) {
        super();
        this.nomRole = nomRole;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole( Long idRole ) {
        this.idRole = idRole;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole( String nomRole ) {
        this.nomRole = nomRole;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers( Collection<User> users ) {
        this.users = users;
    }

}
