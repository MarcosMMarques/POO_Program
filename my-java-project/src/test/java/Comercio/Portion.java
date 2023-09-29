/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comercio;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Portion {
    private BigDecimal value;
    private LocalDate expireDate;
    private LocalDate dueDate;
    private Payment payment;
    
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
        public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    //</editor-fold>    

    public BigDecimal readjustmentCard(){
        this.value = this.value.multiply(BigDecimal.valueOf(1.05));
        return this.value;
    }

    @Override
    public String toString() {
        return "Portion{" + "value=" + value.toString() + ", expireDate=" + expireDate + ", dueDate=" + dueDate + ", payment=" + payment + '}';
    }
    
    
    
    
}
