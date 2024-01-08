package laptrinhmang1;
import java.net.InetAddress;
public class GetIPb2 {
    public static void main (String[] args){
        //lay dia chi ip cua 1 sever
        try{
            InetAddress inet=InetAddress.getByName("www.tiktok.com");
            //inradiachi ip
            System.out.println("Dia chi ip cua trang web tiktok.com la :"+
                    inet.getHostAddress());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
