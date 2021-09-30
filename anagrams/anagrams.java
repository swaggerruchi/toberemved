import java.util.Scanner;
import java.util.*;

class anagrams{


public static void main(String[] args){



Scanner sc = new Scanner(System.in);

String s1, s2;

System.out.println("Enter s1\n");

s1 = sc.nextLine();

System.out.println("Enter s2\n");

s2 = sc.nextLine();

boolean ana = false;

if(s1.length() != s2.length()){

System.out.println("Not anagrams\n");

}

else{

char [] s1a = s1.toCharArray();
char [] s2a = s2.toCharArray();

Arrays.sort(s1a);
Arrays.sort(s2a);

ana = Arrays.equals(s1a, s2a);

if(ana == true){

System.out.println("anagrams\n");
}


else{

System.out.println("Not anagrams\n");

}


}







}



}