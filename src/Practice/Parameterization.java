package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Java_practice\\TestData\\information.xlsx");
		 org.apache.poi.ss.usermodel.Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
//		 String value=data.getRow(0).getCell(0).getStringCellValue();
	for(int row=0;row<=data.getLastRowNum();row++)
	{
		for(int coll=0;coll<data.getRow(row).getLastCellNum();coll++)
		{
			String value=data.getRow(row).getCell(coll).getStringCellValue();
			System.out.println(value);
		}
		
		
	}
		

	}

}
