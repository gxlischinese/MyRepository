package test;

import redis.clients.jedis.Jedis;

public class Test1 {

    // ��������
    public static int[] getArr(int length, int start, int end) {
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            int n = (int) Math.round(Math.random() * (end - start) + start);
            boolean boo = false;
            if (n != 0) {
                for (int j = 0; j < i; j++) {
                    if (n == arr[j]) {
                        boo = true;
                        break;
                    }
                }
            } else {
                System.out.println(" n Ϊ 0");
            }
            if (!boo) {
                arr[i] = n;
            } else {
                i--;
            }
        }
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + "ֵ�ظ�");
                    break;
                }
            }
        }
        return arr;
    }

    // ��Ŀ���������ѡ������
    public static void orderArr(int[] arr) {
        int minNum;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            minNum = arr[i];

            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minNum > arr[j]) {
                    minNum = arr[j];
                    index = j;
                }
            }
            arr[i] = minNum;
            arr[index] = temp;
            System.out.println();
            for (Object k : arr) {
                System.out.print(k + " ");
            }
        }
    }

   public static void main(String[] args) {
       for (String arg : args) {
           System.out.println("����ʱ�Ĳ����� " + arg);
       }
       System.out.println("kkd");
       System.out.println("kkd");
       System.out.println("kkd");
   }
}
