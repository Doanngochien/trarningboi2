package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên thứ nhất: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        int tongHaiSo = a + b;
        System.out.println(tongHaiSo);
    }
}