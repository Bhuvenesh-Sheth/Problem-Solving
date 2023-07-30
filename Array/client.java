
//Client Side :-
import java.net.*;
import java.io.*;

public class client {
public static void main(String[] args) throws ioexception
{
Socket s = new Socket("localhost",3333);
DataInputStream din = new DataInputStream(s.getInputStream());
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); BufferReader br = new BufferReader(new InputStreamReader(System.in)); int y = din.read();
System.out.println(y); int arr[] = new int[y]; for(int i=0;i<y;i++)
{
arr[i]=din.read(); System.out.println("Receiving frame "+arr[i]); arr[4]=-1;
int temp = 4; for(int j=0; j<y;j++)
{
if(arr[j]==-1)
{
temp=j;
System.out.println("Error frame "+arr[j]);
}
else
{
System.out.println("Receiving frame "+arr[j]);
}
dout.write(temp); arr[temp]=din.read();
System.out.println("Resent frame number "+temp); System.out.println("Final frame ");
for(int k=0;k<y;k++)
{
dout.arr[k];
}
}
din.close();
s.close();
}
}
}
