package Laptrinhmang1;
import java.net.InetAddress;
public class Laptrinhmang1{
  public static void main(String[] args){
     try {
          //lay dia chi ip cua mot trang web
          InetAddress inet=InetAddress.getByName("www.tiktok.com");
          //thu ket noi trong thoi gian 5 giay 
          boolean isKN=inet.isReachable(5000);
          //in ra thong bao
          if (isKN)
          {
           System.out.println("Co internet");   
          }
          else
          {
           System.out.println("Khong ket noi dujoc voi internet");   
          }
     } catch (Exception e){
         e.printStackTrace();
    }  
}
