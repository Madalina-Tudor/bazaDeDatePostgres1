package IPDP.bazaDeDatePostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PancreaticCancerService {
    @Autowired
    private PancreaticCancerRepository pancreaticCancerRepository;

    public List<PancreaticCancer> getPancreaticCancer()
    {
        List<PancreaticCancer> responseEntity =  pancreaticCancerRepository.findAll();
        return responseEntity;
    }

    public String getJSONLd(Boolean snippet)
    {
        System.out.println("Executed");
        ArrayList<PancreaticCancer> dataList = new ArrayList<>();
        if(!snippet) {
            for(PancreaticCancer pancreaticCancer:this.getPancreaticCancer()) {
                int counter = 0;
                for(String prop: pancreaticCancer.getProperties()) {
                    if(prop.equals("NULL")) {
                        counter++;
                    }
                }
                if(counter<5){ //dinamic
                    dataList.add(pancreaticCancer);
                }
            }
        }else if(snippet){
            for(int i=0;i<20;i++)
            {
                int counter = 0;
                for(String prop: this.getPancreaticCancer().get(i).getProperties())
                {
                    if(prop.equals("NULL")){
                        counter++;
                    }
                }
                if(counter<5){
                    dataList.add(this.getPancreaticCancer().get(i));
                }
            }
        }
        String JsonLD = String.format("{\"@context\":" +
                "{\"@schema\":\"%s\"}," +
                "\"@list\":%s}" ,"PostgreSQL/Pancreatic_Cancer", dataList);
        return JsonLD;
    }



    //fctie pt conversie in json ld
    //call fc in controller
}
