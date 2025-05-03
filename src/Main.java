//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1번
//		int[] arr1 = {1, 2, 3, 4, 5};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
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
    }
}