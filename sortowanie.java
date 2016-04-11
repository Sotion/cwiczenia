
public class sortowanie {
	public static void main(String[] args){
		
		int b = 0;
		int tablica1[] = {1,2,3,4,5,6,7,8,9};
		int tablica2[] = {0,2,4,6,8,6,2,3,2};
		for (int a = 0; a <= tablica1.length; a++)
		{
			if (tablica1[a] == tablica2[b])
			{
			System.out.println(tablica1[a+1]+" "+tablica2[b]);
			}
			else 
				System.out.println(tablica1[a]+" "+tablica2[b]);
			b++;
		}
		}
}
