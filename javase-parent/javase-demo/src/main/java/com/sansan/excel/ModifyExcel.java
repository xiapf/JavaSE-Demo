package com.sansan.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ModifyExcel {
    public static void main(String[] args) throws IOException {
        //读取Excel模板
        FileInputStream excelInputStream = new FileInputStream("E:/跨省数字预堪提交集团模板.xls");

        //创建2003版的Excel
        Workbook workbook = new HSSFWorkbook(excelInputStream);

        //关闭输入流
        excelInputStream.close();

        //获取Excel文件的第一个Sheet页
        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.createRow(2);
        Cell cell = row.createCell(0);
        cell.setCellValue("2");


        FileOutputStream excelOutPutStream = new FileOutputStream("E:/跨省数字预堪提交集团模板-副本.xls");
        workbook.write(excelOutPutStream);

        excelOutPutStream.flush();
        excelOutPutStream.close();

    }
}
