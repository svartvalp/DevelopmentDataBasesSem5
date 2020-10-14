package com.svartvalp.devdbprac4;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/worker")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;


    @PostMapping(value = "")
    public void createOrUpdateWorker(@RequestBody Worker worker) {
        workerService.createOrUpdateWorker(worker);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteWorker(@PathVariable("id") Long id) {
        workerService.deleteWorkerById(id);
    }

    @GetMapping(value = "")
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

}
