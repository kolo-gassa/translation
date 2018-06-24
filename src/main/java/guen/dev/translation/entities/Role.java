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
@Table( name = "role" )
public class Role implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long   idRole;
    @NotEmpty
    @Size( min = 4, max = 15 )
    private String nomRole;

    public Role() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Role( String nomRole ) {
        super();
        this.nomRole = nomRole;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole( Long idRole ) {
        this.idRole = idRole;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole( String nomRole ) {
        this.nomRole = nomRole;
    }

}
