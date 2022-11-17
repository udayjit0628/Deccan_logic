import java.io.*;

class SubSequence
{

static boolean isSubSequence(String str1, String str2, int a, int b)

{

    if(a == 0)

    return true;

    if(b == 0)

    return false;

    if(str1.charAt(a-1) == str2.charAt(b-1))

    return isSubSequence(str1, str2, a - 1, b - 1);

    return isSubSequence(str1, str2, a, b-1);
}

public static void main(String args[]){

    String str1 = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more or less normal distribution of letters, as opposed to using Content here content here making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will uncover many web sites still in their infancy Various versions have evolved over the years sometimes by accident sometimes on purpose injected humour and the like";

    String str2 =  "is";

    int a = str1.length();

    int b = str2.length();

    boolean res = isSubSequence(str1, str2, a, b);

    if(res)

    System.out.println();

    else{
    
    System.out.println("uday");


    }


}

}