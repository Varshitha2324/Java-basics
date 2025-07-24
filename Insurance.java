class Insurance{
 public static void main(String[] args){
int age=53;
System.out.println("Premium  for health insurance.");
if(age>60){
System.out.println(" premium is 5000");
}else if(age>=40 && age<=59){
System.out.println("premium is 3000");
}else if(age>=20 && age<=39){
System.out.println("premium is 1500");
}
else{
System.out.println("premium is 1000");
}
}
}

