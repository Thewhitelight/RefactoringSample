package cn.libery.refactoringsample;

import org.junit.Test;

import cn.libery.refactoringsample.replacetypecodewithstate.Employee;
import cn.libery.refactoringsample.replacetypecodewithstate.EmployeeType;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RTCWSUnitTest {
    @Test
    public void rtcwsTest() throws Exception {
        Employee employee = new Employee();
        employee.setEmployeeType(EmployeeType.ENGINEER);
        System.out.println(employee.payAmount());
        employee.setEmployeeType(EmployeeType.SALESMAN);
        System.out.println(employee.payAmount());
        employee.setEmployeeType(EmployeeType.MANAGER);
        System.out.println(employee.payAmount());
    }
}