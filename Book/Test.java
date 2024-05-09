package Book;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.Stock();
        Bookltem bookltem = new Bookltem();
        System.out.println("***********欢迎使用图书管理系统***********");
        System.out.println("请先登陆账号.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("账号：");
        String zhanghao = sc.next();
        System.out.println("密码：");
        String password = sc.next();
        if (zhanghao.equals("admin") && password.equals("jiuye")) {
            System.out.println("管理员账号登录成功！");
            System.out.println("*******请按操作编号正确输入编号进行操作*******");
            System.out.println("[1]查询小说类图书");
            System.out.println("[2]查询非小说类图书");
            System.out.println("[3]查找图书");
            System.out.println("[4]添加图书");
            System.out.println("[5]删除图书");
            System.out.println("[0]退出系统");
            while (true) {
                System.out.println("请输入操作编号：");
                int no = sc.nextInt();
                switch (no) {
                    case 1: {
                        stock.display1();
                        break;
                    }
                    case 2: {
                        stock.display2();
                        break;
                    }
                    case 3: {
                        System.out.println("请输入查找图书的ISBN编号：");
                        try {
                            int ISBN = sc.nextInt();
                            stock.searchBook(ISBN);
                        } catch (Exception e) {
                            System.out.println("ISBN编号输入不合法！");
                            return;
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("请输入添加图书的类型：");
                        String ty = sc.next();
                        if (ty.equals("小说")) {
                            System.out.println("请输入图书名字：");
                            String name = sc.next();
                            System.out.println("请输入图书作者：");
                            String author = sc.next();
                            System.out.println("请输入图书价格：");
                            int price = sc.nextInt();
                            System.out.println("请输入图书ISBN编号：");
                            int ISBN = sc.nextInt();
                            System.out.println("请输入图书level：");
                            String level = sc.next();
                            FictionBook fictionBook = new FictionBook(name, author, price, ISBN, level);
                            stock.addBook(fictionBook);
                            stock.display1();
                        } else if (ty.equals("非小说")) {
                            System.out.println("请输入图书名字：");
                            String name = sc.next();
                            System.out.println("请输入图书作者：");
                            String author = sc.next();
                            System.out.println("请输入图书价格：");
                            int price = sc.nextInt();
                            System.out.println("请输入图书ISBN编号：");
                            int ISBN = sc.nextInt();
                            System.out.println("请输入图书topic：");
                            String topic = sc.next();
                            NonFictionBook nonFictionBook = new NonFictionBook(name, author, price, ISBN, topic);
                            stock.addBook(nonFictionBook);
                            stock.display2();
                        } else {
                            System.out.println("输入类型错误，请重新输入！");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("请输入删除图书的ISBN编号：");
                        int ISBN = sc.nextInt();
                        stock.delBook(ISBN);
                        break;
                    }
                    case 0: {
                        System.exit(0);
                    }
                }
            }
        } else if (zhanghao.equals("xiaoli") && password.equals("0325")) {
            System.out.println("用户账号登陆成功！");
            System.out.println("*******请按操作编号正确输入编号进行操作*******");
            System.out.println("[1]查询小说类图书");
            System.out.println("[2]查询非小说类图书");
            System.out.println("[3]查找图书");
            System.out.println("[6]借阅图书");
            System.out.println("[7]归还图书");
            System.out.println("[0]退出系统");
            while (true) {
                System.out.println("请输入操作编号：");
                int no = sc.nextInt();
                switch (no) {
                    case 1: {
                        stock.display1();
                        break;
                    }
                    case 2: {
                        stock.display2();
                        break;
                    }
                    case 3: {
                        System.out.println("请输入查找图书的ISBN编号：");
                        try {
                            int ISBN = sc.nextInt();
                            stock.searchBook(ISBN);
                        } catch (Exception e) {
                            System.out.println("ISBN编号输入不合法！");
                            return;
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("请输入借阅图书的ISBN编号：");
                        try {
                            int ISBN = sc.nextInt();
                            bookltem.BorrowBooks(ISBN);
                        }catch (Exception e){
                            System.out.println("ISBN编号输入不合法！");
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("请输入归还图书的ISBN编号：");
                        try {
                            int ISBN = sc.nextInt();
                            bookltem.ReturnBooks(ISBN);
                        }catch (Exception e){
                            System.out.println("ISBN编号输入不合法！");
                        }
                        break;
                    }
                    case 0: {
                        System.exit(0);
                    }
                }
            }
        } else {
            System.out.println("账号或密码错误，请重新登录！");
        }
    }

}
