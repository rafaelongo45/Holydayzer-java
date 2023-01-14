public class App {
    public static void main(String[] args) throws Exception {
        Holydayzer holydayzer = new Holydayzer();
        holydayzer.createHolydayzer();
        System.out.println("\n" + holydayzer.findByDate("15/11/2023"));

        System.out.println("\nList with all holydays: \n");
        holydayzer.getAllHolydays();
    }
}
