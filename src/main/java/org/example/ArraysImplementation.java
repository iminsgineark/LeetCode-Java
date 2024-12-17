package org.example;

class oneDArray {
    static int[] arr = null;
    public oneDArray (int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location , int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Inserted Successfully");
            }else {
                System.out.println("Insertion UnSuccessfully");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    
    public  void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + ", ");
            }
        }catch (Exception e) {
            System.out.print("Array don't Exist");
        }
    }

    public void searchInArray(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value Is Found At: " + i);
                return;
            }
        }
    }

    public void delete(int value) {
        try {
            arr[value] = Integer.MIN_VALUE;
            System.out.println("Value Deleted");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Value Not in range");
        }
    }
}

public class ArraysImplementation {
    public static void main(String[] args) {
       oneDArray od = new oneDArray(5);
       od.insert(0,1);
       od.insert(1,1);
       od.insert(2,2);
       od.insert(3,3);
       od.insert(4,4);
//       od.insert(5,5); -----> Gives Error Index out of bond
//        od.traverseArray();
//        od.searchInArray(3);
        od.delete(3);
        od.traverseArray();
    }
}
