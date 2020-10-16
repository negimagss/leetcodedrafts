package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GoogleFun3HeyIAlreadyDidThat
{
    public static void main(String args[])
    {
        System.out.println(solution("210022",3));
    }
    public static int solution(String n, int b)
    {
        List<String> arr = new ArrayList<String>();

        // storing length of string k
        int k = n.length();

        while(!arr.contains(n))
        {
            arr.add(n);
            int nInt = Integer.parseInt(n);
            int[] nIntegerArray = new int[k];
            int ptr = 0;
            while(nInt>0)
            {
                nIntegerArray[ptr] = nInt % 10;
                nInt = nInt / 10;
                ptr = ptr + 1;
            }
            Arrays.sort(nIntegerArray);
            String nString = "";
            int lenIntegerArray = nIntegerArray.length;
            int temp = 0;
            while(lenIntegerArray!=temp)
            {
                nString = nString + nIntegerArray[temp];
                temp = temp + 1;
            }

            String xString = "";
            int index = lenIntegerArray - 1;
            while(index>=0)
            {
                xString = xString + nIntegerArray[index];
                index = index - 1;
            }

            int xBase10 = Integer.parseInt(xString,b);
            int yBase10 = Integer.parseInt(nString,b);
    
            int zBase10 = xBase10 - yBase10;
            String z = Integer.toString(zBase10,b);

            boolean flag = true;
            String zero = "0";
            while (flag)
            {
                if (z.length()<k)
                {
                    z = zero + z;
                }
                else
                {
                    flag = false;
                }
            }

            n = z;
        }

        int indexCycle = arr.indexOf(n);
        int lengthCycle = arr.size() - indexCycle;
        return lengthCycle;
    }
}
