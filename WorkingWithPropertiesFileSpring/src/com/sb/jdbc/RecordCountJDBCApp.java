package com.sb.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class RecordCountJDBCApp {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		// locate properties file
		FileInputStream fis = new FileInputStream("src/com/sb/common/DBDetails.properties");
		Properties prop = new Properties();
		prop.load(fis);

		Class.forName(prop.getProperty("jdbc.driver"));

		Connection con = DriverManager.getConnection(prop.getProperty("jdbc.url"));
		prop.getProperty("jdbc.username");
		prop.getProperty("jdbc.password");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM CUSTOMER_LOANINFO");

		int count = 0;

		while (rs.next()) {
			count = rs.getInt(1);
		}

		System.out.println(count + "  count");
	}
}
