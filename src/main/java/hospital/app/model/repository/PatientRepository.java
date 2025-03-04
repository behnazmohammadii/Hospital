package hospital.app.model.repository;

import hospital.app.model.entity.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.List;

public class PatientRepository implements Repository<Patient, Integer> {
    private Connection connection;
    private PreparedStatement preparedStatement;

    @Override
    public void save(Patient patient) throws Exception {

    }

    @Override
    public void edit(Patient patient) throws Exception {

    }

    @Override
    public void remove(Integer id) throws Exception {

    }

    @Override
    public List<Patient> findAll() throws Exception {
        return Collections.emptyList();
    }

    @Override
    public Patient findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
