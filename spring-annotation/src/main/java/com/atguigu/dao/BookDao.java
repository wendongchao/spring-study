package com.atguigu.dao;

import org.springframework.stereotype.Repository;

//注解表明为实体层，组件的名字默认为类名，首字母小写
@Repository
public class BookDao {
    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }

}
