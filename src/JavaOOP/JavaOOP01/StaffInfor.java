package JavaOOP.JavaOOP01;

public class StaffInfor {
    public static void main(String[] args) {
        Staff st=new Staff();
        System.out.println(st.staff("Tuan",28,"Anh Son, Nghe An"));
    }


}
//
//- Tại package "person" :
//        + Tạo class "Person" với các thông tin: name, age, gender, address, phone
//        + Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
//        + Tạo class "Information" để gọi lại tất cả các thông tin từ class Person
//
//- Tại package "company" :
//        Yêu cầu:	+ Tạo class "Company" để gọi lại thông tin từ class Person: name, age, gender. Còn lại các thông tin khác không được hiển thị ra.
//        + Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
