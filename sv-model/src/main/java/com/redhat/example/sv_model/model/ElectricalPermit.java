package com.redhat.example.sv_model.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ElectricalPermit implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String owner;
   private String submitDate;
   private java.lang.Double totalCost;

   private java.lang.String address;

   private java.lang.String status;

   private java.lang.Integer id;

   public ElectricalPermit()
   {
   }

   public java.lang.String getOwner()
   {
      return this.owner;
   }

   public void setOwner(java.lang.String owner)
   {
      this.owner = owner;
   }

   public java.lang.Double getTotalCost()
   {
      return this.totalCost;
   }

   public void setTotalCost(java.lang.Double totalCost)
   {
      this.totalCost = totalCost;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public String toString()
   {
      return "owner " + this.owner +
            "submitDate " + submitDate +
            "totalCost" + totalCost +
            "address" + address +
            "id" + id +
            "status " + status;
   }

   public java.lang.String getSubmitDate()
   {
      return this.submitDate;
   }

   public void setSubmitDate(java.lang.String submitDate)
   {
      this.submitDate = submitDate;
   }

   public ElectricalPermit(java.lang.String owner, java.lang.String submitDate,
         java.lang.Double totalCost, java.lang.String address,
         java.lang.String status, java.lang.Integer id)
   {
      this.owner = owner;
      this.submitDate = submitDate;
      this.totalCost = totalCost;
      this.address = address;
      this.status = status;
      this.id = id;
   }

}