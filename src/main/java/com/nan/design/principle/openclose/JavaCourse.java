package com.nan.design.principle.openclose;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-08-19 15:00
 * @Update Date Time:
 * @see
 */
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
