package guen.dev.translation.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings( "serial" )
public class Langue implements Serializable {

    private Long                   idLangue;
    private String                 nomLangue;
    private Collection<Traducteur> traducteurs;

    public Langue() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Langue( String nomLangue ) {
        super();
        this.nomLangue = nomLangue;
    }

    public Long getIdLangue() {
        return idLangue;
    }

    public void setIdLangue( Long idLangue ) {
        this.idLangue = idLangue;
    }

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue( String nomLangue ) {
        this.nomLangue = nomLangue;
    }

    public Collection<Traducteur> getTraducteurs() {
        return traducteurs;
    }

    public void setTraducteurs( Collection<Traducteur> traducteurs ) {
        this.traducteurs = traducteurs;
    }

}
