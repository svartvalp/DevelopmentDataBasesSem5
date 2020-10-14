package com.svartvalp.devdbprac4;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ManufactureDao extends Neo4jRepository<Manufacture, Long> {
    Manufacture findByName(String name);
}
