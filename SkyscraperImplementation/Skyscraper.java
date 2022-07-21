package SkyscraperImplementation;

import java.util.Arrays;
import java.util.Scanner;

public class Skyscraper {
	
	
		public static void main(String[] args) {
 int floor;
 System.out.println("enter the total no of floors in the building");
 Scanner sc= new Scanner(System.in);
 floor=sc.nextInt();
 int array[]=new int[floor];
 
 for(int i=0;i<floor;i++) {
	 System.out.println("enter the floor size given on day :"+(i+1));
	 array[i]=sc.nextInt();
 }
 //checking duplcates
 for (int i = 0; i < floor - 1; i++) {
	    for (int j = i + 1; j < floor; j++) {
	        if (array[i] == array[j]) {
	            System.out.println("The arrays contains duplicates");
	            return;
	        }
	    }
	}
 System.out.println("The order of construction is as follows");

 int flag=-1;
 
 Skyscraper skyscraper = new Skyscraper();
skyscraper.rec(array, flag);
 
 
}
	
	void rec(int arr[],int flag)
{  int max = arr[0];

int max_pos=0;
int max_next=0;
int arr_p[]= new int[arr.length];
int check=0;


for (int i = 0; i < arr.length; i++)
    {if (arr[i] > max)
    { max = arr[i];
    max_pos=i;
         }
}

for(int i=(flag+1);i<max_pos;i++) {
	System.out.println("Day"+(i+1));
	
}
System.out.println("Day"+(max_pos+1));
System.out.println(arr[max_pos]);
arr[max_pos]=0;
int temp=0;
for (int i = max_pos; i < arr.length; i++)
{if (arr[i] > temp)
    max_next = arr[i];
     
}
int j=0;
for(int i=0;i<max_pos;i++) {
	if(arr[i]>max_next) {
		arr_p[j]=arr[i];
		j++;
		arr[i]=0;
	}
}
Arrays.sort(arr_p);
for(int i=(arr_p.length-1);i>=0;i--) {
	if(arr_p[i]!=0) {System.out.println(arr_p[i]);}
	
}
flag=max_pos;

for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {check=1;
	break;}}
	if(check==0) {return;}
	rec(arr,flag);

}}
