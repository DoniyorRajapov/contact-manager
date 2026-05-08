package ContactManager;

import java.util.Scanner;

public class ScannerService {
    private static final Scanner scanner =new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }
}