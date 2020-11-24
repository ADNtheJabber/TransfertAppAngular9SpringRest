package sn.transfert.transfertRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.transfert.transfertRest.domaine.Client;

public interface IClient extends JpaRepository<Client, Integer>{

}
