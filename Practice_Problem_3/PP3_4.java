
public class PP3_4 {
  public static void main(String[] args){
int[] numbers={1,2,5,3,6};

int greatest=numbers[0];
for(int i=1;i<numbers.length;i++){
    if(numbers[i]>greatest){
        greatest=numbers[i];
    }
}
System.out.println("The greatest number is:"+greatest);



  }  
}
