package pl.infinite.recruitment.tasks.task1.some.unmodifable.library;

public class SomeSlowInvoiceRepository implements InvoiceRepository {
	@Override
	public Invoice find(String invoiceNumber) {
		Invoice invoice = someComplicatedAndSlowPersistenceLogic(invoiceNumber);
		return invoice;
	}

	private Invoice someComplicatedAndSlowPersistenceLogic(String invoiceNumber) {
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
		}
		return new Invoice("Some invoice for Playstation; Invoice number: " + invoiceNumber);
	}
}
