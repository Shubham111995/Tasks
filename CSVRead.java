import java.io. * ;
import java.util.Scanner;
public class CSVRead 
{
  public static void main(String[] args) throws Exception 
  {
    Scanner sc = new Scanner(new File(""C:\Users\Asus\Downloads\Sample-Spreadsheet-10-rows.csv"")); 
    sc.useDelimiter(",");
    while (sc.hasNext()) 
    {
      System.out.print(sc.next());
    }
    sc.close();
  }
}
