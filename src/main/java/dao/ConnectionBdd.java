package dao;

import com.sun.jdi.connect.spi.Connection;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class ConnectionBdd {

    private static final String url=  "jdbc:mysql://localhost:3306/monlivre?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
    private static final String password= "246810";
    private static final String username = "app_test";

    private static BasicDataSource dataSource;

    public static DataSource getConnection() {

        if (dataSource == null) {

                dataSource = new BasicDataSource();

                dataSource.setUrl(url);
                dataSource.setUsername(username);
                dataSource.setPassword(password);

                dataSource.setInitialSize(20);

        }
        return dataSource;

    }



}
