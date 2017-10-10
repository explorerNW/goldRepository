package com.easyBuy.hz.bean;

public class Product {
               private int ep_id;   //商品ID
               private String ep_name;   //商品名
               private String ep_description;    //品牌
               private String ep_price;             //价格
               private String ep_stock;                   //库存                
               private String ep_file_name;                  //条码
			public int getEp_id() {
				return ep_id;
			}
			public void setEp_id(int ep_id) {
				this.ep_id = ep_id;
			}
			public String getEp_name() {
				return ep_name;
			}
			public void setEp_name(String ep_name) {
				this.ep_name = ep_name;
			}
			public String getEp_description() {
				return ep_description;
			}
			public void setEp_description(String ep_description) {
				this.ep_description = ep_description;
			}
			public String getEp_price() {
				return ep_price;
			}
			public void setEp_price(String ep_price) {
				this.ep_price = ep_price;
			}
			public String getEp_stock() {
				return ep_stock;
			}
			public void setEp_stock(String ep_stock) {
				this.ep_stock = ep_stock;
			}
			public String getEp_file_name() {
				return ep_file_name;
			}
			public void setEp_file_name(String ep_file_name) {
				this.ep_file_name = ep_file_name;
			}
			@Override
			public String toString() {
				return "Product [ep_id=" + ep_id + ", ep_name=" + ep_name + ", ep_description=" + ep_description
						+ ", ep_price=" + ep_price + ", ep_stock=" + ep_stock + ", ep_file_name=" + ep_file_name + "]";
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((ep_description == null) ? 0 : ep_description.hashCode());
				result = prime * result + ((ep_file_name == null) ? 0 : ep_file_name.hashCode());
				result = prime * result + ep_id;
				result = prime * result + ((ep_name == null) ? 0 : ep_name.hashCode());
				result = prime * result + ((ep_price == null) ? 0 : ep_price.hashCode());
				result = prime * result + ((ep_stock == null) ? 0 : ep_stock.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Product other = (Product) obj;
				if (ep_description == null) {
					if (other.ep_description != null)
						return false;
				} else if (!ep_description.equals(other.ep_description))
					return false;
				if (ep_file_name == null) {
					if (other.ep_file_name != null)
						return false;
				} else if (!ep_file_name.equals(other.ep_file_name))
					return false;
				if (ep_id != other.ep_id)
					return false;
				if (ep_name == null) {
					if (other.ep_name != null)
						return false;
				} else if (!ep_name.equals(other.ep_name))
					return false;
				if (ep_price == null) {
					if (other.ep_price != null)
						return false;
				} else if (!ep_price.equals(other.ep_price))
					return false;
				if (ep_stock == null) {
					if (other.ep_stock != null)
						return false;
				} else if (!ep_stock.equals(other.ep_stock))
					return false;
				return true;
			}
			public Product(int ep_id, String ep_name, String ep_description, String ep_price, String ep_stock,
					String ep_file_name) {
				super();
				this.ep_id = ep_id;
				this.ep_name = ep_name;
				this.ep_description = ep_description;
				this.ep_price = ep_price;
				this.ep_stock = ep_stock;
				this.ep_file_name = ep_file_name;
			}
			public Product() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			
               
}