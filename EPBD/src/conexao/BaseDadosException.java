package conexao;

public class BaseDadosException extends Exception {

	private static final long serialVersionUID = 1L;

	public BaseDadosException() {
		super();
	}

	public BaseDadosException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseDadosException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseDadosException(String message) {
		super(message);
	}

	public BaseDadosException(Throwable cause) {
		super(cause);
	}
}