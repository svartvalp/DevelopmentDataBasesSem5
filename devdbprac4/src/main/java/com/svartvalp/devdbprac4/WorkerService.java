package com.svartvalp.devdbprac4;

import java.util.List;

public interface WorkerService {
    void createOrUpdateWorker(Worker worker);
    void deleteWorkerById(Long id);
    List<Worker> getAllWorkers();
}
