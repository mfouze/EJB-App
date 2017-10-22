package enterprise;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auction
 *
 */
@Entity
@Table(name="auctions")
public class Auction implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private int statut;
	@ManyToOne
	@JoinColumn(name="code_cli")
	private Client client;
	@ManyToOne
	@JoinColumn(name="code_objet")
	private Objet objet;
	@Column
	private float duree;
	@Column
	private float prix_depart;
	
	private static final long serialVersionUID = 1L;

	public Auction() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getStatut() {
		return this.statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}
   
}
