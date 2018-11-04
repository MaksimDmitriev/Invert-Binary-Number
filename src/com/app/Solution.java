package com.app;

public class Solution {

    // Suppose the operation ~ doesn't exist
    public int invertBinaryNumber(int n) {
        int singleOne = 1;
        int singleZero = 0xfffffffe;
        while (singleOne != 0) {
            if ((n & singleOne) == 0) {
                n |= singleOne;
            } else {
                n &= (singleZero);
            }
            singleZero <<= 1;
            singleZero |= 1;
            singleOne <<= 1;
        }
        return n;
    }

}
