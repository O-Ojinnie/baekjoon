import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class No_5597 {

    public final class Constants{

        public static final int StudentNumber = 30;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int first = 0;
        int twice = 0;
        //StringBuffer compare = new StringBuffer();
        int compare[] = new int[Constants.StudentNumber];
        for(int i = 1; i<Constants.StudentNumber+1; i++){
            compare[i-1]=i;
        }

        int arr[] = new int[Constants.StudentNumber];
        System.out.println(arr.length);
        System.out.println(compare.length);
        //배열의 첫번째 인덱스부터 채워야하므로 i=0부터 시작
        //28명의 입력을 받는 부분
        for(int j = 0; j<Constants.StudentNumber-2; j++){
            //System.out.println("입력"+(j+1)+" : ");
            arr[j]= sc.nextInt();
            //System.out.println("내부 값 : "+arr[j]);

            //1~30번중에 제출한 28명을 0으로 바꿔주는 부분
            compare[arr[j]-1] = 0;

        }
        for(int i = 0; i<30; i++){
            if(compare[i]!=0 && first==0){
                first = compare[i];
            }
            else if(compare[i]!=0 && first!=0){
                twice = compare[i];
            }
        }
        System.out.println(first);
        System.out.println(twice);

    }
}

