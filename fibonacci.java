import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;

import java.util.Arrays;

import java.util.Scanner;
/*
n-------->0 1 2 3 4 5 6 7 8 9 10 11.....
result--->0 1 1 2 3 5 8 13 21 34 55..... 
*/
class HelloWorld { 
  static int fibonacci(int n){
    if(n==0 || n==1){
      return n;
    }else{
      return(fibonacci(n-1)+fibonacci(n-2));
    }
    }
public static void main (String[] args) 
  {
    System.out.println(fibonacci(5));
  }
}