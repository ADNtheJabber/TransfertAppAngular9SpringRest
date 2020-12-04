package sn.transfert.transfertRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.transfert.transfertRest.domaine.Emetteur;

public interface IEmetteur extends JpaRepository<Emetteur, Integer>{

}
