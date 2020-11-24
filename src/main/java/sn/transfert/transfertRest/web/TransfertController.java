package sn.transfert.transfertRest.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.transfert.transfertRest.dao.IClient;
import sn.transfert.transfertRest.dao.ITransfert;
import sn.transfert.transfertRest.domaine.Transfert;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/")
public class TransfertController {
	
	@Autowired
    private ITransfert transfertRepository;
	
	@Autowired
	private IClient clientRepository;


    @GetMapping("/transferts")
    public List<Transfert> listAll() {
        return transfertRepository.findAll();
    }

    @GetMapping("/transferts/{id}")
    public Transfert getTransfert(@PathVariable int id) {
		return null;
        
    }

    @PostMapping("/transferts")
    public Transfert createTransfert(@RequestBody Transfert transfert) {
        Transfert savedTransfert = transfertRepository.save(transfert);
		return savedTransfert;
    }

    @DeleteMapping("/transferts/{id}")
    public void deleteTransfert(@PathVariable int id) {
        transfertRepository.deleteById(id);
    }
}