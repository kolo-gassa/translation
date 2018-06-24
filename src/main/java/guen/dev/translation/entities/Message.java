package guen.dev.translation.entities;

import java.io.Serializable;

@SuppressWarnings( "serial" )
public class Message implements Serializable {

    private Long    idMessage;
    private String  contenuMessage;
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
