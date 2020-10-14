package com.svartvalp.devdbprac4;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Service
public class ManufactureService {

    private final ManufactureDao manufactureDao;
    private Manufacture manufacture;

    @Value("${neo4j.manufacture.name}")
    private String manufactureName;

    @PostConstruct
    public void init() {
        if ((manufacture = manufactureDao.findByName(manufactureName)) == null) {
            Manufacture manufacture = new Manufacture();
            manufacture.setName(manufactureName);
            this.manufacture = manufactureDao.save(manufacture);
        }
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

}
