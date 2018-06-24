package guen.dev.translation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "message" )
public class Message implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long    idMessage;
    @NotEmpty
    @Size( min = 15, max = 250 )
    private String  contenuMessage;
    @ManyToOne
    @JoinColumn( name = "idContrat" )
    private Contrat contrat;

    public Message() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Message( String contenuMessage ) {
        super();
        this.contenuMessage = contenuMessage;
    }

    public Long getIdMessage() {
        return idMessage;
    }

    public void setIdMessage( Long idMessage ) {
        this.idMessage = idMessage;
    }

    public String getContenuMessage() {
        return contenuMessage;
    }

    public void setContenuMessage( String contenuMessage ) {
        this.contenuMessage = contenuMessage;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat( Contrat contrat ) {
        this.contrat = contrat;
    }

}
