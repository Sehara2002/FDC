import java.util.List;

public class Payment {
    private Patient patient;
    private Treatment treatment;
    private String date;
    private Float amount;

    Payment(Patient p, Treatment t, String date, Float amount){
        this.patient = p;
        this.treatment = t;
        this.date = date;
        this.amount = amount;
    }


    void addNewPayment(Patient p, Treatment t, String date, Float amount, List<Payment> paymentList){
        Payment newPayment = new Payment(p, t, date, amount);
        paymentList.add(newPayment);

        System.out.println("Payment added.");
    }
}





