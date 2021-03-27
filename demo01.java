package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/12 9:13
 */
public class demo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入java成绩");
        int javaScore = scanner.nextInt();
        System.out.println("请输入体育成绩");
        int peScore = scanner.nextInt();

        if ((javaScore > 97 && peScore > 85) || (javaScore == 100 && peScore > 75)) {
            System.out.println("奖励一巴掌");
        } else {
            System.out.println("不奖励");
        }

    }
}


