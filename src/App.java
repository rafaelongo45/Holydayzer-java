public class App {
    public static void main(String[] args) throws Exception {
        Holydayzer holydayzer = new Holydayzer();
        holydayzer.createHolydayzer();
        System.out.println(holydayzer.findByDate("15/11/2023"));
    }
}
