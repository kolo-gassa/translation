package guen.dev.translation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "profil" )
public class Profil implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long       idProfil;
    @ManyToOne
    @JoinColumn( name = "idUser" )
    private User       user;
    @JoinColumn( name = "profil_trad", referencedColumnName = "idTraducteur" )
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
