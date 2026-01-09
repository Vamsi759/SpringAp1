package demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entity.Person1;

@Repository
public interface Person1Repo extends JpaRepository<Person1,Long>{

}
