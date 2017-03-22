package cn.libery.refactoringsample.replacetypecodewithstate;

/**
 * 如果有个类型码，它会影响类的行为，但无法沟通过继承手段消除它
 * 以状态对象取代类型码
 * Created by ibery on 2017/3/21.
 */

public class Employee {
    private EmployeeType employeeType;

    public void setEmployeeType(int type) {
        employeeType = EmployeeType.setEmployeeType(type);
    }

    public int getEmployeeTypeCode() {
        return employeeType.getTypeCode();
    }

    public int payAmount() {
       return employeeType.payAmount(this);
    }
}
