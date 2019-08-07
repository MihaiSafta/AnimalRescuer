package persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalRepository {

    public void createAnimal() throws SQLException, IOException, ClassNotFoundException {
        String insertSql = "INSERT INTO animal_rescuer_db(name,age, healthlevel, foodlevel, happyness, favouritefood,favouritesport, color,furrtype,temper,weight) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        // try with resources
        try(Connection connection = DatabaseConfiguration.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql)){
         preparedStatement.setString(1,name);
         preparedStatement.setInt(2,age);
        preparedStatement.executeUpdate();
        }
    }


}
