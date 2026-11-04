package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXlsFile {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\Aparna\\Read.xls");
		FileInputStream inputStream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		HSSFRow row2=sheet.createRow(6);
		row2.createCell(0).setCellValue("Vilas");
	    row2.createCell(1).setCellValue("Bhimrao");
	    row2.createCell(2).setCellValue("vb@gmail.com");
	    row2.createCell(3).setCellValue("9029334567");
	    row2.createCell(4).setCellValue("Belapur");
	    FileOutputStream outputStream = new FileOutputStream("E:\\Aparna\\write.xls");
	    wb.write(outputStream);
	    wb.close();
	    

	}

}
