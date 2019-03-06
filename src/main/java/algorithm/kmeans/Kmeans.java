package algorithm.kmeans;

import common.bean.Tuple;

/**
 * 一维数组聚类
 */
public class Kmeans {
    /**
     * @param p 待聚类数组
     * @param k 类别数量
     * @return
     */
    public static Tuple<int[], int[][]> cluster(int[] p, int k) {
        int[] c = new int[k];
        int[] nc = new int[k];
        Tuple<int[], int[][]> result = new Tuple<>();
        int[][] g;
        for (int i = 0; i < k; i++)
            c[i] = p[i];
        while (true) {
            g = group(p, c);
            for (int i = 0; i < g.length; i++) {
                nc[i] = center(g[i]);
            }
            if (!equal(nc, c)) {
                c = nc;
                nc = new int[k];
            }
            else
                break;
        }
        result.setFirst(nc);
        result.setSecond(g);
        return result;
    }

    /**
     * 聚类中心函数
     * 简单的一维聚类返回其算数平均值
     */
    public static int center(int[] p) {
        if (p.length == 0) {
            return -1;
        }
        return sum(p) / p.length;
    }


    /**
     * 给定 double 型数组 p 和聚类中心 c。
     * 根据 c 将 p 中元素聚类。返回二维数组。
     * 存放各组元素。
     */
    public static int[][] group(int[] p, int[] c) {
        int[] gi = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int[] d = new int[c.length];
            for (int j = 0; j < c.length; j++) {
                d[j] = distance(p[i], c[j]);
            }
            int ci = min(d);
            gi[i] = ci;
        }
        int[][] g = new int[c.length][];
        for (int i = 0; i < c.length; i++) {
            int s = 0;
            for (int j = 0; j < gi.length; j++)
                if (gi[j] == i)
                    s++;
            g[i] = new int[s];
            s = 0;
            for (int j = 0; j < gi.length; j++) {
                if (gi[j] == i) {
                    g[i][s] = p[j];
                    s++;
                }
            }
        }
        return g;
    }


    /**
     * 计算两个点之间的距离，这里采用最简单得一维欧氏距离
     */
    public static int distance(int x, int y) {
        return Math.abs(x - y);
    }

    /**
     * 返回给定 double 数组各元素之和。
     */
    public static int sum(int[] p) {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i];
        }
        return sum;
    }


    /**
     * 给定 double 类型数组，返回最小值得下标。
     */
    public static int min(int[] p) {
        int i = 0;
        double m = p[0];
        for (int j = 1; j < p.length; j++) {
            if (p[j] < m) {
                i = j;
                m = p[j];
            }
        }
        return i;
    }


    /**
     * 判断两个 int 数组是否相等。 长度一样且对应位置值相同返回真。
     */
    public static boolean equal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
        }
        return true;
    }
}

