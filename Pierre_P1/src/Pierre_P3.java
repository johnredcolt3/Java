
import java.util.Scanner;
public class Pierre_P3 {
	final static int numTopics=5;
	static Scanner scnr=new Scanner (System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Enter the # of Users: ");
	int numUsers = scnr.nextInt();
	String topic[]={"Climate control","Financial stability","Ice immigration","Health","Children"};
	int ratings[][]=new int[5][10];
	Input(numUsers,topic,ratings);
	System.out.println("\n\nRatings are:\n\n");
	printTable(topic,ratings);
	System.out.println("");
	maxPoint(topic, ratings);
	lowPoint(topic, ratings);
	}

	public static void Input(int numUsers,String[] topic, int[][] ratings) {
	for(int x=0;x<numTopics;x++)
	{
		for(int y=0;y<numUsers;y++)
		{
			System.out.print("Enter user " +(y+1)+ " rating for the topic '"+topic[x]+" :");
			ratings[x][y]=scnr.nextInt();
		}
		System.out.println("");
	}
	}

	public static void printTable(String[] topic, int[][] ratings) {
	double avg;
	  
	System.out.println("Topic               "+"Ratings             "+"Average Rating");
	for(int x=0;x<numTopics;x++)
	{
	avg=getAvg(ratings[x]);
	if(x==0)
	{
	System.out.println( topic[x]+"     "+ratings[x][0]+" "+ratings[x][1]+" "+ratings[x][2]+" "+ratings[x][3]+" "+ratings[x][4]+
			" "+ratings[x][5]+" "+ratings[x][6]+" "+ratings[x][7]+" "+ratings[x][8]+" "+ratings[x][9]+"       "+avg);
	}
	if(x==1)
	{
	System.out.println( topic[x]+" "+ratings[x][0]+" "+ratings[x][1]+" "+ratings[x][2]+" "+ratings[x][3]+" "+ratings[x][4]+
			" "+ratings[x][5]+" "+ratings[x][6]+" "+ratings[x][7]+" "+ratings[x][8]+" "+ratings[x][9]+"       "+avg);
	}
	if(x==2)
	{
	System.out.println( topic[x]+"     "+ratings[x][0]+" "+ratings[x][1]+" "+ratings[x][2]+" "+ratings[x][3]+" "+ratings[x][4]+
			" "+ratings[x][5]+" "+ratings[x][6]+" "+ratings[x][7]+" "+ratings[x][8]+" "+ratings[x][9]+"       "+avg);
	}
	if(x==3)
	{
	System.out.println( topic[x]+"              "+ratings[x][0]+" "+ratings[x][1]+" "+ratings[x][2]+" "+ratings[x][3]+" "+ratings[x][4]+
			" "+ratings[x][5]+" "+ratings[x][6]+" "+ratings[x][7]+" "+ratings[x][8]+" "+ratings[x][9]+"       "+avg);
	}
	if(x==4)
	{
	System.out.println( topic[x]+"            "+ratings[x][0]+" "+ratings[x][1]+" "+ratings[x][2]+" "+ratings[x][3]+" "+ratings[x][4]+
			" "+ratings[x][5]+" "+ratings[x][6]+" "+ratings[x][7]+" "+ratings[x][8]+" "+ratings[x][9]+"       "+avg);
	}
	
	}
	  
	}
	private static void maxPoint(String[] topic,int[][] ratings)
	{
	int maxPoint=getSum(ratings[0]);
	int point;
	int maxIndex=0;
	for(int i=0;i<numTopics;i++)
	{
	point=getSum(ratings[i]);
	if(point>maxPoint)
	{
	maxPoint=point;
	maxIndex=i;
	}
	}
	System.out.println("The top rated topic is "+topic[maxIndex]+" and the total rating is "+maxPoint );
	  
	}
	private static void lowPoint(String[] topic,int[][] ratings)
	{
	int minPoint=getSum(ratings[0]);
	int point;
	int minIndex=0;
	for(int i=0;i<numTopics;i++)
	{
	point=getSum(ratings[i]);
	if(point<minPoint)
	{
	minPoint=point;
	minIndex=i;
	}
	}
	System.out.println("The lowest rated topic is "+topic[minIndex]+" and the total rating is "+minPoint );
	  
	}
	private static double getAvg(int[] rating) {
	return getSum(rating)/(double)rating.length;
	}
	  
	private static int getSum(int []rating)
	{
	int sum=0;
	for(int i=0;i<rating.length;i++)
	sum+=rating[i];
	return sum;
	}
	}


