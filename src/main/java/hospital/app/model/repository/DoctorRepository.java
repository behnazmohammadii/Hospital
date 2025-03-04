package hospital.app.model.repository;

import hospital.app.model.entity.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.List;

public class DoctorRepository implements Repository<Doctor, Integer> {
    private Connection connection;
    private PreparedStatement preparedStatement;

    @Override
    public void save(Doctor doctor) throws Exception {

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

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
