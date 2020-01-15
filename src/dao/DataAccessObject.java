package dao;

import java.util.HashMap;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class DataAccessObject {
	private static Logger LOGGER;
	private static DataAccessObject instance = new DataAccessObject();
	private HashMap<String,Double> cuentasPaypal;
	
	public DataAccessObject() {
		BasicConfigurator.configure();
		LOGGER = Logger.getLogger("Logger");
		cuentasPaypal = new HashMap<String,Double>();
		cuentasPaypal.put("dani@gmail.com",2000.0);
		cuentasPaypal.put("inaki@gmail.com",1300.0);
		cuentasPaypal.put("ruben@gmail.com",1200.0);
		cuentasPaypal.put("alberto@gmail.com",1500.0);
	}
	
	public static DataAccessObject getInstance() {
		return instance;
	}

	public void updateCuenta(String id, Double cambio) {
		LOGGER.info("Efectuando cambio en cuenta "+id);
		double nuevoValor = cuentasPaypal.get(id)+cambio;
		cuentasPaypal.replace(id, nuevoValor);
	}
	
	public HashMap<String, Double> getCuentasPaypal() {
		return cuentasPaypal;
	}

	public void setCuentasPaypal(HashMap<String, Double> cuentasPaypal) {
		this.cuentasPaypal = cuentasPaypal;
	}
}
