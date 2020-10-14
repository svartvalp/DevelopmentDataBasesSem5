package com.svartvalp.devdbprac4;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/manufacture")
public class ManufactureController {
    private final ManufactureService manufactureService;

    @GetMapping(value = "")
    public Manufacture getManufacture() {
        return manufactureService.getManufacture();
    }
}
