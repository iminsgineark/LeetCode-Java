//package Arrays;
//class StaticPolymorphism{
//    void add(int n1,int n2){
//        System.out.println(n1+n2);
//    }
//    void add(int n1,int n2,int n3){
//        System.out.println(n1+n2+n3);
//    }
//    void add(float n1, float n2){
//        System.out.println(n1+n2);
//    }
//    void add(int n1,float n2){
//        System.out.println(n1+n2);
//    }
//    void add(float n1,int n2){
//        System.out.println(n1+n1);
//    }
//}
//class DynamicPolymorphism{
//    abstract class Doctor{
//        abstract void treatPatient();
//
//    }
//    static class Physican extends Doctor{
//        @Override
//        void treatPatient(){
//            System.out.println("I Use Medicine For Treatment");
//        }
//    }
//    static class Surgeon extends Doctor{
//        @Override
//        void treatPatient(){
//            System.out.println("I Use Surgeries For Treatment");
//        }
//    }
//    static class Dentist extends Doctor{
//        @Override
//        void treatPatient(){
//            System.out.println("I Use Dental Approaches For Treatment");
//        }
//    }
//}
//public class Polymorphism {
//    public static void main(String[] args) {
//        StaticPolymorphism polymorphism = new StaticPolymorphism();
//        polymorphism.add(1, 2);
//
//        System.out.println("Enter Ur Choice");
//        int choice = new java.util.Scanner(System.in).nextInt();
//        DynamicPolymorphism.Doctor doctor = null;
//        switch (choice){
//            case 1:
//                doctor = new DynamicPolymorphism.Physican();
//                break;
//            case 2:
//                doctor = new DynamicPolymorphism.Surgeon();
//                break;
//            case 3:
//                doctor = new DynamicPolymorphism.Dentist();
//        }
//    }
//}
