import java.io.*;
import java.util.*;
class check_EVEN_ODD
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            int count1=0,count2=0,rem;
            for(;numb!=0;)
            {
                rem = numb % 10;
                
                if(rem%2 == 0)
                {
                    count1 = count1 +1;
                }
                else
                {
                    count2 = count2 +1;
                }
                numb = numb/10;
            }
            System.out.println("the number of even numbers are are"+ count1);
            System.out.println("the number of odd numbers are are"+ count2);
        }
    }