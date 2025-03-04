package hospital.app.model.service;

import hospital.app.model.entity.Doctor;
import hospital.app.model.repository.DoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorService implements Service<Doctor, Integer> {
    @Override
    public void save(Doctor doctor) throws Exception {
        try(DoctorRepository repository = new DoctorRepository()) {
            repository.save(doctor);
        }
    }

    @Override
    public void edit(Doctor doctor) throws Exception {

    }

    @Override
    public void remove(Integer id) throws Exception {

    }

    @Override
    public List<Doctor> findAll() throws Exception {
        return Collections.emptyList();
    }

    @Override
    public Doctor findById(Integer id) throws Exception {
        return null;
    }
}
