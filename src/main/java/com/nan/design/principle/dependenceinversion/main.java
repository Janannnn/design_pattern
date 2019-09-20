package com.nan.design.principle.dependenceinversion;

import com.nan.design.principle.dependenceinversion.courses.JavaCourse;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-09-18 15:50
 * @Update Date Time:
 * @see
 */
public class main {
    public static void main(String[] args) {
        Janan janan = new Janan();
        JavaCourse javaCourse = new JavaCourse();
        janan.setiCourse(javaCourse);
        janan.studyCourse();
    }
}
