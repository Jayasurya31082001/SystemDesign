package Adaptor;

import Factory.Practicalfactory.Notification;

public class EmployeeAdaptor implements EmployeeListProvider{
    private  NewEmployeeApi newEmployeeApi;
    public EmployeeAdaptor(NewEmployeeApi newEmployeeApi){
        this.newEmployeeApi=newEmployeeApi;
    }

    @Override
    public String[] getEmployees() {
        return newEmployeeApi.fetchEmployee();
    }
}
