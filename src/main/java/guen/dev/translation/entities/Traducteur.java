package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "traducteur" )
public class Traducteur implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long                idTraducteur;
    @NotEmpty
    @Size( min = 2, max = 25 )
    private String              nomTraducteur;
    @NotEmpty
    @Size( min = 2, max = 25 )
    private String              prenomTraducteur;
    @NotEmpty
    @Size( min = 2, max = 25 )
    private String              emailTraducteur;
    private String              telephoneTraducteur;
    @NotEmpty
    @Size( min = 12, max = 120 )
    private String              biographie;
    @Lob
    private byte[]              photo;
    private String              nomPhoto;
    @ManyToMany
    @JoinTable( name = "trad_lang", joinColumns = @JoinColumn( name = "traducteurId", referencedColumnName = "idTraducteur" ), inverseJoinColumns = @JoinColumn( name = "langueId", referencedColumnName = "idLangue" ) )
    private Collection<Langue>  langues;
    @OneToMany( mappedBy = "traducteur" )
    private Collection<Service> services;
    @OneToOne
    @JoinColumn( name = "trad_profil", referencedColumnName = "idProfil" )
    private Profil              profil;

    public Traducteur() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Traducteur( String nomTraducteur, String prenomTraducteur, String emailTraducteur,
            String telephoneTraducteur ) {
        super();
        this.nomTraducteur = nomTraducteur;
        this.prenomTraducteur = prenomTraducteur;
        this.emailTraducteur = emailTraducteur;
        this.telephoneTraducteur = telephoneTraducteur;
    }

    public Long getIdTraducteur() {
        return idTraducteur;
    }

    public void setIdTraducteur( Long idTraducteur ) {
        this.idTraducteur = idTraducteur;
    }

    public String getNomTraducteur() {
        return nomTraducteur;
    }

    public void setNomTraducteur( String nomTraducteur ) {
        this.nomTraducteur = nomTraducteur;
    }

    public String getPrenomTraducteur() {
        return prenomTraducteur;
    }

    public void setPrenomTraducteur( String prenomTraducteur ) {
        this.prenomTraducteur = prenomTraducteur;
    }

    public String getEmailTraducteur() {
        return emailTraducteur;
    }

    public void setEmailTraducteur( String emailTraducteur ) {
        this.emailTraducteur = emailTraducteur;
    }

    public String getTelephoneTraducteur() {
        return telephoneTraducteur;
    }

    public void setTelephoneTraducteur( String telephoneTraducteur ) {
        this.telephoneTraducteur = telephoneTraducteur;
    }

    public String getBiographie() {
        return biographie;
    }

    public void setBiographie( String biographie ) {
        this.biographie = biographie;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto( byte[] photo ) {
        this.photo = photo;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto( String nomPhoto ) {
        this.nomPhoto = nomPhoto;
    }

    public Collection<Langue> getLangues() {
        return langues;
    }

    public void setLangues( Collection<Langue> langues ) {
        this.langues = langues;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setServices( Collection<Service> services ) {
        this.services = services;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil( Profil profil ) {
        this.profil = profil;
    }

}
