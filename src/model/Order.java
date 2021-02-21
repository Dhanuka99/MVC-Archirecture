package model;

import java.util.List;

public class Order {
    private String orderid;
    private String orderdate;
    private String oderTime;
    private List list;

    public Order() {
    }

    public Order(String orderid, String orderdate, String oderTime, List list) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.oderTime = oderTime;
        this.list = list;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOderTime() {
        return oderTime;
    }

    public void setOderTime(String oderTime) {
        this.oderTime = oderTime;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", oderTime='" + oderTime + '\'' +
                ", list=" + list +
                '}';
    }
}
