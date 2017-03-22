package cn.libery.refactoringsample.replacetypecodewithstate;

/**
 * Created by ibery on 2017/3/21.
 */

public class Saleman extends EmployeeType {
    @Override
    int payAmount(Employee e) {
        return 90;
    }

    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
