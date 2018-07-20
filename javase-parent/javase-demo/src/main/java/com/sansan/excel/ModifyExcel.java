package com.sansan.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.io.*;

public class ModifyExcel {
    @Test
    public void testExcelExport() throws IOException {
        //读取Excel模板
        InputStream excelInputStream = this.getClass().getResourceAsStream("SurveyInfoTemplate.xls");
//        FileInputStream excelInputStream = new FileInputStream(name);

        //创建2003版的Excel
        Workbook workbook = new HSSFWorkbook(excelInputStream);

        //关闭输入流
        excelInputStream.close();

        //获取Excel文件的第一个Sheet页
        Sheet sheet = workbook.getSheetAt(0);

        Row row1 = sheet.getRow(1);
        sheet.removeRow(row1);

        Row row = sheet.getRow(1);
        if (null == row) {
            System.out.println("removeCRow后，该Row为null");
        }

        FileOutputStream excelOutPutStream = new FileOutputStream("E:/跨省数字预堪提交集团模板-副本.xls");
        workbook.write(excelOutPutStream);

        excelOutPutStream.flush();
        excelOutPutStream.close();

    }
}
