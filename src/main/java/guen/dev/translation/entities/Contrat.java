package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings( "serial" )
public class Contrat implements Serializable {

    private Long                idContrat;
    private boolean             etatContrat;
    private Document            document;
    private Collection<Message> messages;
    private Service             service;

    public Contrat() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Contrat( boolean etatContrat ) {
        super();
        this.etatContrat = etatContrat;
    }

    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat( Long idContrat ) {
        this.idContrat = idContrat;
    }

    public boolean isEtatContrat() {
        return etatContrat;
    }

    public void setEtatContrat( boolean etatContrat ) {
        this.etatContrat = etatContrat;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument( Document document ) {
        this.document = document;
    }

    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages( Collection<Message> messages ) {
        this.messages = messages;
    }

    public Service getService() {
        return service;
    }

    public void setService( Service service ) {
        this.service = service;
    }

}
