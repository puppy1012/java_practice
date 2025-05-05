//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1번
		int[] arr1 = {1, 2, 3, 4, 5};
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
        //2번
        int[] arr2 = {1, 3, 1, 3, 2, 1, 4, 3, 3};
        int frequency=0,count=0,number=0;
        for(int row=0;row<arr2.length;row++) {
            count=0;
            for(int col=1;col<arr2.length;col++) {
                if(arr2[row]==arr2[col]) {
                    count+=1;
                }
            }
            if (count>frequency) {
                frequency=count;
                number=arr2[row];
            }
        }
        System.out.printf("최빈값: %d (출현횟수: %d)\n",number,frequency);

        //3번
        int[] arr3 = {5, 2, 9, 1, 3};
        int tmp=0;
        for(int i =0;i<arr3.length;i++) {
            for(int j=i+1;j<arr3.length;j++) {
                if(arr3[i]>arr3[j]) {
                    tmp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=tmp;
                }
            }
        }
        System.out.print("오름차순 정렬 결과:");
        for(int num:arr3) {
            System.out.printf("%d ",num);
        }
        //4번
        System.out.println();
        int[] arr4 = {1, 2, 3, 2, 1, 4, 3};
        for(int i =0;i<arr4.length;i++) {
            for(int j=i+1;j<arr4.length;j++) {
                if (arr4[i]==arr4[j]){

                }
                if(arr4[i]>arr4[j]) {
                    tmp=arr4[i];
                    arr4[i]=arr4[j];
                    arr4[j]=tmp;
                }
            }
        }
        System.out.print("중복 제거 후 출력: ");
        for(int row=0;row<arr4.length;row++){
            if (row==0||arr4[row]!=arr4[row-1]){
                System.out.print(arr4[row]+" ");
            }
        }


        //5번
        int[] arr5_1 = {1, 2, 3, 4, 5};
        int[] arr5_2 = {3, 4, 5, 6, 7};
        System.out.print("교집합: ");
        for (int i=0;i<arr5_1.length;i++){
            for(int j=0;j<arr5_1.length;j++){
                if (arr5_1[i]==arr5_2[j]){
                    System.out.print(arr5_1[i]+" ");
                }
            }
        }


        //6번
        int[] arr6 = {17, 22, 31, 44, 55, 60, 29};
        int answer=0;
        for (int i=0;i<arr6.length;i++){
            if(arr6[i]%2==0){
                if (arr6[i]>answer){
                    answer=arr6[i];
                }
            }
        }
        if(answer>0){
            System.out.println("짝수 중 최댓값: "+answer);
        }else{
            System.out.println("짝수가 없습니다");
        }

        int[] arr7 = {1, 2, 3, 4, 5};
        tmp=0;
        System.out.print("결과:");
        for (int i=0;i<arr7.length;i++){
            for (int j=i+1;j< arr7.length;j++){
                if (arr7[i]%2==1&arr7[j]%2==1){
                     tmp=arr7[i];
                     arr7[i]=arr7[j];
                     arr7[j]=tmp;
                }
//                System.out.println("i,j="+i+j);
            }
            System.out.print(arr7[i]+" ");
        }
    }
}