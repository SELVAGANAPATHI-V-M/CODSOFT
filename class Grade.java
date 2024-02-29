class Grade{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Subjects);
int no_of_sub=sc.nextInt();
int arr[]=new int[no_of_sub];
for(i=0;i<no_of_sub;i++){
arr[i]=sc.nextInt();
total+=arr[i];
}
avg_perc=total/no_of_sub;
System.out.println("Total Marks : "+total);
System.out.println("Average Marks : "+avg_perc);
if(avg_perc>=90){
System.out.println("Grade A");
}
else if(avg_perc>=80 && avg_perc<89){
System.out.println("Grade B");
}
else if(avg_perc>=70 && avg_perc<79){
System.out.println("Grade C");
}
else if(avg_perc>=60 && avg_perc<69){
System.out.println("Grade D");
}
else if(avg_perc>=50 && avg_perc<59){
System.out.println("Grade E");
}
else{
System.out.println("Sorry No Grade (Fail) ");
}
}
}