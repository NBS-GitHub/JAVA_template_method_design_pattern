public class ExcelFile extends DataProcessor {

   @Override
   public void readData(){
      System.out.println("Read data from the excel file.");
   }

   @Override
   public void modifyData(){
      System.out.println("Process data from the excel file.");
   }

}
