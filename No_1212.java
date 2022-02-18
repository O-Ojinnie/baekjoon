/*
*  <BaekJoon No.1212>
*
*  Summary : 8진수가 주어졌을 때 , 2진수로 변환하는 프로그램
*  Author : Jinnie
*
*/

import java.util.Scanner;
public class No_1212 {

    public static void RangeException(int input_Oct) throws Exception{
        if((int)(Math.log10(input_Oct)+1)>333334){
            throw new Exception("수의 길이가 333,334를 초과하였습니다.");
        }
    }

    public static void main(String args[]){

        System.out.println("8진수를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String arr[] = new String[input.length()];
        arr = spliter(input);

        String[] integerArr = {"000","001","010","011","100","101","110","111"};
        int[] subIntarr = new int[input.length()];

        StringBuffer result = new StringBuffer();
        for(int i = 0; i<input.length(); i++) {
            result.append(integerArr[Integer.parseInt(arr[i])]);
        }
        if(Integer.parseInt(arr[0])<2){
            result.deleteCharAt(0);
            result.deleteCharAt(0);
        }
        else if(Integer.parseInt(arr[0])<4){
            result.deleteCharAt(0);
        }
        System.out.println(result);
    }

    public static String[] spliter(String input){

        String[] arr = new String[input.length()];

        for(int i =0; i<input.length(); i++){
            //System.out.println(input.substring(i,i+1));
            arr[i] = input.substring(i,i+1);
        }
        return arr;
    }


}
