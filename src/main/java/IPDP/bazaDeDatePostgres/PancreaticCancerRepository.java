package IPDP.bazaDeDatePostgres;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*methods for performing CRUD (create, read, update, delete) operations on the entity*/

public interface PancreaticCancerRepository extends JpaRepository<PancreaticCancer, String> {

    // find all samples with a given diagnosis
    List<PancreaticCancer> findByDiagnosis(String status);



}






/*By extending JpaRepository, you inherit several methods, such as save,
findAll, findById, delete, and many more.

You don't need to implement these methods yourself because they are already implemented by Spring Data JPA.
You can simply use them in your service layer.

The PancreaticCancerRepository interface is generic and takes two type parameters:
 the first is the entity class (PancreaticCancer)
and the second is the type of the primary key of the entity (String in this case).
*/