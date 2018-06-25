package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "user" )
public class User implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long               idUser;
    @NotEmpty
    @Size( min = 2, max = 25 )
    private String             userName;
    @NotEmpty
    @Size( min = 6, max = 25 )
    private String             password;
    private boolean            state;
    @OneToMany
    @JoinColumn( name = "idUser" )
    private Collection<Role>   userRoles;
    @OneToMany( mappedBy = "user" )
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
