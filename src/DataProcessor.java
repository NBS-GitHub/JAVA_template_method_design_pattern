public abstract class DataProcessor {

   public void processData() {
      readData();
      modifyData();
      saveData();
   }

   public abstract void readData();
   public abstract void modifyData();

   public void saveData(){
      System.out.println("Save data to Db.");
   }

}
