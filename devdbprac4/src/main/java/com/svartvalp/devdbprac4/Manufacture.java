package com.svartvalp.devdbprac4;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
public class Manufacture {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Relationship(type = "worksIn", direction = Relationship.INCOMING)
    private List<Worker> workers;
}
