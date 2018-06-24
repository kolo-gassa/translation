package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "contrat" )
public class Contrat implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long                idContrat;
    private boolean             etatContrat = false;
    @OneToOne
    @JoinColumn( name = "contrat_doc", referencedColumnName = "idDocument" )
    private Document            document;
    @OneToMany( mappedBy = "contrat" )
    private Collection<Message> messages;
    @ManyToOne
    @JoinColumn( name = "idService" )
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
