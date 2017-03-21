package cn.libery.refactoringsample.replacetypecodewithstate;

/**
 * Created by ibery on 2017/3/21.
 */

public abstract class EmployeeType {

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    abstract int getTypeCode();

    public static EmployeeType setEmployeeType(int type) {
        switch (type) {
            case EmployeeType.ENGINEER:
                return new Engineer();
            case EmployeeType.SALESMAN:
                return new Saleman();
            case EmployeeType.MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }
}
