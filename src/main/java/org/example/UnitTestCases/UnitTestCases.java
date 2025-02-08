package org.example.UnitTestCases;

import org.example.User.User;

import java.util.List;

public class UnitTestCases {

    public int tich(int a, int b) {
        return a * b;
    }

    public int thuong(int a, int b) {
        if (b == 0) throw new ArithmeticException("Không thể chia cho số 0");
        return a / b;
    }

    public double bai3(List<Integer> numbers) {
        if (numbers.isEmpty()) throw new ArithmeticException("Rỗng");
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int bai4(List<Integer> list, int index) {
        return list.get(index);
    }


    public int bai6(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Mảng trống");

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public String bai5(User user) {
        if (user == null) throw new NullPointerException("User không tồn tại");
        return user.getName();
    }

}
