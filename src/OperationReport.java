/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class OperationReport {
    
    public boolean status;
    public String reportName;
    public String reportBody;
    
    public OperationReport(boolean status, String reportName, String reportBody){
        this.status = status;
        this.reportName = reportName;
        this.reportBody = reportBody;
    }
}
