package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@SuppressWarnings( "serial" )
public class Service implements Serializable {

    private Long                idService;
    private String              titreService;
    private String              descriptionService;
    private Date                date;
    private double              prix;
    private Traducteur          traducteur;
    private Collection<Contrat> contrats;

    public Service() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Service( String titreService, String descriptionService, Date date, double prix ) {
        super();
        this.titreService = titreService;
        this.descriptionService = descriptionService;
        this.date = date;
        this.prix = prix;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService( Long idService ) {
        this.idService = idService;
    }

    public String getTitreService() {
        return titreService;
    }

    public void setTitreService( String titreService ) {
        this.titreService = titreService;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService( String descriptionService ) {
        this.descriptionService = descriptionService;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix( double prix ) {
        this.prix = prix;
    }

    public Traducteur getTraducteur() {
        return traducteur;
    }

    public void setTraducteur( Traducteur traducteur ) {
        this.traducteur = traducteur;
    }

    public Collection<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats( Collection<Contrat> contrats ) {
        this.contrats = contrats;
    }

}
