package Adaptor;

public class OldEmployeeProvider implements EmployeeListProvider {
    @Override
    public String[] getEmployees() {
        String[] employees = {"ram","somu","hari"};
        return  employees;
    }
}
