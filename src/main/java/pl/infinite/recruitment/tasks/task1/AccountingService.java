package pl.infinite.recruitment.tasks.task1;

import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.Invoice;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.InvoiceRepository;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.InvoiceService;
import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.SomeSlowInvoiceRepository;

public class AccountingService {

	private InvoiceService invoiceService;

	private final Cache<String, Invoice> invoiceCache;

	public AccountingService() {
		InvoiceRepository repository = new SomeSlowInvoiceRepository();
		this.invoiceService = new InvoiceService(repository);
		this.invoiceCache = new InvoiceCache(); // TODO: replace with DI injection
	}

	/**
	 * this method is called many times for the same invoice numbers
	 * @param invoiceNumber
	 */
	public void process(String invoiceNumber){
		Invoice invoice = invoiceCache.hasValue(invoiceNumber)
				? invoiceCache.get(invoiceNumber)
				: invoiceCache.put(invoiceNumber, invoiceService.getInvoice(invoiceNumber));
		// do something with this invoice
	}

	// TODO: call this method using some scheduler to periodically clear the cache
	public void schedule() {
		invoiceCache.clear();
	}
}
