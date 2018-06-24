package guen.dev.translation.entities;

import java.io.Serializable;

@SuppressWarnings( "serial" )
public class Profil implements Serializable {

    private Long       idProfil;
    private User       user;
    private Traducteur traducteur;

    public Profil() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil( Long idProfil ) {
        this.idProfil = idProfil;
    }

    public User getUser() {
        return user;
    }

    public void setUser( User user ) {
        this.user = user;
    }

    public Traducteur getTraducteur() {
        return traducteur;
    }

    public void setTraducteur( Traducteur traducteur ) {
        this.traducteur = traducteur;
    }

}
