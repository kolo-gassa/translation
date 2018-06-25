package guen.dev.translation.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import guen.dev.translation.entities.Client;
import guen.dev.translation.entities.Contrat;
import guen.dev.translation.entities.Langue;
import guen.dev.translation.entities.Message;
import guen.dev.translation.entities.Profil;
import guen.dev.translation.entities.Role;
import guen.dev.translation.entities.Service;
import guen.dev.translation.entities.Traducteur;
import guen.dev.translation.entities.User;

public class TranslationDaoImpl implements ITranslationDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Long ajouterTraducteur( Traducteur t ) {
        em.persist( t );
        return t.getIdTraducteur();
    }

    @Override
    public Traducteur getTraducteur( Long idTraducteur ) {
        return em.find( Traducteur.class, idTraducteur );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Traducteur> listeTraducteurs() {
        Query req = em.createQuery( "select t from Traducteur t" );
        return req.getResultList();
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Traducteur> listeTraducteursParMC( String mc ) {
        Query req = em.createQuery(
                "select t from Traducteur t where t.nomTraducteur like :x or t.prenomTraducteur like :x" );
        req.setParameter( "x", mc );
        return req.getResultList();
    }

    @Override
    public void supprimerTraducteur( Long idTraducteur ) {
        Traducteur t = em.find( Traducteur.class, idTraducteur );
        em.remove( t );
    }

    @Override
    public void modifierTraducteur( Traducteur t ) {
        em.merge( t );
    }

    @Override
    public Long creerService( Service s ) {
        em.persist( s );
        return s.getIdService();
    }

    @Override
    public Service getService( Long idService ) {
        return em.find( Service.class, idService );
    }

    @Override
    public void modifierService( Service s ) {
        em.merge( s );
    }

    @Override
    public void supprimerService( Long idService ) {
        Service s = em.find( Service.class, idService );
        em.remove( s );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Service> listeServices() {
        Query req = em.createQuery( "select s from Service s" );
        return req.getResultList();
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Service> listeServicesTraducteur( Long idTraducteur ) {
        Query req = em.createQuery(
                "select s from Service s where s.idTraducteur = :x" );
        req.setParameter( "x", idTraducteur );
        return req.getResultList();
    }

    @Override
    public Long ajouterLangue( Langue l ) {
        em.persist( l );
        return l.getIdLangue();
    }

    @Override
    public void supprimerLangue( Long idLangue ) {
        Langue l = em.find( Langue.class, idLangue );
        em.remove( l );
    }

    @Override
    public Long ajouterUser( User u ) {
        em.persist( u );
        return u.getIdUser();
    }

    @Override
    public User getUser( Long idUser ) {
        return em.find( User.class, idUser );
    }

    @Override
    public void supprimerUser( Long idUser ) {
        User u = em.find( User.class, idUser );
        em.remove( u );
    }

    @Override
    public Long creerProfil( Profil p ) {
        em.persist( p );
        return p.getIdProfil();
    }

    @Override
    public void supprimerProfil( Long idProfil ) {
        Profil p = em.find( Profil.class, idProfil );
        em.remove( p );
    }

    @Override
    public void validerContrat( Long idContrat ) {
        Contrat c = getContrat( idContrat );
        c.setEtatContrat( true );
    }

    @Override
    public Contrat getContrat( Long idContrat ) {
        return em.find( Contrat.class, idContrat );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Contrat> listeContrats() {
        Query req = em.createQuery( "select c from Contrat c" );
        return req.getResultList();
    }

    @Override
    public void annulerContrat( Long idContrat ) {
        Contrat c = em.find( Contrat.class, idContrat );
        em.remove( c );
    }

    @Override
    public Long creerClient( Client c ) {
        em.persist( c );
        return c.getIdClient();
    }

    @Override
    public Client getClient( Long idClient ) {
        return em.find( Client.class, idClient );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public List<Client> listeclient() {
        Query req = em.createQuery( "select c from Client c" );
        return req.getResultList();
    }

    @Override
    public void modifierClient( Client c ) {
        em.merge( c );
    }

    @Override
    public void supprimerClient( Long idClient ) {
        Client c = em.find( Client.class, idClient );
        em.remove( c );
    }

    @Override
    public void attribuerRole( Role r, Long idUser ) {
        User u = em.find( User.class, idUser );
        u.getUserRoles().add( r );
        em.persist( r );
    }

    @Override
    public void enleverRole( Long idUser, Long idRole ) {
        User u = em.find( User.class, idUser );
        Role r = em.find( Role.class, idRole );
        u.getUserRoles().remove( r );
        em.persist( r );
    }

    @Override
    public void envoyerMessage( Message m ) {
        em.persist( m );
    }

    @Override
    public List<Contrat> listeContratsTraducteur( Long idTraducteur ) {
        List<Contrat> listeContrats = new ArrayList<Contrat>();
        List<Service> listeServices = listeServicesTraducteur( idTraducteur );
        for ( Service s : listeServices ) {
            Query req = em.createQuery( "select c from Contrat c where c.idService=:x" );
            req.setParameter( "x", s.getIdService() );
            listeContrats.add( (Contrat) req.getResultList() );
        }

        return listeContrats;
    }

    // Méthodes encore non implémentées

    @Override
    public void signerContrat( Contrat c, Long idClient, Long idTraducteur ) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Contrat> listeContratsClient( Long idClient ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Contrat> listeContratsClientTraducteur( Long idClient, Long idTrad ) {
        // TODO Auto-generated method stub
        return null;
    }

}
