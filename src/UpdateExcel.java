import java.io.File;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class UpdateExcel {
    public void updateexcel(){
        try {
            // Excel����ļ�
        	String name = null;
        	String sex = null;
        	String city = null;
        	String birthday = null;
        	String minzu = null;
        	String email = null;
        	
        	String address = null;
        	String county = null;
        	String number = null;
        	String major = null;
        	
        	String self = null;
        	String speciality = null;
        	Scanner scan = new Scanner(System.in);
        	System.out.println("������ϵ��Ϣ���س���ȷ�ϣ�\n");
        	 System.out.println("����������:");
        	 name = scan.nextLine();
        	 System.out.println("�������Ա�:");
        	 sex = scan.nextLine();
        	 System.out.println("�����뼮��:");
        	 city = scan.nextLine();
        	 System.out.println("�������������:");
        	 birthday = scan.nextLine();
        	 
        	 System.out.println("����������:");
        	 minzu = scan.nextLine();
        	 System.out.println("����������:");
        	 email = scan.nextLine();
        	 System.out.println("�������ͥסַ:");
        	 address = scan.nextLine();
        	 System.out.println("������������ò:");
        	 county = scan.nextLine();
        	 System.out.println("������绰:");
        	 number = scan.nextLine();
        	 System.out.println("������רҵ:");
        	 major = scan.nextLine();
        	 System.out.println("��������˼��:");
        	 self = scan.nextLine();
        	 System.out.println("������ר��:");
        	 speciality = scan.nextLine();
        	
            Workbook wb = Workbook.getWorkbook(new File("test.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"),
                    wb);
            // ���һ��������

            WritableSheet sheet2 = book.getSheet(0);
            sheet2.addCell(new Label(1, 2, name));
            sheet2.addCell(new Label(3, 2, sex));
            sheet2.addCell(new Label(5, 2, city));
            sheet2.addCell(new Label(1, 3, birthday));
            
            sheet2.addCell(new Label(3, 3, minzu));
            sheet2.addCell(new Label(5, 3, email));
            sheet2.addCell(new Label(1, 4, address));
            sheet2.addCell(new Label(1, 5, county));
            sheet2.addCell(new Label(3, 5, number));

            sheet2.addCell(new Label(5, 5, major));
            sheet2.addCell(new Label(0, 9, self));
            sheet2.addCell(new Label(0, 19, speciality));
            
            System.out.println("��Ϣ��ӳɹ���");
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}