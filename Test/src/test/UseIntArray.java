
package test;


public class UseIntArray {
    public static void main(String[] args) {
        Test arr = new Test();
        arr.enterLength();
        arr.enterElement();
        arr.displayArray();
        int value = arr.smallestElement();
        System.out.println("\nSmallest= " + value);
        double avg = arr.averageArray();
        System.out.println("Average= " + avg);
        arr.bubblesort();
        System.out.print("Bubble sort: ");
        arr.displayArray();
        System.out.print("\n");
        
        System.err.println("How are *YouTo**Day");
    }
}
//Stack: lưu trữ biến chuẩn, cục bộ, dữ liệu nguyên thủy
//Heap: lưu trữ biến theo kiểu tham chiếu (khởi tạo bởi new...)
//new: biến khởi tạo
