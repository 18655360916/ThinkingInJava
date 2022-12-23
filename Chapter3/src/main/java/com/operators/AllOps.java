package com.operators;

public class AllOps {
    void f(boolean b) {

    }

    void boolTest(boolean x, boolean y) {
        // 算术
//        x = x + y;
//        x = x - y;
//        x = x * y;
//        x = x / y;
//        x = x % y;
//        x++;
//        x--;
//        x = +y;
//        x = -y;

        // 关系
//        f(x > y);
//        f(x >= y);
//        f(x < y);
//        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
        f(x && y);
        f(x || y);
        f(!y);

        // 位
        x = x & y;
        x = x | y;
//        x = ~y;
//        x = x ^ y;
//        x = x << 1;
//        x = x >> 1;
//        x = x >>> 1;

        // 赋值
//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//        x <<= 1;
//        x >>= 1;
//        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
//        byte b = (byte) x;
//        short s = (short) x;
//        char c = (char) x;
//        int i = (int) x;
//        long l = (long) x;
//        float f = (float) x;
//        double d = (double) x;
        boolean bb = (boolean) x;
    }

    void charTest(char x, char y) {
        // 算术
        x = (char) (x + y);
        x = (char) (x - y);
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x++;
        x--;
        x = (char) +y;
        x = (char) -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
        x = (char) (x & y);
        x = (char) (x | y);
        x = (char) ~y;
        x = (char) (x ^ y);
        x = (char) (x << 1);
        x = (char) (x >> 1);
        x = (char) (x >>> 1);

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean bb = (boolean) x;
    }

    void byteTest(byte x, byte y) {
        // 算术
        x = (byte) (x + y);
        x = (byte) (x - y);
        x = (byte) (x * y);
        x = (byte) (x / y);
        x = (byte) (x % y);
        x++;
        x--;
        x = (byte) +y;
        x = (byte) -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
        x = (byte) (x & y);
        x = (byte) (x | y);
        x = (byte) ~y;
        x = (byte) (x ^ y);
        x = (byte) (x << 1);
        x = (byte) (x >> 1);
        x = (byte) (x >>> 1);

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }

    void shortTest(short x, short y) {
        // 算术
        x = (short) (x + y);
        x = (short) (x - y);
        x = (short) (x * y);
        x = (short) (x / y);
        x = (short) (x % y);
        x++;
        x--;
        x = (short) +y;
        x = (short) -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
        x = (short) (x & y);
        x = (short) (x | y);
        x = (short) ~y;
        x = (short) (x ^ y);
        x = (short) (x << 1);
        x = (short) (x >> 1);
        x = (short) (x >>> 1);

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }

    void intTest(int x, int y) {
        // 算术
        x = x + y;
        x = x - y;
        x = x * y;
        x = x / y;
        x = x % y;
        x++;
        x--;
        x = +y;
        x = -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
        x = x & y;
        x = x | y;
        x = ~y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }

    void longTest(long x, long y) {
        // 算术
        x = x + y;
        x = x - y;
        x = x * y;
        x = x / y;
        x = x % y;
        x++;
        x--;
        x = +y;
        x = -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
        x = x & y;
        x = x | y;
        x = ~y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }

    void floatTest(float x, float y) {
        // 算术
        x = x + y;
        x = x - y;
        x = x * y;
        x = x / y;
        x = x % y;
        x++;
        x--;
        x = +y;
        x = -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
//        x = x & y;
//        x = x | y;
//        x = ~y;
//        x = x ^ y;
//        x = x << 1;
//        x = x >> 1;
//        x = x >>> 1;

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
//        x <<= 1;
//        x >>= 1;
//        x >>>= 1;
//        x &= y;
//        x |= y;
//        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }

    void doubleTest(double x, double y) {
        // 算术
        x = x + y;
        x = x - y;
        x = x * y;
        x = x / y;
        x = x % y;
        x++;
        x--;
        x = +y;
        x = -y;

        // 关系
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        // 逻辑
//        f(x && y);
//        f(x || y);
//        f(!y);

        // 位
//        x = x & y;
//        x = x | y;
//        x = ~y;
//        x = x ^ y;
//        x = x << 1;
//        x = x >> 1;
//        x = x >>> 1;

        // 赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
//        x <<= 1;
//        x >>= 1;
//        x >>>= 1;
//        x &= y;
//        x |= y;
//        x ^= y;

        // 窄化转型
        byte b = (byte) x;
        short s = (short) x;
        char c = (char) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
//        boolean b = (boolean) x;
    }
}
