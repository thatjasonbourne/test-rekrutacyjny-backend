package pl.infinite.recruitment.tasks.task1.some.unmodifable.library;

public class Invoice {
	private String someInvoiceContent;

	Invoice(String someInvoiceContent) {
		this.someInvoiceContent = someInvoiceContent;
	}

	public String getSomeInvoiceContent() {
		return someInvoiceContent;
	}
}
