package Adaptor;

public class Client {
    public static void main(String[] args) {
        EmployeeListProvider oldEmployee = new OldEmployeeProvider();
        System.out.println("Old employees:");
        for (String i:oldEmployee.getEmployees()){
            System.out.print(i+" ");

        }
        System.out.println();

        EmployeeListProvider adptor = new EmployeeAdaptor(new NewEmployeeApi());
        System.out.println("using adaptor");
        for (String i:adptor.getEmployees()){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
