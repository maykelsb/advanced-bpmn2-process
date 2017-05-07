package com.redhat.example.sv_model.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewOrder implements java.io.Serializable
{


   private java.util.Date hoaMeetingDate;

   private boolean hoaApproval;


   public NewOrder()
   {
   }

   public java.util.Date getHoaMeetingDate()
   {
      return this.hoaMeetingDate;
   }

   public void setHoaMeetingDate(java.util.Date hoaMeetingDate)
   {
      this.hoaMeetingDate = hoaMeetingDate;
   }

   public boolean isHoaApproval()
   {
      return this.hoaApproval;
   }

   public boolean hasHoaApproval()
   {
      return this.hoaApproval;
   }

   public boolean getHoaApproval()
   {
      return this.hoaApproval;
   }

   public void setHoaApproval(boolean hoaApproval)
   {
      this.hoaApproval = hoaApproval;
   }

   public String toString()
   {
      return "New Order Date: " + this.getHoaMeetingDate() + ", Hoa approval:" + this.hasHoaApproval();

   }

  

   public NewOrder(java.util.Date hoaMeetingDate, boolean hoaApproval,)
   {
      this.hoaMeetingDate = hoaMeetingDate;
      this.hoaApproval = hoaApproval;
   }
}
}