package com.recio.aitor;

public class Tarjeta {

	private boolean activated = false;
	private String emisorEntity;
	private long num;
	private int expMonth;
	private int expYear;
	private double money = 1000;
	private String titular;
	
	Tarjeta(String emisorEntity, long num, int expMonth, int expYear, String titular){
		
		this.emisorEntity = emisorEntity;
		this.num = num;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.titular = titular;
	}
	
	void activate() {
		activated = true;
		System.out.println("Tarjeta activada");
	}
	
	void cancel() {
		activated = false;
		System.out.println("Tarjeta cancelada");
	}
	
	void pay(double quantity) {
		if(activated) {
			if(quantity < money) {
				money-=quantity;
				System.out.println("Operación realizada, disfrute de su compra");
			}else {
				System.out.println("La cantidad introducida supera a la quantía actual, operación cancelada");
			}
		}else {
			System.out.println("Active la tarjeta antes de operar con ella");
		}
	}

	public String getEmisorEntity() {
		return emisorEntity;
	}

	public void setEmisorEntity(String emisorEntity) {
		this.emisorEntity = emisorEntity;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean isActivated() {
		return activated;
	}
	
	
}
