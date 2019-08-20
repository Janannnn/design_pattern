package com.nan.design.principle.openclose;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-08-19 15:21
 * @Update Date Time:
 * @see
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
