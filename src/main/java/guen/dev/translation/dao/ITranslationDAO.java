package guen.dev.translation.dao;

import java.util.List;

import guen.dev.translation.entities.Client;
import guen.dev.translation.entities.Contrat;
import guen.dev.translation.entities.Langue;
import guen.dev.translation.entities.Message;
import guen.dev.translation.entities.Profil;
import guen.dev.translation.entities.Role;
import guen.dev.translation.entities.Service;
import guen.dev.translation.entities.Traducteur;
import guen.dev.translation.entities.User;

public interface ITranslationDAO {

    public Long ajouterTraducteur( Traducteur t );

    public Traducteur getTraducteur( Long idTraducteur );

    public List<Traducteur> listeTraducteurs();

    public List<Traducteur> listeTraducteursParMC( String mc );

    public void supprimerTraducteur( Long idTraducteur );

    public void modifierTraducteur( Traducteur t );

    public Long creerService( Service s );

    public Service getService( Long idService );

    public void modifierService( Service s );

    public void supprimerService( Long idService );

    public List<Service> listeServices();

    public List<Service> listeServicesTraducteur( Long idTraducteur );

    public Long ajouterLangue( Langue l );

    public void supprimerLangue( Long idLangue );

    public Long ajouterUser( User u );

    public User getUser( Long idUser );

    public void supprimerUser( Long idUser );

    public void attribuerRole( Role r, Long idUser );

    public void enleverRole( Long idUser, Long idRole );

    public Long creerProfil( Profil p );

    public void supprimerProfil( Long idProfil );

    public void envoyerMessage( Message m );

    public void signerContrat( Contrat c, Long idClient, Long idTraducteur );

    public void validerContrat( Long idContrat );

    public Contrat getContrat( Long idContrat );

    public List<Contrat> listeContrats();

    public List<Contrat> listeContratsTraducteur( Long idTraducteur );

    public List<Contrat> listeContratsClient( Long idClient );

    public List<Contrat> listeContratsClientTraducteur( Long idClient, Long idTrad );

    public void annulerContrat( Long idContrat );

    public Long creerClient( Client c );

    public Client getClient( Long idClient );

    public List<Client> listeclient();

    public void modifierClient( Client c );

    public void supprimerClient( Long idClient );

}
