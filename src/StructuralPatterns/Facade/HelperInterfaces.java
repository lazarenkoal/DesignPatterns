package StructuralPatterns.Facade;

import java.sql.Connection;

/**
 * Helper interfaces fo
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */
class MySqlHelper {
    public static Connection getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }
}

class OracleHelper {

    public static Connection getOracleDBConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }
}