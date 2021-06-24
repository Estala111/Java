package com.powernode;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner imput=new Scanner(System.in);
        System.out.print("输入3个数：");
        double num1=imput.nextDouble(),num2=imput.nextDouble(),num3=imput.nextDouble();

        if(num1>=num2){
           if(num2>=num3){System.out.println("从大到小排序为："+num1+" "+num2+" "+num3);}
            else if(num3>=num1){System.out.println("从大到小排序为："+num3+" "+num1+" "+num2);}
            else{System.out.println("从大到小排序为："+num1+" "+num3+" "+num2);}
        }

        else if(num1<num2){
            if(num2<=num3){System.out.println("从大到小排序为："+num3+" "+num2+" "+num1);}
            else if(num3<num1){System.out.println("从大到小排序为："+num2+" "+num1+" "+num3);}
            else{System.out.println("从大到小排序为："+num2+" "+num3+" "+num1);}
        }
        System.out.println("结束");

    }
}
