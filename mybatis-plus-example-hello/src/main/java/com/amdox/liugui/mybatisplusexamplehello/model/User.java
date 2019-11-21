package com.amdox.liugui.mybatisplusexamplehello.model;

import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @ClassName: User
 * @Author: liugui
 * @Date: 2019-11-21 17:49
 **/
@Data
@Accessors(chain = true)
public class User  {
    private long id;
    private String name;
    private Integer age;
    private String email;
}
