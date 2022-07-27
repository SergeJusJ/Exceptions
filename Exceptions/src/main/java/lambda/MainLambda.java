package lambda;

public class MainLambda {
    public static void main(String[] args) {

        MyErrorMessage myErrorMessage = new MyErrorMessage() {
            @Override
            public void show(String message) {
                System.out.println("1 error");
                System.out.println(message);
            }

        };
        myErrorMessage.show("Add new message:");

        MyErrorMessage myErrorMessage2 = (String message) -> {
            System.out.println("Errr2 ");
        };

        myErrorMessage2.show("Add new message:");

        Addable addable = (int a, int b) -> {return a+b ;};
        addable.add(5,6);


    }



}
