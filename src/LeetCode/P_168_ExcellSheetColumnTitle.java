package LeetCode;

public class P_168_ExcellSheetColumnTitle {
        public static String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while (columnNumber > 0) {
                columnNumber--; // shift to 0-indexed
                int rem = columnNumber % 26;
                sb.insert(0, (char) ('A' + rem));
                columnNumber /= 26;
            }
            return sb.toString();
        }

        // Example usage
        public static void main(String[] args) {
            System.out.println(convertToTitle(1));   // A
            System.out.println(convertToTitle(28));  // AB
            System.out.println(convertToTitle(701)); // ZY
            System.out.println(convertToTitle(702)); // ZZ
        }
    }

