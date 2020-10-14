package com.svartvalp.devdbprac4;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@Data
@NodeEntity
public class Worker {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String email;
    @JsonIgnore
    @Relationship(type = "worksIn")
    private Manufacture manufacture;
}
