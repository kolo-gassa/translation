package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings( "serial" )
public class User implements Serializable {

    private Long               idUser;
    private String             userName;
    private String             password;
    private boolean            state;
    private Collection<Role>   userRoles;
    private Collection<Profil> profils;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User( String userName, String password, boolean state ) {
        super();
        this.userName = userName;
        this.password = password;
        this.state = state;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser( Long idUser ) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public boolean isState() {
        return state;
    }

    public void setState( boolean state ) {
        this.state = state;
    }

    public Collection<Role> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles( Collection<Role> userRoles ) {
        this.userRoles = userRoles;
    }

    public Collection<Profil> getProfils() {
        return profils;
    }

    public void setProfils( Collection<Profil> profils ) {
        this.profils = profils;
    }

}
