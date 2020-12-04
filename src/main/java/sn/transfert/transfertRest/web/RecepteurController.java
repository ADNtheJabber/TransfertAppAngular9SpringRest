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

import sn.transfert.transfertRest.dao.IRecepteur;
import sn.transfert.transfertRest.domaine.Recepteur;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/")
public class RecepteurController {
	
	@Autowired
    private IRecepteur recepteurRepository;
	
    @GetMapping("/recepteurs")
    public List<Recepteur> listAll() {
        return recepteurRepository.findAll();
    }

    @GetMapping("/recepteurs/{id}")
    public Recepteur getRecepteur(@PathVariable int id) {
		return null;   
    }

    @PostMapping("/recepteurs")
    public Recepteur createRecepteur(@RequestBody Recepteur recepteur) {
        Recepteur savedRecepteur = recepteurRepository.save(recepteur);
		return savedRecepteur;
    }

    @DeleteMapping("/recepteurs/{id}")
    public void deleteRecepteur(@PathVariable int id) {
        recepteurRepository.deleteById(id);
    }
}