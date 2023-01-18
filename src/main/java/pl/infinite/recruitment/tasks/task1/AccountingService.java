package pl.infinite.recruitment.tasks.task1;

import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.Invoice;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.InvoiceRepository;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.InvoiceService;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.SomeSlowInvoiceRepository;

public class AccountingService {

	private InvoiceService invoiceService;

	public AccountingService() {
		InvoiceRepository repository = new SomeSlowInvoiceRepository();
		this.invoiceService = new InvoiceService(repository);
	}

	/**
	 * this method is called many times for the same invoice numbers
	 * @param invoiceNumber
	 */
	public void process(String invoiceNumber){
		Invoice invoice = invoiceService.getInvoice(invoiceNumber);
		// do something with this invoice
	}
}
