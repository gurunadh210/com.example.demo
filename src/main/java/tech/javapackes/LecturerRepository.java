package tech.javapackes;


import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.stereotype.Repository;

@Repository
 public interface LecturerRepository extends MongoRepository<Lecturer, Integer> {

}
