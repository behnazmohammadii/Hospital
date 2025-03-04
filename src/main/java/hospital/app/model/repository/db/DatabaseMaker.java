package hospital.app.model.repository.db;


import hospital.app.model.repository.utils.ConnectionProvider;

import java.io.File;
import java.util.Scanner;

public class DatabaseMaker {
    public static void createDatabase() throws Exception {
        File file = new File("./src/main/java/hospital/app/model/repository/db/hospital_db.sql");

        Scanner scanner = new Scanner(file);
        String lines = "";
        while(scanner.hasNextLine()) {
            lines += scanner.nextLine();
        }

        for (String sqlCommand : lines.split(";")) {
            ConnectionProvider.getConnectionProvider().getConnection().prepareStatement(sqlCommand).execute();
        }

    }
}
