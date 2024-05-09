package Book;

public class Stock {
    private FictionBook[] fictionBooks = new FictionBook[3];
    private NonFictionBook[] nonFictionBooks = new NonFictionBook[2];
    public void Stock(){
        fictionBooks[0] = new FictionBook("西游记","吴承恩",30,001,"青少年");
        fictionBooks[1] = new FictionBook("水浒传","施耐庵",25,002,"幼儿");
        fictionBooks[2] = new FictionBook("三国演义","罗贯中",20,003,"成人");
        nonFictionBooks[0] = new NonFictionBook("Java语言基础","佚名",19,111,"编程");
        nonFictionBooks[1] = new NonFictionBook("明朝那些事","佚名",14,222,"历史");

    }

    public FictionBook[] getFictionBooks() {
        return fictionBooks;
    }

    public NonFictionBook[] getNonFictionBooks() {
        return nonFictionBooks;
    }

    public void addBook(FictionBook book){
        if (book instanceof FictionBook){
            //数组容量足够
            for (int i = 0; i < fictionBooks.length; i++) {
                if (fictionBooks[i] == null){
                    fictionBooks[i] = book;
                    return;
                }
            }
            //数组容量不够，扩容。
            FictionBook fictionBook[] = new FictionBook[fictionBooks.length*2];
            //拷贝数组
            System.arraycopy(fictionBooks,0,fictionBook,0,fictionBooks.length);
            //将新数组赋给老数组，因为方法中使用的数组都是老数组
            this.fictionBooks = fictionBook;
            //添加图书信息
            this.fictionBooks[fictionBooks.length/2] = book;
        }else {
            System.out.println("添加图书失败，请检查添加图书的类型是否正确！");
        }
    }
    public void addBook(NonFictionBook book){
        if (book instanceof NonFictionBook){
            //数组容量足够
            for (int i = 0; i < nonFictionBooks.length; i++) {
                if (nonFictionBooks[i] == null){
                    nonFictionBooks[i] = book;
                    return;
                }
            }
            //数组容量不够，扩容
            NonFictionBook nonFictionBook[] = new NonFictionBook[nonFictionBooks.length*2];
            System.arraycopy(nonFictionBooks,0,nonFictionBook,0,nonFictionBooks.length);
            this.nonFictionBooks = nonFictionBook;
            this.nonFictionBooks[nonFictionBooks.length/2] = book;

        }else {
            System.out.println("添加图书失败，请检查添加图书的类型是否正确！");
        }
    }
    public void delBook(int ISBN){
        for (int i = 0; i < fictionBooks.length; i++) {
            if (fictionBooks[i].getISBN() == ISBN){
                fictionBooks[i] = null;
                System.out.println("删除成功!");
                return;
            }
        }
        for (int i = 0; i < nonFictionBooks.length; i++) {
            if (nonFictionBooks[i].getISBN() == ISBN){
                nonFictionBooks[i] = null;
                System.out.println("删除成功！");
                return;
            }
        }
    }
    public void searchBook(int ISBN){
        for (int i = 0; i < fictionBooks.length; i++) {
            if (fictionBooks[i].getISBN() == ISBN){
                System.out.println(fictionBooks[i]);
            }
        }
        for (int i = 0; i < nonFictionBooks.length; i++) {
            if (nonFictionBooks[i].getISBN() == ISBN){
                System.out.println(nonFictionBooks[i]);
            }
        }
    }
    public void display1(){
        for (int i = 0; i < fictionBooks.length; i++) {
            if (fictionBooks[i] != null){
                System.out.println(fictionBooks[i]);
            }
        }
    }
    public void display2(){
        for (int i = 0; i < nonFictionBooks.length; i++) {
            if (nonFictionBooks[i] != null){
                System.out.println(nonFictionBooks[i]);
            }
        }
    }
}
