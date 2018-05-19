package com.sansan.io.itcast_01;

import java.io.File;
import java.io.IOException;

/**
 * 重命名功能:public boolean renameTo(File dest)
 * 如果路径名相同，就是改名。
 * 如果路径名不同，就是改名并剪切。
 * <p>
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //路径相同
        // 创建一个文件对象
        File file = new File("林青霞.jpg");
        file.createNewFile();
        // 需求：我要修改这个文件的名称为"东方不败.jpg"
        File newFile = new File("东方不败.jpg");
        System.out.println("renameTo:" + file.renameTo(newFile));

        //路径不同
		File file2 = new File("东方不败.jpg");
		File newFile2 = new File("e:\\林青霞.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
    }
}
