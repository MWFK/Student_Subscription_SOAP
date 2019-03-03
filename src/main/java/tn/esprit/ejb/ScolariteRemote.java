package tn.esprit.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Remote
@WebService (name = "scolaritePorType")//dans les deux classe
public interface ScolariteRemote {

	
	@WebResult(name = "numeroConfirmation")
	public int inscrire (@WebParam(name = "cin")String cin,
	@WebParam(name = "nom") String nom,
	@WebParam(name = "prenom")String prenom,
	@WebParam(name = "dateNaissance") String dateN,
	@WebParam(name = "adresse") String adr,
	@WebParam(name = "numTel") long numTel,
	@WebParam(name = "email") String email);
	@WebResult(name = "etat")
	
	public String getEtatInscription();
	@WebResult(name= "fraisInscription")
	
	public float calculerFraisInscription(@WebParam(name="numInscription") int numInscription);
	@WebResult(name = "etudiant")
	
	public List<Etudiant>getListEtudiant();
	@WebResult(name="infoEtudiant")
	
	public Etudiant getInfoEtudiant(@WebParam(name="numInscription")
	int num );
	
}
