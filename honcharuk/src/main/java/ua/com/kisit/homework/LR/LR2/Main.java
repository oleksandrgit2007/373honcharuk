package ua.com.kisit.homework.LR.LR2;

public class Main   {

        public static void main(String[] args) {
            String[] validPhoneNumbers = {
                    "380505923502", "+380505923502", "+38 050 592 35 02", "+38 (050) 592 35 02",
                    "+38 (050) 592-35-02", "+38 (050) 592-3-502", "(050) 592-35-02", "050 592 35 02",
                    "050 592 3502", "050 592 3 502", "050-592-3-502", "+80 (50) 592 35 02",
                    "380 (50) 592 35 02", "+380 (50) 592 35 02", "+380 (50) 592 35 02",
                    "+380 (50) 592-35-02", "+380 50 592-35-02"
            };

            for (String phoneNumber : validPhoneNumbers) {
                boolean isValid = isValidPhoneNumber(phoneNumber);
                System.out.println("Номер: " + phoneNumber + " є " + (isValid ? "валідним  ️" : "невалідним "));
            }
        }

        public static boolean isValidPhoneNumber(String phoneNumber) {
            // Видалення пробілів, дефісів, дужок для спрощення перевірки
            String cleanedNumber = phoneNumber.replace(" ", "")
                    .replace("-", "")
                    .replace("(", "")
                    .replace(")", "");

            // Перевірка довжини та формату
            if (cleanedNumber.startsWith("+")) {
                if (cleanedNumber.length() < 12 || cleanedNumber.length() > 15) {
                    return false;
                }
            } else if (cleanedNumber.length() != 12 && cleanedNumber.length() != 10) {
                return false;
            }

            // Перевірка, чи містить номер тільки цифри (окрім "+", якщо він присутній на початку)
            for (int i = 0; i < cleanedNumber.length(); i++) {
                char c = cleanedNumber.charAt(i);
                if (i == 0 && c == '+') {
                    continue; // Пропустити "+" на початку
                }
                if (!Character.isDigit(c)) {
                    return false; // Якщо знайдений нецифровий символ
                }
            }

            return true;
        }
    }
