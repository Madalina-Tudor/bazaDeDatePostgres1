package IPDP.bazaDeDatePostgres;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;


public class JsonLDparser {
    private String schema;
    private String metadataIdentifier;


    public ArrayList<PancreaticCancer> listOfPancreaticCancer;

   public JsonLDparser(){
       schema = "PostgreSQL";
       metadataIdentifier = "pancreatic_cancer";
       listOfPancreaticCancer = new ArrayList<>();
   }
   public void GenerateJSONLD(){
       String jsonLD = this.GenerateJsonLDbody();
       File jsonLDFile = new File("jsonLD.json");

       try {
           jsonLDFile.createNewFile();
           FileWriter fileWriter = new FileWriter("jsonLD.json");
           fileWriter.write(jsonLD);
           fileWriter.close();
       }catch (IOException ex){
           ex.printStackTrace();
       }
   }

   public String GenerateJsonLDbody()
   {
        readFunction();
        ArrayList<String> pancreaticCancerData = new ArrayList<>();
       for(PancreaticCancer pancreaticCancer: listOfPancreaticCancer)
       {
           pancreaticCancerData.add(pancreaticCancer.toString());
       }
       String JsonLD = String.format("{\"@context\":" +
               "{\"@schema\":\"%s\"}," +
               "\"@type\": \"%s\"," +
               "\"@list\":%s}" ,schema,metadataIdentifier, pancreaticCancerData);
       return JsonLD;
   }
   private String[] GetData() {
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create("http://localhost:8080/pancreatic_cancer"))
               .build();
       String response = null;
       try {
           response = client.send(request, HttpResponse.BodyHandlers.ofString()).body().toString();
       } catch (Exception ex) {
           ex.printStackTrace();
       }
       return response.split("(?<=},)");
   }
   private String[] FormatResults(String[] results)
   {
       results[0] = results[0].substring(1);
       StringBuilder stringBuilder = new StringBuilder(results[results.length-1]);
       stringBuilder.deleteCharAt(results[results.length-1].length()-1);
       results[results.length-1] = stringBuilder.toString();
       for(int i=0;i< results.length-1;i++)
       {
           if(results[i].endsWith(","))
               results[i] = results[i].substring(0,results[i].length()-1);
       }
       return results;
   }
   public void readFunction() {
       String[] results = this.GetData();
       results = this.FormatResults(results);
       for (String result : results) {
          JSONObject data = new JSONObject(result);
           PancreaticCancer patient = new PancreaticCancer(data.get("metadata").toString(),data.get("sampleId").toString()
                   ,data.get("patientCohort").toString(),data.get("sampleOrigin").toString(),data.get("age").toString()
                   ,data.get("sex").toString(),data.get("diagnosis").toString(),data.get("stage").toString()
                   ,data.get("benignSampleDiagnosis").toString(),data.get("plasma_CA19_9").toString()
                   ,data.get("creatinine").toString(),data.get("lyve1").toString(),data.get("reg1B").toString()
                   ,data.get("tff1").toString(),data.get("reg1A").toString());
           listOfPancreaticCancer.add(patient);
       }
   }

}