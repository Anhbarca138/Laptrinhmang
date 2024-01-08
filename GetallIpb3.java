package laptrinhmang1;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.net.InetAddress;
public class GetallIpb3 {
    public static void main(String[] args){
        try{
            //lay ve tat ca interface cua may
            Enumeration<NetworkInterface> netInterface
                    =NetworkInterface.getNetworkInterfaces();
            //duyet qua tung giao dien
            while(netInterface.hasMoreElements())
            {
                NetworkInterface networkInterface
                        =netInterface.nextElement();
                //lay danh sach dia chi Ip cua cac giao dien mang
                Enumeration<InetAddress> inetAddress
                        =networkInterface.getInetAddresses();
                //duyet qua tung dia chi Ip va in ra man hinh
                while(inetAddress.hasMoreElements())
                {
                    InetAddress address
                            =inetAddress.nextElement();
                    System.out.println("Interface:" 
                            +networkInterface.getName()
                            +";Dia chi IP: "+address.getHostAddress())
                            ;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
