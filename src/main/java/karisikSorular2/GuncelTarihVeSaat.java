package karisikSorular2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GuncelTarihVeSaat {
    public static void main(String[] args) {

        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatterDateTime= now.format(formatter);


        System.out.println("Güncel tarih ve saat : " + formatterDateTime);

    }
}
