package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings( "serial" )
public class Client implements Serializable {

    private Long                 idClient;
    private String               nomClient;
    private String               prenomClient;
    private String               emailClient;
    private String               telephoneClient;
    private Collection<Document> documents;

    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Client( String nomClient, String prenomClient,
            String emailClient, String telephoneClient ) {
        super();
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.telephoneClient = telephoneClient;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient( Long idClient ) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient( String nomClient ) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient( String prenomClient ) {
        this.prenomClient = prenomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient( String emailClient ) {
        this.emailClient = emailClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient( String telephoneClient ) {
        this.telephoneClient = telephoneClient;
    }

    public Collection<Document> getDocuments() {
        return documents;
    }

    public void setDocuments( Collection<Document> documents ) {
        this.documents = documents;
    }

}
