public class Main {
   public static void main(String[] args) {

      ExcelFile excelFile = new ExcelFile();
      excelFile.processData();

      System.out.println();

      TextFile textFile = new TextFile();
      textFile.processData();

   }
}
