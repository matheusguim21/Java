package enumeracoes.entities;


import enumeracoes.enums.OrderStatus;

import java.util.Date;

public class Order{
	private Integer Id;
	private Date moment;
	private OrderStatus orderStatus;

	public Order(Integer id, Date data, OrderStatus orderStatus) {
		Id = id;
		this.moment = data;
		this.orderStatus = orderStatus;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getData() {
		return moment;
	}

	public void setData(Date moment) {
		this.moment = moment
		;
	}

	@Override
	public String toString() {
		return "Order{" +
				"Id=" + Id +
				", moment=" + moment +
				", orderStatus=" + orderStatus +
				'}';
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
}
