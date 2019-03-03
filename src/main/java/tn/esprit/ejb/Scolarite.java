package tn.esprit.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class Scolarite
 */
@Stateless
@LocalBean//pour ne pas etre expose(locale)
@WebService (//on la met dans les deux classe
		//targetNamespace = "https://www.scolarite.tn",
		serviceName = "ScolariteService",
		endpointInterface = "tn.esprit.ejb.ScolariteRemote")
public class Scolarite implements ScolariteRemote {

    /**
     * Default constructor.
     */
    public Scolarite() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int inscrire(String cin, String nom, String prenom, String dateN, String adr, long numTel, String email) {
		// TODO Auto-generated method stub
		return 1234567;
	}

	@Override
	public String getEtatInscription() {
		// TODO Auto-generated method stub
		return "Inscrit";
	}

	@Override
	public float calculerFraisInscription(int numInscription) {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public List<Etudiant> getListEtudiant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getInfoEtudiant(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
