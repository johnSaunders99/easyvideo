/*------------------------------------------------------------------------------
 -  Lan Sheng  Copyright (c) 2021 https://127.0.0.1.
 -----------------------------------------------------------------------------*/

package excel; import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @program: easyvideo_video
 * @ClassName: excel.StudentData
 * @create: 2021-09-08 12:43
 * @author: Lan Sheng
 * @since： JDK1.8
 * @StudentData: $
 **/


@Data
public class StudentData {
    @ExcelProperty(value = "学号",index = 0)
    private Integer no;
    @ExcelProperty(value = "姓名",index = 1)
    private String name;
}
