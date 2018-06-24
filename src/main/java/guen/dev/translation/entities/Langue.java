package guen.dev.translation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings( "serial" )
@Entity
@Table( name = "langue" )
public class Langue implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long   idLangue;
    @NotEmpty
    @Size( min = 2, max = 15 )
    private String nomLangue;

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

}
