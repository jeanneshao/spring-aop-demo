package com.example.jpademo.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class DemoTbUserUpdateVO extends DemoTbUserVO implements Serializable {
    private static final long serialVersionUID = 1L;

}
