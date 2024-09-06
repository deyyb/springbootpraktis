package com.praktis.seiyuuGame.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.Seiyuu;

@Repository
public interface SeiyuuRepo extends JpaRepository<Seiyuu, Integer> {

    @Query("SELECT s FROM Seiyuu s WHERE s.seiyuuName LIKE %:seiyuuName%")
    List<Seiyuu> findBySeiyuuName(@Param("seiyuuName") String seiyuuName);
}
