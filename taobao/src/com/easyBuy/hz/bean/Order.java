package com.easyBuy.hz.bean;

public class Order {
                private int eo_id;
                private int en_user_id;
                private int eo_create_time;
                private int eo_cost;
                private int eo_type;
                private int eo_status;
				public Order() {
					super();
					// TODO Auto-generated constructor stub
				}
				public Order(int eo_id, int en_user_id, int eo_create_time, int eo_cost, int eo_type, int eo_status) {
					super();
					this.eo_id = eo_id;
					this.en_user_id = en_user_id;
					this.eo_create_time = eo_create_time;
					this.eo_cost = eo_cost;
					this.eo_type = eo_type;
					this.eo_status = eo_status;
				}
				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + en_user_id;
					result = prime * result + eo_cost;
					result = prime * result + eo_create_time;
					result = prime * result + eo_id;
					result = prime * result + eo_status;
					result = prime * result + eo_type;
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
					Order other = (Order) obj;
					if (en_user_id != other.en_user_id)
						return false;
					if (eo_cost != other.eo_cost)
						return false;
					if (eo_create_time != other.eo_create_time)
						return false;
					if (eo_id != other.eo_id)
						return false;
					if (eo_status != other.eo_status)
						return false;
					if (eo_type != other.eo_type)
						return false;
					return true;
				}
				@Override
				public String toString() {
					return "Order [eo_id=" + eo_id + ", en_user_id=" + en_user_id + ", eo_create_time=" + eo_create_time
							+ ", eo_cost=" + eo_cost + ", eo_type=" + eo_type + ", eo_status=" + eo_status + "]";
				}
				public int getEo_id() {
					return eo_id;
				}
				public void setEo_id(int eo_id) {
					this.eo_id = eo_id;
				}
				public int getEn_user_id() {
					return en_user_id;
				}
				public void setEn_user_id(int en_user_id) {
					this.en_user_id = en_user_id;
				}
				public int getEo_create_time() {
					return eo_create_time;
				}
				public void setEo_create_time(int eo_create_time) {
					this.eo_create_time = eo_create_time;
				}
				public int getEo_cost() {
					return eo_cost;
				}
				public void setEo_cost(int eo_cost) {
					this.eo_cost = eo_cost;
				}
				public int getEo_type() {
					return eo_type;
				}
				public void setEo_type(int eo_type) {
					this.eo_type = eo_type;
				}
				public int getEo_status() {
					return eo_status;
				}
				public void setEo_status(int eo_status) {
					this.eo_status = eo_status;
				}
}
