package ss15_Debug.bai_tap;

public class ExceptionRectangle extends Exception {
    public ExceptionRectangle(){
       super("tam giac khong hop le");
    }

    public ExceptionRectangle(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
