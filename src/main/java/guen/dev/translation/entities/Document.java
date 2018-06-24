package guen.dev.translation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "document" )
public class Document implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long    idDocument;
    @NotEmpty
    @Size( min = 4, max = 20 )
    private String  nomDocument;
    private String  formatDocument;
    @ManyToOne
    @JoinColumn( name = "idClient" )
    private Client  client;
    @OneToOne
    @JoinColumn( name = "doc_contrat", referencedColumnName = "idContrat" )
    private Contrat contrat;

    public Document() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Document( String nomDocument, String formatDocument ) {
        super();
        this.nomDocument = nomDocument;
        this.formatDocument = formatDocument;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument( Long idDocument ) {
        this.idDocument = idDocument;
    }

    public String getNomDocument() {
        return nomDocument;
    }

    public void setNomDocument( String nomDocument ) {
        this.nomDocument = nomDocument;
    }

    public String getFormatDocument() {
        return formatDocument;
    }

    public void setFormatDocument( String formatDocument ) {
        this.formatDocument = formatDocument;
    }

    public Client getClient() {
        return client;
    }

    public void setClient( Client client ) {
        this.client = client;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat( Contrat contrat ) {
        this.contrat = contrat;
    }

}
