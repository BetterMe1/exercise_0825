package exercise.exercise_0824;

/**
 * @Description:京东笔试
 * @Author:Anan
 * @Date:2019/8/24
 */
/**
 * 合唱队形
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num =  new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int result = 1;
        int max = num[0];
        int min = 0;
        for(int i=1; i<n; i++){
            if(num[i-1] > max){
                max = num[i-1];
            }
            min = min(num,i,n-1);
            if(max <= min){
                result++;
            }
        }
        System.out.println(result);
    }
    public static int min(int[] arr,int i,int j){
        int min = arr[i];
        for(; i<=j; i++){
            if(arr[i] <min){
                min = arr[i];
            }
        }
        return min;
    }
}




/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        List<Num> num = new ArrayList<>();
        boolean flag = true;
        int count = 0;
        for(int i=0; i<n; i++){
            if(IsA(str.charAt(i))== flag) {
                count++;
            }else{
                num.add(new Num(flag,count));
                flag = IsA(str.charAt(i));
                count = 1;
            }
        }
        if(count>0){
            num.add(new Num(flag,count));
        }
        int result = 0;
        boolean f = false;//是否大写锁定
        for(int i=0; i<num.size(); i++){
            if(num.get(i).count == 0){
                continue;
            }
            if(num.get(i).flag){//大写
                if(!f){
                    if(num.get(i).count > 1){
                        result ++; //大写锁定
                        f = true;
                    }else{
                        result++;
                        i++;//跳过一个
                    }
                }
            }else{//小写
                if(f){
                    if(num.get(i).count > 1){
                        result ++; //去除大写锁定
                        f = false;
                    }else{
                        result++;
                        i++;//跳过一个
                    }
                }
            }
        }
        System.out.println(result+n);
    }
    private static boolean IsA(char a){
        if ('A' <= a && a <= 'Z') {
            return true;
        }
        return false;
    }
}
class Num{
    boolean flag;//是否是大写字母
    int count = 0;//连续长度

    public Num(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }
}

*/
