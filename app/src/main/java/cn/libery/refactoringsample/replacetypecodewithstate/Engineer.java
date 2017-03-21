package cn.libery.refactoringsample.replacetypecodewithstate;

/**
 * Created by ibery on 2017/3/21.
 */

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
