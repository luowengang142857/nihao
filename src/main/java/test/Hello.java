package test;

/**
 * 这是一个java类
 */
public class Hello {
    public static void main(String[] args) {

        int j = 3;
        for (int i = 0; i < j; i++) {
            System.out.println(i);
        }

        A a = new A();
        a.setId(1);
        a.setName("tom");

        int x = 3;
        if(x%2 == 0){
            System.out.println("x是偶数");
        }else{
            System.out.println("x是技术");
        }
        System.out.println(a);

        a.study();

        Hello h = new Hello();

        System.out.println(h.getClass().getClassLoader());
        System.out.println(h.getClass().getClassLoader().getParent());
        System.out.println(h.getClass().getClassLoader().getParent().getParent());

        //print
        System.out.println("hello");
    }
}
