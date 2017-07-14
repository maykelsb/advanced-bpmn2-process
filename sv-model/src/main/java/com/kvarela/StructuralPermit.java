package com.kvarela;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class StructuralPermit extends com.kvarela.Permit implements java.io.Serializable 
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "STRUCTURALPERMIT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "STRUCTURALPERMIT_ID_GENERATOR", sequenceName = "STRUCTURALPERMIT_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String address;

   private java.lang.String status;

   public StructuralPermit()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
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

   public StructuralPermit(java.lang.Long id, java.lang.String address,
         java.lang.String status)
   {
      this.id = id;
      this.address = address;
      this.status = status;
   }

}