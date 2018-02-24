package jhenkinpackage;

public class mergesort {

	static int[] a = {46,7,21,29,9,1,5,22};
	static int n=a.length;
	public static void main(String[] args) {
	int mid = n/2;
	int[] left = new int[mid];
	int[] right = new int[n-mid];
	
	for(int i=0; i<mid; i++){
	left[i] =a[i];
	}
	System.out.print("Splitted Left Array ");
	display(left, left.length);
	for(int i=mid; i<n;i++)
	{
		right[i-mid] = a[i];
	}
	System.out.print("Splitted Right Array ");
	display(right, right.length);
	sort(left);
	display(left, left.length);
	sort(right);
	display(right, right.length);
	int Ll = left.length;
	int Lr = right.length;
	int i=0, j=0, k=0;
	while(i<Ll && j<Lr){
		if(left[i]<right[j]){
			a[k]=left[i];
			i++;
		}
		else
		{
			a[k]= right[j];
			j++; 
		}
		k++;
	}
		while(i<Ll)
		{
			a[k]= left[i];
			i++; k++;
		}
		
		while(j<Lr)
		{
			a[k]= right[j];
			j++; k++;
		}
	
	display(a, a.length);
	
	}
	
	public static  int[]  sort(int[] x){
		int n=x.length;
		for(int i=1; i<n;i++){
		int j=i;
		int b = x[i];
		while((j>0) && x[j-1]>b){
			x[j]=x[j-1]; 
			j--;
		}		
		x[j]= b;
	}
		return x;
	}
	
	
	public static void display(int[] p, int len)
	{
	for(int k=0; k<len ;k++)
	{
		System.out.print(p[k]);
		System.out.print(",");
	}
	System.out.println("");
	}
	
}
