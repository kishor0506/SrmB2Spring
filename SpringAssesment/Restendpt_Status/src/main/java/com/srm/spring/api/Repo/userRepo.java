package com.srm.spring.api.Repo;
import com.srm.spring.api.Entity.user;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepo extends JpaRepository<user, Long>{
    // @Query("SELECT u FROM user u WHERE u.id= 5")
	// List<user> findAll();
}
