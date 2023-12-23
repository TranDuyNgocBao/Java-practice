public class Bai3 {
    public static void main(String[] args) {
        // kiểu_dữ_liệu danh_sách_tên_biến;
        int a=1;
        int b = 125;
        int d=-9,e=999,f;

        float Pi = 3.14f;
        char c = 'U';
        boolean bool = true;

        f = a +b;

        float r = 9.25f;
        float area = Pi * r * r;

        System.out.println("Circle area = " + area);

        int sum = a + b;
        r = (float)b/++a;
        r += r;

        System.out.println(r);
        System.out.println("a%b = " + a%b);
        System.out.println("a<b ? " + (a < b));
    }
}
