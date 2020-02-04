package generics.demo16;

import generics.demo15.ClassTypeCapture;

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassTypeCapture<Employee> fe = new ClassTypeCapture<>(Employee.class);
        System.out.println("ClassTypeCapture<Employee> succeeded");
        try {
            ClassTypeCapture<Integer> fi = new ClassTypeCapture<>(Integer.class);
        }catch (Exception e){
            System.out.println("ClassTypeCapture<Integer> failed");
        }

    }
}
