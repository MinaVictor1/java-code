import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;
import java.util.Scanner;
class HelloWorld { 
    
  static int sum(int n1,int n2){
    int n3=0;
    for(int i=n1;i<=n2;i++){
    n3+=i;
  }
  return n3;
    }
    
public static void main (String[] args) 
  {
    System.out.println(sum(3, 5));
  }
}