// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.easyvideo.common_utils.utils.ResultCode;

/**
 * @program: easyvideo_video
 * @ClassName: TransactionalException
 * @create: 2021-10-23 23:18
 * @author: Lan Sheng
 * @since： JDK1.8
 * @TransactionalException: $
 **/

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class TransactionalException extends RuntimeException {

    private Integer code;
    private String msg;

    public TransactionalException(String s) {
        super(s);
        this.code = ResultCode.ERROR;
        this.msg = s;
    }
}
