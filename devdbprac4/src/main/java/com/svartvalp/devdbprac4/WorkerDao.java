package com.svartvalp.devdbprac4;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface WorkerDao extends Neo4jRepository<Worker, Long> {
    @Query("MATCH (man:Manufacture)<-[:worksIn]-(w:Worker) WHERE man.name=$manufactureName RETURN w")
    List<Worker> getAllWorkersFromManufacture(String manufactureName);
}
