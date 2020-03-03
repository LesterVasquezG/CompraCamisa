
package fes.ico.clases;

import javax.swing.JOptionPane;

public class Comprar {
    //atributos
    private int cantidadTotal;
    private float totalPago;
    private int cantidadCamisa1;
    private int cantidadCamisa2;
    private int cantidadCamisa3;
    private float cantidadDescontada;
    private int porcentajeDesc;
    private float totalNeto;
    
    //constructor
    public Comprar() {
        
    }
    // getters and setters
    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    public int getCantidadCamisa1() {
        return cantidadCamisa1;
    }

    public void setCantidadCamisa1(int cantidadCamisa1) {
        this.cantidadCamisa1 = cantidadCamisa1;
    }

    public int getCantidadCamisa2() {
        return cantidadCamisa2;
    }

    public void setCantidadCamisa2(int cantidadCamisa2) {
        this.cantidadCamisa2 = cantidadCamisa2;
    }

    public int getCantidadCamisa3() {
        return cantidadCamisa3;
    }

    public void setCantidadCamisa3(int cantidadCamisa3) {
        this.cantidadCamisa3 = cantidadCamisa3;
    }

    public float getCantidadDescontada() {
        return cantidadDescontada;
    }

    public void setCantidadDescontada(float cantidadDescontada) {
        this.cantidadDescontada = cantidadDescontada;
    }

    public float getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public float getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(float totalNeto) {
        this.totalNeto = totalNeto;
    }
    
    
    
    // metodo para hacer descuentos 
    public float calculos(int cantidadTotal, int cantidadCamisa1, int cantidadCamisa2, int cantidadCamisa3){
        this.cantidadTotal=cantidadTotal;
        this.cantidadCamisa1=cantidadCamisa1;
        this.cantidadCamisa2=cantidadCamisa2;
        this.cantidadCamisa3=cantidadCamisa3;
        
        
        totalNeto=(float) ((cantidadCamisa1*190)+(cantidadCamisa2*230)+(cantidadCamisa3*310));
        
        if(this.cantidadTotal<3){            
            totalPago=totalNeto;
            cantidadDescontada=0;
            porcentajeDesc= 0;
        }
        if(this.cantidadTotal>=3 && this.cantidadTotal<=5){
        totalPago=  (float) (totalNeto*0.95);
        cantidadDescontada=(totalNeto)-totalPago;
            porcentajeDesc= 5;
        }
        if(this.cantidadTotal>5){
            totalPago=(float) (totalNeto*0.92);
            cantidadDescontada=totalNeto-totalPago;
            porcentajeDesc= 8;
        }
        return totalPago;
    }
    
    //mteodo para imprimir el total a pagar
    public void mostrarResultados(){
        JOptionPane.showMessageDialog(null, "Total Neto: "+"$ "+this.totalNeto+"\nTotal de Articulos: "+this.cantidadTotal+"\nDescuento ("
                +this.porcentajeDesc+"%):$ "+this.cantidadDescontada+"\nEl total a pagar es: "+"$ "+totalPago);
    }
   
}

        