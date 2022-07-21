package cn.edu.swu.test;

import cn.edu.swu.utils.FileUtil;
import org.junit.jupiter.api.Test;

public class fileTest {
    @Test
    public void test1() {
        for (String s : FileUtil.getAllFilenames("E:/springtmp/download/")) {
            System.out.println(s);
        }
    }
}
