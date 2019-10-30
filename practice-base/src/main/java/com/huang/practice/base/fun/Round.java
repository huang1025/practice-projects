package com.huang.practice.base.fun;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数，打印一个回形矩阵；
 */
public class Round {

    private int getNextChange(int lalastChange, int lastChange) {
        if (lastChange == 0) {
            return -lalastChange;
        } else {
            return 0;
        }
    }

    private List<Integer> getList(int width, int lalastIndex, int lastIndex) {
        if (width % 2 == 0) {
            throw new RuntimeException("width cannt be ou shu;");
        }
        int total = width * width;
        int beginIndex = width / 2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(beginIndex);

        int temp = beginIndex;
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j < 2; j++) {
                int next = getNextChange(lalastIndex, lastIndex);
                for (int k = 0; k < i; k++) {
                    temp += next;
                    list.add(temp);
                    if (list.size() == total) {
                        return list;
                    }
                }
                lalastIndex = lastIndex;
                lastIndex = next;
            }
        }
        return list;
    }

    private int[][] getJuZhen(int width) {
        int[][] ints = new int[width][width];
        List<Integer> listX = getList(width, 0, -1);
        List<Integer> listY = getList(width, 1, 0);
        for (int i = 0; i < listX.size(); i++) {
            ints[listX.get(i)][listY.get(i)] = i + 1;
        }
        return ints;
    }

    public static void print(int[][] ints) {
        int length = ints.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Round round = new Round();
        print(round.getJuZhen(3));
    }
}
