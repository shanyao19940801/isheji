package com.isheji.project.controller.output;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Msg<T> {
    /*错误码*/
    private Integer code;

    /*提示信息 */
    private String msg;

    /*具体内容*/
    private  T data;

}
