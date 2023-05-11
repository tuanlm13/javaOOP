package JavaOOP.JavaOOP02.Persion;

public class Information {
    public static void main(String[] args) {
        person ps=new person("Tuan", 28,"Anh Son, Nghe An","Nam","0969696969");
        System.out.println(ps.getName());
        System.out.println(ps.getAge());
        System.out.println(ps.getAddress());
        System.out.println(ps.getGender());
        System.out.println(ps.getPhone());
    }


}
