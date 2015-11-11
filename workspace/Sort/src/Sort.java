import javax.swing.JOptionPane;

public class Sort {

	public static void main(String[] args) {
		
		
		
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter num 1:"));	
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter num 2:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter num 3:"));	
		int d = Integer.parseInt(JOptionPane.showInputDialog("Enter num 4:"));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Enter num 5:"));	
		int f = Integer.parseInt(JOptionPane.showInputDialog("Enter num 6:"));
		int g = Integer.parseInt(JOptionPane.showInputDialog("Enter num 7:"));
		int h = Integer.parseInt(JOptionPane.showInputDialog("Enter num 8:"));
		int i = Integer.parseInt(JOptionPane.showInputDialog("Enter num 9:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Enter num 10:"));	
		
		int num[] = {a,b,c,d,e,f,g,h,i,j};
		
		for(int i1 =0;i1<num.length;i1++)
			for(int x = i1 + 1;x<num.length;x++)
				if(num[i1]>num[x])
				swap(num,i1,x);
		
		for(int k = 0; k<num.length;k++){
			
			
			System.out.println(num[k]);
			
		}
		
		
		
		
	}

	public static void swap(int [] arr, int smallestInt, int x){
		
		int start = arr[smallestInt];
		smallestInt = arr[x];
		arr[x] = start;
	}
	
	
}
