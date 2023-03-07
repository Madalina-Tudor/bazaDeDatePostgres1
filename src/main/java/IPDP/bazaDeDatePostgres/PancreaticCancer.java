package IPDP.bazaDeDatePostgres;

//TIS IS THE ENTITY CLASS

/*This class represents a row in the Pancreatic_Cancer
 table, with sample_id, .....*/
/* the @Entity and @Table annotations  indicate that this class is a JPA entity
that maps to the "Pancreatic_Cancer" table in the database.*/


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
//@Table(name = "pancreatic_cancer")
public class PancreaticCancer {

    @Id  // primary key is  "sample_id"
   // @Column(name = "sample_id")
    private String sampleId;

  //  @Column(name = "patient_cohort")
    private String patientCohort;

   // @Column(name = "sample_origin")
    private String sampleOrigin;

    private int age;

    private String sex;

    private String diagnosis;

    private String stage;

   // @Column(name = "benign_sample_diagnosis")
    private String benignSampleDiagnosis;

   // @Column(name = "plasma_CA19_9")
    private double plasmaCA199;

    private double creatinine;

    private double LYVE1;

    private double REG1B;

    private double TFF1;

    private double REG1A;



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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public double getPlasmaCA199() {
        return plasmaCA199;
    }

    public void setPlasmaCA199(double plasmaCA199) {
        this.plasmaCA199 = plasmaCA199;
    }

    public double getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(double creatinine) {
        this.creatinine = creatinine;
    }

    public double getLYVE1() {
        return LYVE1;
    }

    public void setLYVE1(double LYVE1) {
        this.LYVE1 = LYVE1;
    }

    public double getREG1B() {
        return REG1B;
    }

    public void setREG1B(double REG1B) {
        this.REG1B = REG1B;
    }

    public double getTFF1() {
        return TFF1;
    }

    public void setTFF1(double TFF1) {
        this.TFF1 = TFF1;
    }

    public double getREG1A() {
        return REG1A;
    }
    public PancreaticCancer() {}

    public PancreaticCancer(String sampleId, String patientCohort, String sampleOrigin, int age, String sex,
                            String diagnosis, String stage, String benignSampleDiagnosis, double plasmaCA199,
                            double creatinine, double LYVE1, double REG1B, double TFF1, double REG1A) {
        this.sampleId = sampleId;
        this.patientCohort = patientCohort;
        this.sampleOrigin = sampleOrigin;
        this.age = age;
        this.sex = sex;
        this.diagnosis = diagnosis;
        this.stage = stage;
        this.benignSampleDiagnosis = benignSampleDiagnosis;
        this.plasmaCA199 = plasmaCA199;
        this.creatinine = creatinine;
        this.LYVE1 = LYVE1;
        this.REG1B = REG1B;
        this.TFF1 = TFF1;
        this.REG1A = REG1A;
    }

    // pt sample ID-ca e keye
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PancreaticCancer that = (PancreaticCancer) o;
        return age == that.age && Double.compare(that.plasmaCA199, plasmaCA199) == 0 && Double.compare(that.creatinine, creatinine) == 0 && Double.compare(that.LYVE1, LYVE1) == 0 && Double.compare(that.REG1B, REG1B) == 0 && Double.compare(that.TFF1, TFF1) == 0 && Double.compare(that.REG1A, REG1A) == 0 && Objects.equals(sampleId, that.sampleId) && Objects.equals(patientCohort, that.patientCohort) && Objects.equals(sampleOrigin, that.sampleOrigin) && Objects.equals(sex, that.sex) && Objects.equals(diagnosis, that.diagnosis) && Objects.equals(stage, that.stage) && Objects.equals(benignSampleDiagnosis, that.benignSampleDiagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleId, patientCohort, sampleOrigin, age, sex, diagnosis, stage, benignSampleDiagnosis, plasmaCA199, creatinine, LYVE1, REG1B, TFF1, REG1A);
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
                ", plasmaCA199=" + plasmaCA199 +
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