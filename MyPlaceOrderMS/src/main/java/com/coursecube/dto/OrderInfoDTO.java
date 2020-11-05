package com.coursecube.dto;

import java.io.Serializable;
import java.util.List;

public class OrderInfoDTO implements Serializable{
    
	private static final long serialVersionUID = -4604746091153374567L;
	private OrderDTO orderDTO;
    private List<OrderItemDTO>  itemListDTO;

    public OrderInfoDTO() {
    }

	public OrderInfoDTO(OrderDTO orderDTO, List<OrderItemDTO> itemListDTO) {
		super();
		this.orderDTO = orderDTO;
		this.itemListDTO = itemListDTO;
	}

	public OrderDTO getOrderDTO() {
		return orderDTO;
	}

	public void setOrderDTO(OrderDTO orderDTO) {
		this.orderDTO = orderDTO;
	}

	public List<OrderItemDTO> getItemListDTO() {
		return itemListDTO;
	}

	public void setItemListDTO(List<OrderItemDTO> itemListDTO) {
		this.itemListDTO = itemListDTO;
	}

	
}
