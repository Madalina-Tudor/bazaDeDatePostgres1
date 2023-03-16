package IPDP.bazaDeDatePostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.*;

@RestController
@RequestMapping("")
public class PancreaticCancerController {
    @Autowired
    private PancreaticCancerService pancreaticCancerService;

    @GetMapping("/get_data")
    public String getAllPancreaticCancer(@RequestParam("data_type") String dataType
            , @RequestParam("snippet") Boolean snippet)
    {
        return pancreaticCancerService.getJSONLd(snippet);
    }

    @GetMapping("/put_data")
    public void saveData() throws IOException {
        ArrayList<PancreaticCancer> pancreaticCancerArrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data-1678080671318.csv"));
        String line = "";
        String[] props = null;
        while((line = bufferedReader.readLine())!= null)
        {
            props = line.split(",");
            PancreaticCancer pancreaticCancer = new PancreaticCancer(props[0],props[1],props[2],props[3],props[4]
                    ,props[5],props[6],props[7],props[8],props[9],props[10],props[11],props[12],props[13],props[14]);
            pancreaticCancerArrayList.add(pancreaticCancer);
        }
        bufferedReader.close();

        //pancreaticCancerRepository.saveAll(pancreaticCancerArrayList);
        //this.pancreaticCancerRepository.saveAll(new ArrayList<PancreaticCancer>());
                //luat date, pus cu saveAll -> descjid app si pun endpoint ul asta
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
