package jhenkinpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dbconnect {
	
	@Test
	public static void testdb() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Aditi01*");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from emp");
		
		while(rs.next()){
			int i=0;
			String[] str = new String[10];
			String EmpName = rs.getString("EmpName");
			str[i++]= EmpName;
			System.out.println(EmpName);
		}
	}
	
	@Test (enabled =false)
	public static void ddt() throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("C://Users//user//Desktop//ashok.xls");
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sh = wb.getSheet("sheet1");
		int k = sh.getLastRowNum();
		System.out.println("Total No of rows" + k);
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String name = c.getStringCellValue();
		System.out.println(name);
		
	}
	
	public static void test(){
		
		
	}
	
}
