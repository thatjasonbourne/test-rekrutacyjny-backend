package pl.infinite.recruitment.tasks.task1.some.unmodifable.library;

public class InvoiceService {

	private InvoiceRepository repository;

	public InvoiceService(InvoiceRepository repository) {
		this.repository = repository;
	}

	public Invoice getInvoice(String invoiceNumber) {
		// some logic here
		Invoice invoice = repository.find(invoiceNumber);
		// and more logic here
		return invoice;
	}
}
