// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.common_utils.utils;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: easyvideo_viedo
 * @ClassName: ResponseResult
 * @create: 2021-09-05 23:13
 * @author: Lan Sheng
 * @since： JDK1.8
 * @ResponseResult: $
 **/

@Data
public class ResponseResult {

    private ResponseResult() {
    }

    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回的数据")
    private Map<String, Object> data = new HashMap<>();

    /**
     * 提供工具方法
     */
    public static ResponseResult ok() {
        ResponseResult r = new ResponseResult();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static ResponseResult info(String msg) {
        ResponseResult r = new ResponseResult();
        r.setSuccess(false);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage(msg);
        return r;
    }

    public static ResponseResult error() {
        ResponseResult r = new ResponseResult();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public static ResponseResult error(Throwable errorMessage) {
        ResponseResult r = new ResponseResult();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage(errorMessage.getLocalizedMessage());
        return r;
    }

    public static ResponseResult error(String errorMessage) {
        ResponseResult r = new ResponseResult();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage(errorMessage);
        return r;
    }

    /**
     * 提供删除or更新
     */
    public static ResponseResult toOk(boolean i) {
        ResponseResult r = new ResponseResult();
        r.setSuccess(i);
        r.setCode(i ? ResultCode.SUCCESS : ResultCode.ERROR);
        r.setMessage(i ? "操作成功" : "操作失败");
        return r;
    }

    public static ResponseResult toOk(Object data) {
        boolean flag = data != null;
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ResponseResult r = new ResponseResult();
        r.setSuccess(flag);
        r.setCode(flag ? ResultCode.SUCCESS : ResultCode.ERROR);
        r.setMessage(flag ? "操作成功" : "操作失败");
        stringObjectHashMap.put("rows", data);
        r.setData(stringObjectHashMap);
        return r;
    }

    public ResponseResult success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public ResponseResult message(String message) {
        this.setMessage(message);
        return this;
    }

    public ResponseResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ResponseResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public ResponseResult data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    public ResponseResult data(Object data) {
        this.data.put("rows", data);
        return this;
    }

    public ResponseResult dataPage(Object data, long total) {
        this.data.put("rows", data);
        this.data.put("total", total);
        return this;
    }
}

