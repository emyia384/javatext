package Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerList {
    static List<CustomerMessage> l=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void add(){
        CustomerMessage c=new CustomerMessage();
        String s;
        setMenage(c);
        l.add(c);
    }
    public static void remove(){
        l.remove(Integer.parseInt(sc.nextLine())-1);
        System.out.println("该用户已被删除");
    }
    public static void set(){
        String s;
        System.out.println("请输入用户序号");
        CustomerMessage c=l.get(Integer.parseInt(sc.nextLine())-1);
        setMenage(c);
    }

    private static void setMenage(CustomerMessage c) {
        String s;
        System.out.println("请输入姓名");
        s=sc.nextLine();
        c.setName(s);

        System.out.println("请选择性别");
        s=sc.nextLine();
        c.setMale(s);

        System.out.println("请输入年龄");
        s=sc.nextLine();
        c.setAge(Integer.parseInt(s));

        System.out.println("请输入电话");
        s=sc.nextLine();
        c.setPhone(s);

        System.out.println("请输入邮箱");
        s=sc.nextLine();
        c.setEmail(s);
    }

    public static void view(){
        System.out.println("序号       姓名       性别       年龄       电话       邮箱");
        int index=1;
        for(CustomerMessage i:l){
            System.out.print(index);
            i.show();
            index++;
        }
    }
}
