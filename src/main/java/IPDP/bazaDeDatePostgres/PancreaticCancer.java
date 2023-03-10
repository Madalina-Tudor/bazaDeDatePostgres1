package IPDP.bazaDeDatePostgres;

//TIS IS THE ENTITY CLASS

/*This class represents a row in the Pancreatic_Cancer
 table, with sample_id, .....*/
/* the @Entity and @Table annotations  indicate that this class is a JPA entity
that maps to the "Pancreatic_Cancer" table in the database.*/


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "pancreatic_cancer",schema = "public")
public class PancreaticCancer {
    private String metadata;
    @Id  // primary key is  "sample_id"
   // @Column(name = "sample_id")
    private String sampleId;

  //  @Column(name = "patient_cohort")
    private String patientCohort;

   // @Column(name = "sample_origin")
    private String sampleOrigin;

    private String age;

    private String sex;

    private String diagnosis;

    private String stage;

   // @Column(name = "benign_sample_diagnosis")
    private String benignSampleDiagnosis;

   // @Column(name = "plasma_CA19_9")
    private String plasma_CA19_9;

    private String creatinine;

    private String LYVE1;

    private String REG1B;

    private String TFF1;

    private String REG1A;


    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getPatientCohort() {
        return patientCohort;
    }

    public void setPatientCohort(String patientCohort) {
        this.patientCohort = patientCohort;
    }

    public String getSampleOrigin() {
        return sampleOrigin;
    }

    public void setSampleOrigin(String sampleOrigin) {
        this.sampleOrigin = sampleOrigin;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getBenignSampleDiagnosis() {
        return benignSampleDiagnosis;
    }

    public void setBenignSampleDiagnosis(String benignSampleDiagnosis) {
        this.benignSampleDiagnosis = benignSampleDiagnosis;
    }

    public String getPlasma_CA19_9() {
        return plasma_CA19_9;
    }

    public void setPlasma_CA19_9(String plasmaCA199) {
        this.plasma_CA19_9 = plasmaCA199;
    }

    public String getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(String creatinine) {
        this.creatinine = creatinine;
    }

    public String getLYVE1() {
        return LYVE1;
    }

    public void setLYVE1(String LYVE1) {
        this.LYVE1 = LYVE1;
    }

    public String getREG1B() {
        return REG1B;
    }

    public void setREG1B(String REG1B) {
        this.REG1B = REG1B;
    }

    public String getTFF1() {
        return TFF1;
    }

    public void setTFF1(String TFF1) {
        this.TFF1 = TFF1;
    }

    public String getREG1A() {
        return REG1A;
    }
    public PancreaticCancer() {}

    public PancreaticCancer(String metadata, String sampleId, String patientCohort, String sampleOrigin, String age, String sex,
                            String diagnosis, String stage, String benignSampleDiagnosis, String plasmaCA199,
                            String creatinine, String LYVE1, String REG1B, String TFF1, String REG1A) {
        this.metadata=metadata;
        this.sampleId = sampleId;
        this.patientCohort = patientCohort;
        this.sampleOrigin = sampleOrigin;
        this.age = age;
        this.sex = sex;
        this.diagnosis = diagnosis;
        this.stage = stage;
        this.benignSampleDiagnosis = benignSampleDiagnosis;
        this.plasma_CA19_9 = plasmaCA199;
        this.creatinine = creatinine;
        this.LYVE1 = LYVE1;
        this.REG1B = REG1B;
        this.TFF1 = TFF1;
        this.REG1A = REG1A;
    }

    // pt sample ID-ca e key

    @Override
    public int hashCode() {
        return Objects.hash(sampleId, patientCohort, sampleOrigin, age, sex, diagnosis, stage, benignSampleDiagnosis, plasma_CA19_9, creatinine, LYVE1, REG1B, TFF1, REG1A);
    }
    @Override
    public String toString() {
        return "PancreaticCancer{" +
                "sampleId='" + sampleId + '\'' +
                ", patientCohort='" + patientCohort + '\'' +
                ", sampleOrigin='" + sampleOrigin + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", stage='" + stage + '\'' +
                ", benignSampleDiagnosis='" + benignSampleDiagnosis + '\'' +
                ", plasmaCA199=" + plasma_CA19_9 +
                ", creatinine=" + creatinine +
                ", LYVE1=" + LYVE1 +
                ", REG1B=" + REG1B +
                ", TFF1=" + TFF1 +
                ", REG1A=" + REG1A +
                '}';
    }






}// end_class

// Add getters and setters for the fields
    //

    // Add a constructor that takes in all the fields as arguments
    // ...

    // Add a no-argument constructor (required by JPA)


    // Add a toString() method for debugging
    // ...

/*This entity class represents a row in the Pancreatic_Cancer table in the database,
with each instance of this class representing a single row of data in the table.
The fields of the class represent the columns of the table, and the @Entity and @Table annotations indicate
that this class is a JPA entity that maps to the Pancreatic_Cancer table in the database.*/