package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXlsx {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\Aparna\\Read.xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row2=sheet.createRow(7);
		row2.createCell(0).setCellValue("Vikram");
	    row2.createCell(1).setCellValue("Zapate");
	    row2.createCell(2).setCellValue("vz@gmail.com");
	    row2.createCell(3).setCellValue("5069788786");
	    row2.createCell(4).setCellValue("Rabale");
	    FileOutputStream outputStream = new FileOutputStream("E:\\Aparna\\write.xlsx");
	    wb.write(outputStream);
	    wb.close();
	    
		

	}

}
