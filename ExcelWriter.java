package com.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter{

	static int k=2000000;
	static int l=3000000;
	static int z=0;
	static int m=10;
	static int o=9;
	static int p=50;
	static String[] status = {"EN-ROUTE","COMPLETE","CANCELLED","REASSIGNED"};
	public static void write() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Path With Filename Where You Wish To Create Your Excelsheet");
		String path=sc.nextLine();
		System.out.println("Enter The Name Of Your Excelsheet");
		String file_name=sc.nextLine();
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(file_name);
		System.out.println("Enter The No. of Records You Want To Create");
		int n=sc.nextInt();
		ArrayList<Object> arr=new ArrayList<Object>();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		
		for(int i=0;i<n;i++)
		{
			Row row1=sheet.createRow(i);
			arr.add(++k);
			arr.add(++l);
			arr.add(++l);
			arr.add("truck-"+(++z));
			arr.add("load-"+(++m));
			arr.add(new Random().nextInt());
			arr.add(new Random().nextInt());
			arr.add(++o);
			arr.add(++p);
			arr.add(dateFormat.format(new Date()));
			arr.add("Address-"+(++m));
			int inx=new Random().nextInt(status.length);
			arr.add(status[inx]);
			Iterator<Object> itr=arr.iterator();
			int c=0;
			while(itr.hasNext()) 
			{
				Cell cell=row1.createCell(c++);
				Object o=itr.next();
				if(o instanceof Integer)
					cell.setCellValue((Integer)o);
				
				else if(o instanceof String)
					cell.setCellValue((String)o);
			}
			arr.clear();
			
		}
		FileOutputStream fileOut = new FileOutputStream(path);
		wb.write(fileOut);
		System.out.println("File Created Successfully");
		fileOut.flush();
		fileOut.close();
		wb.close();
		sc.close();
		
	}
	public static void main(String[] args) throws IOException {
		write();
	}
}
