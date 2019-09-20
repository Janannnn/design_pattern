package com.nan.design.principle.dependenceinversion;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-09-18 15:45
 * @Update Date Time:
 * @see
 */
public class Janan {
    /**
     * 将要学习的课程
     */
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /**
     * 学习课程
     */
    public void studyCourse(){
        iCourse.myCourse();
    }
}
