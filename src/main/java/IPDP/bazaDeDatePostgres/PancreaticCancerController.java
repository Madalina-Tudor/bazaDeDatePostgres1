package IPDP.bazaDeDatePostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pancreatic_cancer")
public class PancreaticCancerController {



    @Autowired
    private final PancreaticCancerRepository pancreaticCancerRepository;

    public PancreaticCancerController(PancreaticCancerRepository pancreaticCancerRepository) {
        this.pancreaticCancerRepository = pancreaticCancerRepository;
    }

    @GetMapping
    public ResponseEntity getAllPancreaticCancer()
    {
        return ResponseEntity.ok(this.pancreaticCancerRepository.findAll());
    }
//
//    @GetMapping("/{sample_id}")
//    public ResponseEntity<PancreaticCancer> findById(@PathVariable String id) {
//        Optional<PancreaticCancer> pancreaticCancer = pancreaticCancerRepository.findById(id);
//        return pancreaticCancer.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
//    @GetMapping
//    public List<PancreaticCancer> findAll() {
//        return pancreaticCancerRepository.findAll();
//    }
//
//    @PostMapping
//    public PancreaticCancer create(@RequestBody PancreaticCancer pancreaticCancer) {
//        return pancreaticCancerRepository.save(pancreaticCancer);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PancreaticCancer> update(@PathVariable String id, @RequestBody PancreaticCancer pancreaticCancer) {
//        Optional<PancreaticCancer> existingPancreaticCancer = pancreaticCancerRepository.findById(id);
//        if (existingPancreaticCancer.isPresent()) {
//            pancreaticCancer.setSampleId(id);
//            pancreaticCancerRepository.save(pancreaticCancer);
//            return ResponseEntity.ok(pancreaticCancer);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable String id) {
//        Optional<PancreaticCancer> pancreaticCancer = pancreaticCancerRepository.findById(id);
//        if (pancreaticCancer.isPresent()) {
//            pancreaticCancerRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
