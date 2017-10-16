package enterprise;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name="auction_Client")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private Long code_postal;
	@Column(unique=true)
	private String mail;
	
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Long getCode_postal() {
		return this.code_postal;
	}

	public void setCode_postal(Long code_postal) {
		this.code_postal = code_postal;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
   
}