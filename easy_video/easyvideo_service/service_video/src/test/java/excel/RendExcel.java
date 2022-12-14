/*------------------------------------------------------------------------------
 -  Lan Sheng  Copyright (c) 2021 https://127.0.0.1.
 -----------------------------------------------------------------------------*/

package excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: easyvideo_video
 * @ClassName: RendExcel
 * @create: 2021-09-09 00:02
 * @author: Lan Sheng
 * @since： JDK1.8
 * @RendExcel: $
 **/


public class RendExcel {

    public static void main (String[] args) {

        String fileName = "D:\\01.xlsx";
        /*每读取一行数据的时候, 就会调用监听器当中的方法*/
        EasyExcel.read(fileName, StudentData.class, new ExcelListener()).sheet().doRead();

    }

}
