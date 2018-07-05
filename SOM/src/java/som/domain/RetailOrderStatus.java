package som.domain;
// Generated Aug 5, 2010 11:05:49 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * RetailOrderStatus generated by hbm2java
 */
public class RetailOrderStatus  implements java.io.Serializable {


     private Integer rtStatusId;
     private String rtStatusC;
     private String rtStatusDesc;
     private Set<RetailOrders> retailOrderses = new HashSet<RetailOrders>(0);

    public RetailOrderStatus() {
    }

    public RetailOrderStatus(String rtStatusC, String rtStatusDesc, Set<RetailOrders> retailOrderses) {
       this.rtStatusC = rtStatusC;
       this.rtStatusDesc = rtStatusDesc;
       this.retailOrderses = retailOrderses;
    }
   
    public Integer getRtStatusId() {
        return this.rtStatusId;
    }
    
    public void setRtStatusId(Integer rtStatusId) {
        this.rtStatusId = rtStatusId;
    }
    public String getRtStatusC() {
        return this.rtStatusC;
    }
    
    public void setRtStatusC(String rtStatusC) {
        this.rtStatusC = rtStatusC;
    }
    public String getRtStatusDesc() {
        return this.rtStatusDesc;
    }
    
    public void setRtStatusDesc(String rtStatusDesc) {
        this.rtStatusDesc = rtStatusDesc;
    }
    public Set<RetailOrders> getRetailOrderses() {
        return this.retailOrderses;
    }
    
    public void setRetailOrderses(Set<RetailOrders> retailOrderses) {
        this.retailOrderses = retailOrderses;
    }




}

