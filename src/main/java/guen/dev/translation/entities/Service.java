package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "service" )
public class Service implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long                idService;
    @NotEmpty
    @Size( min = 6, max = 25 )
    private String              titreService;
    @NotEmpty
    @Size( min = 12, max = 120 )
    private String              descriptionService;
    private Date                date;
    @NotEmpty
    private double              prix;
    @ManyToOne
    @JoinColumn( name = "idTraducteur" )
    private Traducteur          traducteur;
    @OneToMany( mappedBy = "service" )
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
