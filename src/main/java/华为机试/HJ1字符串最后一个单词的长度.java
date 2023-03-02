package 华为机试;

import java.util.Scanner;

/**
 * @author luzhonghe
 * @date 2023/2/28
 */
public class HJ1字符串最后一个单词的长度 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int total = 0;
        System.out.println(in.hasNextInt());
        while (in.hasNext()) { // 注意 while 处理多个 case
            System.out.println(in.next());
        }
        System.out.println(total);
    }
}
