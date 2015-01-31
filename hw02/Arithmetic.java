/////////////////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//01/30/2015
//CSE 02 -- hw 02
//Arithmetic java program
//This program is used to compute the cost of items you bought with PA sales tax of 6%.

//define a class
public class Arithmetic{

// add main method
    public static void main (String[] args){
    
    // our input data
    int nSocks=3; // Number of pairs of socks
    double sockCost$=2.58; //Cost per pair of socks ('$' is part of the variable name)
    int nGlasses=6; // Number of drinking glasses
    double glassCost$=2.29; // Cost per glass
    int nEnvelopes=1; // Number of boxes of envelopes
    double envelopCost$=3.25; // cost per box envelopes
    double taxPercent=0.06; // tax per cent
    double totalSockCost$, totalGlassCost$, totalEnvelopCost$; // declare variables of total costs
    double Socktax, Glasstax, Envelopetax; // declare tax variables
    
    System.out.println(nSocks +" socks are brought at the unit cost of " +sockCost$+"."); // print the number of socks bought and unit price of socks
    System.out.println(nGlasses +" glasses are bought at the unit price of " +glassCost$+"."); // print the number of glasses bought and unit price of glasses.
    System.out.println(nEnvelopes +" envelope is bought at the unit price of " +envelopCost$+"."); // print the number of envelop bought and unit price of envelop
    
    // compute the total costs
    totalSockCost$=nSocks*sockCost$; // total cost of socks before tax
    Socktax=totalSockCost$*taxPercent; //sock tax
    totalGlassCost$=nGlasses*glassCost$; // total cost of glasses before tax
    Glasstax=totalGlassCost$*taxPercent; // glass tax
    totalEnvelopCost$=nEnvelopes*envelopCost$; // total cost of envelopes before tax
    Envelopetax=totalEnvelopCost$*taxPercent; //envelope tax
    
    System.out.println("Total cost of sock is " + totalSockCost$ + " and sales tax is " + Socktax + "."); // print the total cost and sale tax of socks
    System.out.println("Total cost of glasses is " + totalGlassCost$ + " and sales tax is " + Glasstax + "."); // print the total glass cost and sale tax of glasses
    System.out.println("Total cost of envelope is " + totalEnvelopCost$ + " and sales tax is " + Envelopetax + "."); // print the total cost and sale tax of envelope
    System.out.println("Total cost of the purchases is " + (totalSockCost$+totalGlassCost$+totalEnvelopCost$) + " and total sales tax is " + (Socktax+Glasstax+Envelopetax) +
    " total cost is " +(totalSockCost$+totalGlassCost$+totalEnvelopCost$+Socktax+Glasstax+Envelopetax) + "."); // print the total costs of the purchaces and sales tax and the total cost
    
    }
    
}