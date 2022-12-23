package com.operators;

import java.util.Random;

import static com.util.Print.print;

public class MathOps {
    public static void main(String[] args) {
        // 如果没有传递任何参数,将当前时间作为随机数生成器的种子
        // 随机数生成器对于特定的种子值总是产生相同的随机数序列.
        Random rand = new Random(47);
        int i;
        int j;
        int k;

        // [1, 100]的随机整数
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);

        i = j + k;
        print("j + k : " + i);

        i = j - k;
        print("j - k : " + i);

        i = j * k;
        print("j * k : " + i);

        i = j / k;
        print("j / k : " + i);

        i = j % k;
        print("j % k : " + i);

        j %= k;
        print("j %= k : " + j);

        float u;
        float v;
        float w;
        // [0.0, 1.0)均匀分布
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w : " + w);

        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);

        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);
    }
}
