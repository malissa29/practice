package Array;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A []=new int[5];
		PopulateA(A);
		
		System.out.println("Before Sorting");
		PrintA(A);
		
		A= merge_sort(A);
		System.out.println("\nAfter Sorting");
		PrintA(A);
	}
	
	public static int[] merge_sort(int [] B)
	{
		int [] result = new int [B.length];
		int midPoint= B.length/2;
		int [] leftArray= new int[midPoint];
		int [] rightArray;
		
		if(B.length <= 1)
		{
			return B;
		}
		
		else
		{
		
		if(B.length % 2 == 0)
		{
			rightArray= new int [midPoint];
		}
		else
		{
			rightArray= new int [midPoint+1];
		}
		
		
		
		for(int i= 0; i< midPoint; i++)
		{
			leftArray[i]= B[i];
		}
		
		int x=0;
		for(int j= midPoint; j< B.length; j++)
		{
			if(x < rightArray.length)
			{
				rightArray[x]= B[j];
				x++;
			}

		}
		
		leftArray= merge_sort (leftArray);
		rightArray= merge_sort (rightArray);
		}
		
		
		result=	merge(leftArray,rightArray);
		
		return result;
	}
	
	public static int[] merge(int [] leftArray, int [] rightArray)
	{
	int lengthResult= leftArray.length + rightArray.length;
	int [] result= new int [lengthResult];
	int indexL=0;
	int indexR=0;
	int indexRes=0;
	
	while(indexL < leftArray.length || indexR < rightArray.length)
	{
		if(indexL < leftArray.length && indexR < rightArray.length)
		{
			if(leftArray[indexL] <= rightArray[indexR])
			{
				result[indexRes]= indexL;
				indexL++;
				indexRes++;
			}
			else 
			{
				result[indexRes]= indexR;
				indexR++;
				indexRes++;
			}
			
		}
		else if (indexL < leftArray.length)
		{
			result[indexRes]= indexL;
			indexL++;
			indexRes++;
		}
		else if (indexR < rightArray.length)
		{
			result[indexRes]= indexR;
			indexR++;
			indexRes++;
		}
		
		
		
	}
	return result;
	}
	
	
	
	public static int[] PopulateA(int [] A) {
		for(int i= 1; i<A.length; i++)
		{
			A[i]=(int)(Math.random() *10);
		}
		return A;
	}
	
	public static void PrintA(int [] A)
	{
		for(int i= 1; i<A.length; i++)
		{
			System.out.println(A[i] + " ");
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	}

}
