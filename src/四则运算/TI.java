package ��������;

import java.util.Scanner;

public class TI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ŀ��������");
		int n = in.nextInt();
		System.out.println("������ÿ����Ŀ����Ŀ��");
		int num= in.nextInt();
		int result[] = new int[n];
		int result_an[] = new int[n];
		String result1[] = new String[n];
		String result_an1[] = new String[n];
		//������������
		for(int i  = 0;i<n/2;i++){
		int x =1+ (int)(Math.random()*100);
		int y = 1+(int)(Math.random()*100);
		int fuhao = 1+(int)(Math.random()*4);
		System.out.print(i+1+": ");
		if(fuhao == 0)
		{
			System.out.print(x+ " + " +y+"    ");
			result_an[i] = in.nextInt();
			result[i] = x+y;
		}
		else if(fuhao == 1)
		{
			if(x<y)
			{
				System.out.print(y+ " - " +x+"    ");
				result_an[i] = in.nextInt();
				result[i] = y-x;
			}
			else
				{
				System.out.print(x+ " - " +y+"    ");
				result_an[i] = in.nextInt();
				result[i] = x-y;}
		}
		else if(fuhao ==2){
			System.out.print(x+ " * " +y+"    ");
			result_an[i] = in.nextInt();
			result[i] = x*y;
		}
		else
			{
			System.out.print(x+ " / " +y+"    ");
			result_an1[i] = in.next();
			result1[i] = huajian(x,y);
			}
		if((i+1)%num ==0)
		{
			System.out.print("\r");
		}
		}
		//������������
		for(int i = n/2;i<n;i++)
		{
			int a =1+ (int)(Math.random()*10);
			int b = 1+(int)(Math.random()*10);
			int c = 1+(int)(Math.random()*10);
			int d = 1+(int)(Math.random()*10);
			int e;
			int fuhao = 1+(int)(Math.random()*4);
			
			if(a>b)
			{
				e = a;
				a = b;
				b = e;
			}
			if(c>d)
			{
				e = c;
				c = d;
				d = e;
			}
			String x = a+"/"+b;
			String y = c+"/"+d;
			System.out.print(i+1+": ");
			if(fuhao == 0)
			{
				System.out.print(x+ " + " +y+"    ");
				a = a*d+b*c;
				b = b*d;
				result_an1[i] = in.next();
				result1[i] = huajian(a,b);
			}
			else if(fuhao == 1)
			{
				if(a/b<c/d)
				{
					System.out.print(y+ " - " +x+"    ");
					a = b*c-a*d;
					b = b*d;
					result_an1[i] = in.next();
					result1[i] = huajian(a,b);
				}
				else
					System.out.print(x+ " - " +y+"    ");
				a = a*d-b*c;
				b = b*d;
				result_an1[i] = in.next();
				result1[i] = huajian(a,b);
			}
			else if(fuhao ==2){
				System.out.print(x+ " * " +y+"    ");
				a = a*c;
				b = b*d;
				result_an1[i] = in.next();
				result1[i] = huajian(a,b);
			}
			else{
				System.out.print(x+ " / " +y+"    ");
				a = a*d;
				b = b*c;
				result_an1[i] = in.next();
				result1[i] = huajian(a,b);
			}	
			if((i+1)%num==0)
				System.out.print("\r");
		}
		System.out.println("�����꣬��1�ɲ鿴��");
		int number = in.nextInt();
		in.close();
		if(number == 1){
		for(int i= 0;i<n;i++){
			System.out.print(i+1+":");
			if(result1[i]!=null){
				if(result1[i].equals(result_an1[i]))
				System.out.println("��ȷ");
				else
					System.out.println("������ȷ��Ϊ"+result1[i]);
				}
			else
				if(result[i]==result_an[i])
					System.out.println("��ȷ");
				else
				System.out.println("������ȷ��Ϊ"+result[i]);
		}
		}
	}
	public static String huajian(int a,int b){
		if(a<b)
		{
			for(int i = a;i>0;i--){
			if(a%i==0&&b%i==0){
				a/=i;
				b/=i;
				break;
			}}
		}
		else{

			for(int i = b;i>0;i--){
			if(a%i==0&&b%i==0){
				a/=i;
				b/=i;
				break;
			}}
				
			}
		
		return a+"/"+b;
	}
}
