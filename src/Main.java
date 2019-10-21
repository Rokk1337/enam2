import java.util.Arrays;

public class Main {

    public enum Color {
        RESET("\u001B[0m" + "Сброс" + "\u001B[0m"),
        BLACK ("\u001B[30m" + "Чёрный" + "\u001B[0m"),
        RED("\u001B[31m" + "Красный" + "\u001B[0m"),
        GREEN("\u001B[32m" + "Зеленый" + "\u001B[0m"),
        YELLOW("\u001B[33m" + "Жёлтый" + "\u001B[0m"),
        BLUE("\u001B[34m" + "Голубой" + "\u001B[0m"),
        PURPLE("\u001B[35m" + "Фиолетовый" + "\u001B[0m"),
        CYAN("\u001B[36m" + "Сине_Зелёный" + "\u001B[0m"),
        WHITE("\u001B[37m" + "Белый" + "\u001B[0m");

        private String Color;

        Color(String Color) {
            this.Color = Color;
        }

        public String getColor() {
            return Color;
        }

        @Override
        public String toString() {
            return "цвет " + Color;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Color.values()));
    }


}
