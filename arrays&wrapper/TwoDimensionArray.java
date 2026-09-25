public class TwoDimensionArray {
    public static void main(String[] args){
        int[][] marks={{90,80,70},{60,50,40}};
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
