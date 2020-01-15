package dao;

public class Test {
	public static void main(String[] args) {
		DataAccessObject dao = DataAccessObject.getInstance();
		
		System.out.println(dao.getCuentasPaypal());
		dao.updateCuenta("inaki@gmail.com",-20.35);
		System.out.println(dao.getCuentasPaypal());
	}

}