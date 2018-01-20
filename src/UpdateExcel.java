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
            // Excel获得文件
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
        	System.out.println("请输入系信息按回车键确认：\n");
        	 System.out.println("请输入姓名:");
        	 name = scan.nextLine();
        	 System.out.println("请输入性别:");
        	 sex = scan.nextLine();
        	 System.out.println("请输入籍贯:");
        	 city = scan.nextLine();
        	 System.out.println("请输入出生日期:");
        	 birthday = scan.nextLine();
        	 
        	 System.out.println("请输入民族:");
        	 minzu = scan.nextLine();
        	 System.out.println("请输入邮箱:");
        	 email = scan.nextLine();
        	 System.out.println("请输入家庭住址:");
        	 address = scan.nextLine();
        	 System.out.println("请输入政治面貌:");
        	 county = scan.nextLine();
        	 System.out.println("请输入电话:");
        	 number = scan.nextLine();
        	 System.out.println("请输入专业:");
        	 major = scan.nextLine();
        	 System.out.println("请输入个人简介:");
        	 self = scan.nextLine();
        	 System.out.println("请输入专长:");
        	 speciality = scan.nextLine();
        	
            Workbook wb = Workbook.getWorkbook(new File("test.xls"));
            // 打开一个文件的副本，并且指定数据写回到原文件
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"),
                    wb);
            // 添加一个工作表

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
            
            System.out.println("信息添加成功！");
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}