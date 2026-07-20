/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mhoni
 */
public class SalaryComputationModule {

    public static double computeGrossPay(
            double ratePerDay,
            int daysWorked){

        return ratePerDay * daysWorked;
    }

    public static double computeSSS(
            double grossPay){

        return grossPay * 0.045;
    }

    public static double computePhilHealth(
            double grossPay){

        return grossPay * 0.025;
    }

    public static double computePagIBIG(
            double grossPay){

        return grossPay * 0.02;
    }

    public static double computeWithholdingTax(
            double grossPay){

        return grossPay * 0.10;
    }

    public static double computeDeductions(
            double sss,
            double philhealth,
            double pagibig,
            double tax){

        return sss + philhealth +
               pagibig + tax;
    }

    public static double computeNetPay(
            double grossPay,
            double deductions){

        return grossPay - deductions;
    }

}
