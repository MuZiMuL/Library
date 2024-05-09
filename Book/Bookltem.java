package Book;

public class Bookltem extends Book implements Lendable{
    private boolean state = false;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Bookltem() {
    }

    public Bookltem(boolean state) {
        this.state = state;
    }
    @Override
    public void BorrowBooks(int ISBN) {
            if (isState() == false ){
                System.out.println("借阅成功！");
                setState(true);
            }else{
                System.out.println("抱歉，该图书已被借阅！");
            }
        }


    @Override
    public void ReturnBooks(int ISBN) {
        if (isState() == true){
            System.out.println("归还成功！");
            setState(false);
        }else{
            System.out.println("归还失败，该图书未被借阅！");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "state="+ (isState()?"已被借阅":"未被借阅");
    }
}
