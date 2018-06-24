package guen.dev.translation.entities;

import java.io.Serializable;

@SuppressWarnings( "serial" )
public class Document implements Serializable {

    private Long    idDocument;
    private String  nomDocument;
    private String  formatDocument;
    private Client  client;
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
