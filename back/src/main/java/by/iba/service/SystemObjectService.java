package by.iba.service;

import by.iba.entity.SystemObject;
import by.iba.repository.SystemObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SystemObjectService {

    private SystemObjectRepository repository;

    @Autowired
    public SystemObjectService(SystemObjectRepository repository){
        this.repository = repository;
    }

    public void add(SystemObject systemObject) {
        repository.save(systemObject);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<SystemObject> getAll() {
        List list = new ArrayList();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }
}
