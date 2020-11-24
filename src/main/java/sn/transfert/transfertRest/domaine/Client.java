package sn.transfert.transfertRest.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", nullable = false, length = 30)
	private String nom;

	@Column(name = "prenom", nullable = false, length = 30)
	private String prenom;
	
	@Column(name = "tel", nullable = false, length = 20)
	private String tel;
	
	@Column(name = "cni", nullable = true, length = 20)
	private int cni;

}
