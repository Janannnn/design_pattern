import com.nan.design.principle.openclose.ICourse;
import com.nan.design.principle.openclose.JavaCourse;
import com.nan.design.principle.openclose.JavaDiscountCourse;
import org.junit.Test;

/**
 * @Description:
 * @Author: zhangsch
 * @Version: 1.0
 * @Create Date Time: 2019-08-19 15:19
 * @Update Date Time:
 * @see
 */
public class MyTest {
    @Test
    public void test(){
        ICourse iCourse = new JavaCourse(1,"Java开闭原则",340d);
        System.out.println("课程价格："+iCourse.getPrice());
    }
    @Test
    public void test1(){
        ICourse iCourse = new JavaDiscountCourse(1,"Java开闭原则",340d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程价格："+javaDiscountCourse.getPrice());
        System.out.println("课程原价格："+javaDiscountCourse.getOriginPrice());
    }
}
