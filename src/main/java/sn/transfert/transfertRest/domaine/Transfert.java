package sn.transfert.transfertRest.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "transfert")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transfert implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "codeTransfert", nullable = false, length = 10)
	private String codeTransfert;
	
	@Column(name = "montant", nullable = false, length = 10)
	private Double montant;
	
	@Temporal(value = TemporalType.DATE)
	private Date date;
	
	@OneToMany(mappedBy = "id")
	private Client client;

}
