package com.praktis.seiyuuGame.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praktis.seiyuuGame.entity.Characters;

@Repository
public interface CharactersRepo extends JpaRepository<Characters, Integer>{

    @Query("SELECT c FROM Characters c WHERE c.seiyuuId = :seiyuuId")
    List<Characters> findTheseSeiyuuIds(@Param("seiyuuId") int seiyuuId);
}
