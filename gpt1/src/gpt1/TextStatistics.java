package gpt1;
import java.util.Scanner;

public class TextStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入文字
        System.out.println("請輸入一段文字：");
        String input = scanner.nextLine();

        // 計算字數
        int wordCount = input.split("\\s+").length;

        // 計算句子數
        int sentenceCount = input.split("[.!?]").length;

        // 反轉文字
        String reversedText = new StringBuilder(input).reverse().toString();

        // 輸出結果
        System.out.println("文字統計資訊：");
        System.out.println("字數：" + wordCount);
        System.out.println("句子數：" + sentenceCount);
        System.out.println("反轉後的文字：" + reversedText);

        scanner.close();
    }
}
