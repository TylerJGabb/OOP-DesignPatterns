public class Main {
    private String oField;

    public static void main(String[] args) {
        new Main().other();
    }

    private void other(){
        oField = "BBBB";
        doPrinty(oField);
        oField = "AAAA";
    }

    private void doPrinty(String fieldArg){
        new Thread(() -> {
            while(true) try {
                Thread.sleep(1000);
                print(fieldArg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void print(String x){
        System.out.println(x);
    }

    private class Ref{

        private String oStringField;

        public Ref(String strField) {
            this.oStringField = strField;
        }
    }
}
