package sn.transfert.transfertRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.transfert.transfertRest.domaine.Recepteur;

public interface IRecepteur extends JpaRepository<Recepteur, Integer>{

}
