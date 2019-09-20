package com.nan.design.principle.dependenceinversion.courses;

import com.nan.design.principle.dependenceinversion.ICourse;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-09-18 15:50
 * @Update Date Time:
 * @see
 */
public class FECourse implements ICourse {
    public void myCourse() {
        System.out.println("学习FE课程");
    }
}
