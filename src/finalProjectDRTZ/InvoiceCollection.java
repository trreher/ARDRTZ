package finalProjectDRTZ;
import java.util.ArrayList;

public class InvoiceCollection {
	
	private ArrayList<Invoice> invoices;

	public Invoices()
	{
		invoices = new ArrayList<Invoice>();
	}
	
	public Invoice find(int _id)
	{
		return null;
	}

	public void addInvoice(Invoice i)
	{
		invoices.add(i);
	}
	
	public void removeInvoice(Invoice i)
	{
		invoices.remove(i);
	}
	
	public double customerInvoiceTotal(int _custId, String begin, String end)
	{
		return 0;
	}

	public double customerOutstandingInvoiceBalance(int _custId, String begin, String end)
	{
		return 0;
	}
	
	public int customerInvoiceCount(int _custId, String begin, String end)
	{
		return 0;
	}
	
	public int customerOpenInvoiceCount(int _custId, String begin, String end)
	{
		return 0;
	}
	
	public int customerClosedInvoiceCount(int _custId, String begin, String end)
	{
		return 0;
	}
}
