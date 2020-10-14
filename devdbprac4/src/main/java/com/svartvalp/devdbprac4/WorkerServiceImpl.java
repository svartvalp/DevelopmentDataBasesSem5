package com.svartvalp.devdbprac4;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerDao workerDao;
    private final ManufactureService manufactureService;

    @Override
    public void createOrUpdateWorker(Worker worker) {
        worker.setManufacture(manufactureService.getManufacture());
        workerDao.save(worker);
    }

    @Override
    public void deleteWorkerById(Long id) {
        workerDao.deleteById(id);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerDao.getAllWorkersFromManufacture(manufactureService.getManufacture().getName());
    }
}
