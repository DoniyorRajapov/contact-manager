package ContactManager;

public class Main {
    public static void main(String[] args) {
        TableRepository tableRepository = new TableRepository();
        tableRepository.create();
        MainController mainController = new MainController();
        mainController.start();
    }
}