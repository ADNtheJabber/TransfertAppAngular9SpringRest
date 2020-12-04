package sn.transfert.transfertRest.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.transfert.transfertRest.dao.IEmetteur;
import sn.transfert.transfertRest.domaine.Emetteur;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/")
public class EmetteurController {
	
		
	@Autowired
	private IEmetteur emetteurRepository;

    @GetMapping("/emetteurs")
    public List<Emetteur> listAll() {
        return emetteurRepository.findAll();
    }

    @GetMapping("/emetteurs/{id}")
    public Optional<Emetteur> getEmetteur(@PathVariable int id) {
		return emetteurRepository.findById(id);   
    }

    @PostMapping("/emetteurs")
    public Emetteur createEmetteur(@RequestBody Emetteur emetteur) {
        Emetteur savedEmetteur = emetteurRepository.save(emetteur);
		return savedEmetteur;
    }

    @DeleteMapping("/emetteurs/{id}")
    public void deleteEmetteur(@PathVariable int id) {
        emetteurRepository.deleteById(id);
    }
}