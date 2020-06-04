package control;

import insurnaceTool.underWriter;

public class cUnderWriter {
   private underWriter underWriter;

   public cUnderWriter() {
      this.underWriter = new underWriter();
   }

   public void sendAcceptMessage(int i) {
      this.underWriter.sendAcceptMessage(i);
      this.underWriter.calculatePremiumRate();
   }

   public void setDriver(String driver) {
      this.underWriter.setDriver(driver);
   }

   public void setSolider(String solider) {
      this.underWriter.setSolider(solider);
   }

   public void setFieldJob(String fieldJob) {
      this.underWriter.setFieldJob(fieldJob);
   }

   public void setPlaneCaptain(String planeCaptain) {
      this.underWriter.setPlaneCaptain(planeCaptain);
   }

   public void setStewardess(String stewardess) {
      this.underWriter.setStewardess(stewardess);
   }

   public void setCaptain(String captain) {
      this.underWriter.setCaptain(captain);
   }

   public void setSailor(String sailor) {
      this.underWriter.setSailor(sailor);
   }

   public void setEtc(String etc) {
      this.underWriter.setEtc(etc);
   }

   public void runUnderWriter() {
      this.underWriter.CalculatePremiumRate();
   }

}