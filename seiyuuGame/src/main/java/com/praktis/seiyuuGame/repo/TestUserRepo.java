package com.praktis.seiyuuGame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.TestUser;

@Repository
public interface TestUserRepo extends JpaRepository<TestUser, Integer> {
    
    // @Query("INSERT INTO testUser t (t.testUserName) VALUE (:testUserName)")
    // public void submitTestUser(@Param("testUserName") String testUserName);
}
