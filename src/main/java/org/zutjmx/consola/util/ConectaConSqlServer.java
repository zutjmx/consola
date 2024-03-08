package org.zutjmx.consola.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

@Service
public class ConectaConSqlServer {
    
    private final String connectionUrl = "jdbc:sqlserver://HUAWEI-ZUTJMX\\SQLEXPRESS;integratedSecurity=true;databaseName=AdventureWorks2022;user=sa;password=sistemas";

    public void metodoPrincipal() {
        try (
            Connection con = DriverManager.getConnection(connectionUrl); 
            Statement stmt = con.createStatement();
            ) {
            String SQL = "SELECT TOP 10 * FROM Person.Person";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
