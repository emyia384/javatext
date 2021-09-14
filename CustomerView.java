package Customer;

import java.util.Scanner;

public class CustomerView {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) {

            System.out.println("--------客户信息管理系统--------");
            System.out.println();
            System.out.println("1 添加用户");
            System.out.println("2 删除用户");
            System.out.println("3 修改用户");
            System.out.println("4 显示用户");
            System.out.println("5 退出");


            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("请输入添加用户的信息:");
                    CustomerList.add();
                    break;
                case 2:
                    System.out.println("请输入删除用户的序号:");
                    CustomerList.remove();
                    break;
                case 3:
                    System.out.println("请输入修改用户的信息:");
                    CustomerList.set();
                    break;
                case 4:
                    System.out.println("显示所有用户的信息:");
                    CustomerList.view();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效操作，请重新输入");
                    break;
            }

        }
    }
}
