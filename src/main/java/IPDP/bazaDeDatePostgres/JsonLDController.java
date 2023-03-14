package IPDP.bazaDeDatePostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/response")
public class JsonLDController {
      JsonLDparser jsonLDparser = new JsonLDparser();
//    @PostMapping("/postbody")
//    public String postBody(@RequestBody String fullName) {
//        return "post was successful";
//    }

    @GetMapping
    public String getMessage(){
        return jsonLDparser.GenerateJsonLDbody();
    }
}
