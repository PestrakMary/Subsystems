package by.iba.repository;

import by.iba.entity.SystemObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemObjectRepository extends CrudRepository<SystemObject, Long> {
}
