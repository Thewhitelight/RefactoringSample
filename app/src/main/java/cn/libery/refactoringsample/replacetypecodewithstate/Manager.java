package cn.libery.refactoringsample.replacetypecodewithstate;

/**
 * Created by ibery on 2017/3/21.
 */

public class Manager extends EmployeeType {
    @Override
    int payAmount(Employee e) {
        return 99;
    }

    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}
