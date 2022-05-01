package throwsblock;

class M {
    void method() throws Exception {
        System.out.println("device operation not performed successfully");
    }
}
class Throws {
    public static void main(String args[]) throws Exception {   
        M m = new M();
        m.method();

        System.out.println("normal flow...");
    }
}