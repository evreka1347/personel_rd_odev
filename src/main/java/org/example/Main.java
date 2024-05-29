import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Esma Çoban", 31, "Yazılım Departmanı", "Yazılım Test Uzmanı", 10000);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // JSON formatına dönüştürme
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personel);
            // JSON çıktısını konsola yazdırma
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
