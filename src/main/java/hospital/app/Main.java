package hospital.app;

import hospital.app.model.repository.db.DatabaseMaker;

public class Main {
    public static void main(String[] args) throws Exception {
        DatabaseMaker.createDatabase();
    }
}