public class SortedMatrix {
    public static void main(String[] args) {

    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(target<matrix[row][mid]){
                cEnd=mid-1;
            }else if(target>matrix[row][mid]){
                cStart=mid+1;
            }
            else{
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if (rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(target==matrix[mid][cMid]){
                return new int[]{mid,cMid};
            } else if (target<matrix[mid][cMid]){
                rEnd=mid;
            }else{
                rStart=mid;
            }
        }

        //now we have around 2 rows available in the matrix
        //checking whether the target is ain the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        else if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //searching in the first half
        if(target<=matrix[rStart][cMid]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //searching in the second half
        if(target>=matrix[rStart][cMid]&&target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //searching in the third half
        if(target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //searching in the 4th half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }
}
