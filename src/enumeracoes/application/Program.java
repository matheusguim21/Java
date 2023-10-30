package enumeracoes.application;

import enumeracoes.entities.Order;
import enumeracoes.enums.OrderStatus;

import java.util.Date;


public class Program {
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.printf(order.toString());

	}
}
