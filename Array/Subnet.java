import java.util.*;

public class Subnet {
    public static void main(String[] args) {
        String ip = new String();
        Scanner cs = new Scanner(System.in);

        System.out.println("enter the ip address : ");
        ip = cs.next();

        System.out.println("enter the subnet prefix length : ");
        int prefixlength = cs.nextInt();

        String subnetmask = calculatesubnetmask(prefixlength);
        System.out.println("Subnet mask : " + subnetmask);

        String networkAddr = ""; 
        String lastAddr = "";
        String ipAddrParts[] = ip.split("\\.");
        String maskParts[] = subnetmask.split("\\.");
         
        for (int i = 0; i < 4; i++)
         {
             int x = Integer.parseInt(ipAddrParts[i]);
             int y = Integer.parseInt(maskParts[i]);
             int z = x & y;
             networkAddr += z + ".";
             int w = x | (y ^ 255);
             lastAddr += w + ".";
             
         }
         System.out.println("First IP of block: " + networkAddr);
         System.out.println("Last IP of block: " + lastAddr);


    }

    public static String calculatesubnetmask(int prefixlength) {
        int a = 128;
        int b = 0;
        int fullbyte = prefixlength / 8;
        int remainingbits = prefixlength % 8;

        int[] subnet = new int[5];

        for (int i = 0; i < fullbyte; i++) {
            subnet[i] = 255;
        }

        if (remainingbits == 0) {
            while (fullbyte < 4) {
                subnet[fullbyte] = 0;
                fullbyte++;
            }
        } else {
            for (int i = 0; i < remainingbits; i++) {
                b += a;
                a /= 2;
                subnet[fullbyte] = b;
            }
        }

        StringBuilder subnetMaskBuilder = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            subnetMaskBuilder.append(subnet[i]);

            if (i < 3) {

                subnetMaskBuilder.append(".");
            }
        }
        return subnetMaskBuilder.toString();

    }
}
sushantdbansode@gmail.com
RadhaGovind@7