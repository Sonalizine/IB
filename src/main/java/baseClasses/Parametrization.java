package baseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\tusha\\Desktop\\SoftwareTest1\\TestSheet.xlsx");
	Sheet sheet = WorkbookFactory.create(file).getSheet("sheet1");
	sheet.getRow(0).getCell(1).getStringCellValue()
;
	
		
		
	}

}
