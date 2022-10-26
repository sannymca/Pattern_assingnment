public class RemoveDuplicate 
{
    public static void main(String args[])
    {
        String str="Raja";
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
         int idx=str.indexOf(ch, i+1);
         // System.out.println(idx);
           if(idx==-1)
           {
                sb1.append(ch);
            }

    }
System.out.println(sb1);
}
    
}
